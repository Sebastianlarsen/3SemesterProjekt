package Logic;

import GUI.PanelFrame;
import Model.Highscores;
import Model.User;
import SDK.ServerConnection;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.*;

/**
 * Created by Sebastian on 30-11-2015.
 */
public class Controls {

    private JSONParser jsonParser;
    private static ServerConnection serverConnection;

    public Controls(){
        serverConnection = new ServerConnection();
    }


    public boolean deleteGame(User currentUser, PanelFrame frame){
        try {
            int GameId = frame.getDeletegame().getGameID();

            if(GameId !=0){
                String msg = deleteGameParser(serverConnection.Delete("Games/" + GameId), currentUser);

                if(msg.equals("Game was deleted")){
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
    public String deleteGameParser(String string, User currentUser){

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


    public static ServerConnection getServerConnection(){
        return serverConnection;
    }
}

