package Logic;

import GUI.PanelFrame;
import Model.Games;
import Model.Highscores;
import Model.Player;
import Model.User;
import SDK.ServerConnection;
import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.*;

/**
 * Created by Sebastian on 30-11-2015.
 */
public class Controls {

    private JSONParser jsonParser;
    private static ServerConnection serverConnection;
    private Player player;

    public Controls(){
        serverConnection = new ServerConnection();
    }

    /**
     * Gets th gameID of the game that shall deletes
     * @param currentUser
     * @param frame
     * @return
     */
    public boolean deleteGame(User currentUser, PanelFrame frame){
        try {
            int GameId = frame.getDeletegame().getGameID();

            if(GameId !=0){
                String msg = deleteGameParser(serverConnection.delete("games/" + GameId));

                if(msg.equals("Game was deleted")){

                    frame.getDeletegame().clearDeleteGame();

                    return true;

                }
                else if (msg.equals("Failed. Game was not deleted")){
                    JOptionPane.showMessageDialog(frame, "Wrong GameID", "Error", JOptionPane.ERROR_MESSAGE );
                }

            }


        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Issue in Backend", "Error", JOptionPane.ERROR_MESSAGE);

        }
        return false;
    }

    /**
     * Converts a JSON string into an object
     * @param string
     * @return
     */
    public String deleteGameParser(String string){

        JSONParser jsonParser = new JSONParser();
        String msg = new String();

        try {
            Object object = jsonParser.parse(string);
            JSONObject jsonObject = (JSONObject) object;

            msg = ((String) jsonObject.get("message"));

        }catch (Exception e){
            e.printStackTrace();

        }

        return msg;
    }

    /**
     * You get the labels and set the texts and then get the places where the score is.
     * @param frame
     */
    public void highscore(PanelFrame frame){


        try {
            Highscores highscores = highscoreParser(serverConnection.get("scores/"));


            frame.getHighscore().getLbl1().setText(String.valueOf(highscores.getPlace1()));
            frame.getHighscore().getLbl2().setText(String.valueOf(highscores.getPlace2()));
            frame.getHighscore().getLbl3().setText(String.valueOf(highscores.getPlace3()));
            frame.getHighscore().getLbl4().setText(String.valueOf(highscores.getPlace4()));
            frame.getHighscore().getLbl5().setText(String.valueOf(highscores.getPlace5()));
            frame.getHighscore().getLbl6().setText(String.valueOf(highscores.getPlace6()));
        }catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Issue in HTTP",
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    /**
     * Converts a JSON string into an object
     * Gets the specified place as a JSONObject and then sets the place.
     * @param string
     * @return
     */
    public Highscores highscoreParser(String string){
        JSONParser jsonParser = new JSONParser();
        long place1;
        long place2;
        long place3;
        long place4;
        long place5;
        long place6;

        try {
            Object object = jsonParser.parse(string);
            JSONObject jsonObject = (JSONObject) object;

            place1 = ((long)jsonObject.get("place1"));
            place2 = ((long)jsonObject.get("place2"));
            place3 = ((long)jsonObject.get("place3"));
            place4 = ((long)jsonObject.get("place4"));
            place5 = ((long)jsonObject.get("place5"));
            place6 = ((long)jsonObject.get("place6"));

            Highscores highscores = new Highscores();

            highscores.setPlace1(place1);
            highscores.setPlace2(place2);
            highscores.setPlace3(place3);
            highscores.setPlace4(place4);
            highscores.setPlace5(place5);
            highscores.setPlace6(place6);

            return highscores;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Gets the name, MapSize and controls of the host.
     * then it creates a new game, by setting Id, controls, name and size.
     * @param frame
     * @param player
     * @param currentUser
     * @return
     */
        public boolean createGame(PanelFrame frame, Player player, User currentUser ) {

        try {
            String GameName = frame.getCreateGame().getGameName();
            int MapSize = frame.getCreateGame().getMapSize();
            String Controls = frame.getCreateGame().getControls();

            if (!GameName.equals("")&& MapSize !=0 && !Controls.equals("")) {

                Games games = new Games();

                player.setId(currentUser.getId());
                player.setControls(Controls);
                games.setName(GameName);
                games.setMapSize(MapSize);
                games.setHost(player);

                String json = new Gson().toJson(games);
                String msg = createGameParser(serverConnection.post(json, "games/", frame));
                if (msg.equals(games.getName())) {
                    JOptionPane.showMessageDialog(frame, "Game was created!\nIt's called " + games.getName(), "Success!", JOptionPane.INFORMATION_MESSAGE);

                    frame.getCreateGame().clearTxt();

                    return true;
                } else if (msg.equals("Error in JSON") || msg.equals("something went wrong")) {
                    JOptionPane.showMessageDialog(frame, "se inputtet", "Error", JOptionPane.ERROR_MESSAGE);
                }
                    else System.out.println("Error Error");
            }
        }catch (Exception e){
            e.printStackTrace();

        }
       return false;
        }

    /**
     * Converts a JSON string into an object
     * Gets the specified name as a JSONObject
     * @param string
     * @return
     */
    public String createGameParser (String string) {

        JSONParser jsonParser = new JSONParser();
        String GameName = new String();

        try {
            Object object = jsonParser.parse(string);
            JSONObject jsonObject = (JSONObject) object;

            GameName = ((String) jsonObject.get("name"));
            Games games = new Games();

            games.setName(GameName);

            return GameName;

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    /**
     * Gets the gameName from the label, so i can select the game in the combobox
     * @param frame
     * @return
     */
    public Games showGameInfo(PanelFrame frame){
        try {
            /**
             * i*m parsing an int to a string, else it can be read
             */
            int msg = Integer.parseInt(frame.getJoinGame().getTxtsetgameID().toString());
            Games games = getGame(serverConnection.get("game/" + msg +"/"));

            frame.getJoinGame().getLblSearchForGames().setText("Game name: " + games.getName());

            return games;


        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Adding all the Items to the Combobox, and then it will  show the names of the open games.
     * @param frame
     */
    public void showOpenGames(PanelFrame frame){

        try {
            Games[] games1 = openGamesParser(serverConnection.get("games/open/"));

            for (Games ga : games1) {

                frame.getJoinGame().getTxtsetgameID();

                System.out.println(ga.getId() + ":\t" + ga.getName());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Getting the games and converting it from JSon.
     * @param string
     * @return
     */
    public Games getGame(String string){
        try {

            Gson gson = new Gson();

            Games games = gson.fromJson(string, Games.class);

            return games;

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Converts from a Json
     * @param string
     * @return
     */
    public Games[] openGamesParser(String string){
        try {
            Gson gson = new Gson();

            Games[] game1 = gson.fromJson(string, Games[].class);

            return game1;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Getting the controls from the opponent, then getting the GameID.
     * Sets the ID, controls and opponent.
     * Then it finds the winner of the game
     * @param frame
     * @param games
     * @param player
     * @param currentUser
     * @return
     */
    public boolean joinGame(PanelFrame frame, Games games, Player player, User currentUser){
        Gson gson;

        try {
            gson = new Gson();

            String controls = frame.getJoinGame().getTxtsetControls().getText();

            if(!controls.equals("")){
                System.out.println(games.getId());
                player.setId(currentUser.getId());
                player.setControls(controls);
                games.setOpponent(player);

                String json = gson.toJson(games);

                String msg = deleteGameParser(serverConnection.put("games/join/", json));

                if (msg.equals("Game was joined")){

                    Games games1 = getGame(getServerConnection().put("games/start/", json));

                    System.out.println(games.getWinner());

                    return games1.getWinner().getWinner();
                }
                else if(msg.equals("Games closed")){
                    JOptionPane.showMessageDialog(frame, "ERROR in Json", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static ServerConnection getServerConnection(){
        return serverConnection;
    }
}

