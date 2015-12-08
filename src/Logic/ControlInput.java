package Logic;

import GUI.PanelFrame;
import Model.Games;
import Model.Player;
import Model.User;
import SDK.ServerConnection;
import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Sebastian on 10-11-2015.
 */
public class ControlInput extends NullPointerException{

   /* private static Socket socket;
    private static PrintWriter printWriter;
    private static Scanner sc;
*/

    private PanelFrame frame;
    private User currentUser = new User ();
    private Controls controls;
    private ServerConnection serverConnection;
    private Player player;
    private Games  games;

    public ControlInput()  {

        frame = new PanelFrame();
        frame.setVisible(true);
/**
 * Get the contents from the panelframe, so i can add the actionlisteners
 */
        frame.getLogin().addActionListener(new LoginActionListener());
        frame.getStartMenu().addActionListener(new StartMenuActionListener());
        frame.getHighscore().addActionListener(new HighscoreActionListener());
        frame.getJoinGame().addActionListener(new JoinGameActionListener());
        frame.getPlay().addActionListener(new PlayActionListener());
        frame.getDeletegame().addActionListener(new DeleteGameActionListener());
        frame.getCreateGame().addActionListener(new CreateGameActionListener());

        frame.show(PanelFrame.Login);

        serverConnection = new ServerConnection();
        controls = new Controls();
        player = new Player();
        games = new Games();



    }


    /*public void socketMethod() {
        try {


            socket = new Socket("localhost", 24599);

            printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println(" LOL ");

            sc = new Scanner(System.in);
            printWriter.println("Input: ");
            String string = sc.next();

            printWriter.println(string + " you have written.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }*/

    /**
     * Inner class action listener for login panel
     * if the button login is pressed the you will get to the Startmenu
     */
     private class LoginActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == frame.getLogin().getBtnLogin()) {


                if(login()) {
                    frame.show(PanelFrame.StartMenu);
                    System.out.println(currentUser.getId());
                }
            }
        }
    }



    class StartMenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == frame.getStartMenu().getBtnDeleteGame()) {
                frame.show(PanelFrame.Deletegame);

            } else if (e.getSource() == frame.getStartMenu().getBtnHighscore()) {

                controls.highscore(frame);

                frame.show(PanelFrame.Highscore);

            } else if (e.getSource() == frame.getStartMenu().getBtnLogout()) {

                frame.show(PanelFrame.Login);

            } else if (e.getSource() == frame.getStartMenu().getBtnPlaySnake()) {

                frame.show(PanelFrame.Play);

            }

        }
    }
    class HighscoreActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == frame.getHighscore().getBtnBack()){
                frame.show(PanelFrame.StartMenu);
            }
        }
    }

     class CreateGameActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == frame.getCreateGame().getBtnCreateGame()) {

                if (controls.createGame(frame, player, currentUser)){

                    frame.show(PanelFrame.StartMenu);
                    frame.getCreateGame().clearTxt();
                }

            }
            else if (e.getSource() == frame.getCreateGame().getBtnBack()){

                frame.show(PanelFrame.StartMenu);


            }
        }
    }

    class JoinGameActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Controls controls = new Controls();

            if (e.getSource() == frame.getJoinGame().getBtnBack()){
                frame.show(PanelFrame.Play);

            }
            else if (e.getSource()== frame.getJoinGame().getBtnJoinGame()){
                if(controls.joinGame(frame, games, player, currentUser)) {
                    JOptionPane.showMessageDialog(frame, "YOU WON", "Success!", JOptionPane.INFORMATION_MESSAGE);
                    frame.show(PanelFrame.JoinGame);
                }
                else JOptionPane.showMessageDialog(frame, "Sorry, YOU LOST!", "Failure", JOptionPane.WARNING_MESSAGE);
            }
            else if (e.getSource() == frame.getJoinGame().getTxtsetgameID()){
                games = controls.showGameInfo(frame);

            }
        }
    }


    /**
     * @param
     * @
     */
    class PlayActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()== frame.getPlay().getBtnBack()){
                frame.show(PanelFrame.StartMenu);
            }
            else if (e.getSource()==frame.getPlay().getBtnCreateGame()){
                frame.show(PanelFrame.CreateGame);
            }
            else if (e.getSource()==frame.getPlay().getBtnJoinGame()){
                controls.showOpenGames(frame);
                frame.show(PanelFrame.JoinGame);
            }

        }
    }
    class DeleteGameActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()== frame.getDeletegame().getBtnBack()){
                frame.show(PanelFrame.StartMenu);
            }
            else if (e.getSource()== frame.getDeletegame().getBtnDeleteGame()){
                    if (controls.deleteGame(currentUser, frame)){
                        JOptionPane.showMessageDialog(frame, "Game was deleted!", "Success", JOptionPane.ERROR_MESSAGE );

                        frame.show(PanelFrame.StartMenu);
                    }
                else {
                        frame.show(PanelFrame.Deletegame);
                    }
            }
        }
    }

    /**
     * First you get the username and password, and if they match a user from the database, then you are logged in.
     * convert java object to JSON format, and returned as JSON formatted string
     * @return
     */
    public boolean login(){
        try {
            String username = frame.getLogin().getTxtUsername().getText();
            String password = frame.getLogin().getTxtPassword().getText();

            if(!username.equals("") && !password.equals("")){
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);

                String Json = new Gson().toJson(user);
                String msg = loginParser(serverConnection.post(Json, "login/", frame),user);

                if(msg.equals("Login successful")){

                    currentUser = user;
/**
 * Parsing with the get method from serverconnection, so i can get userID
 */
                    serverConnection.parser(serverConnection.get("users/" + currentUser.getId() + "/"),currentUser);
/**
 * clear the login textfields, so a new user can't get your informations.
 */
                    frame.getLogin().ClearLogin();

                    return true;
                }
                else if(msg.equals("Wrong username or password")){
                    JOptionPane.showMessageDialog(frame, "Wrong username or password",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if (msg.equals("Error in JSON")){
                    JOptionPane.showMessageDialog(frame, "Backend issue",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(frame, "Recheck spelling",
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Converts a JSON string into an object
     * Gets the specified member as a JSONObject
     * @param string
     * @param user
     * @return
     */
    public String loginParser(String string, User user) {
        JSONParser parser = new JSONParser();
        String msg = new String();
        int id = 0;

        try{
            Object objectMsg = parser.parse(string);
            JSONObject jsonObjectMsg = (JSONObject) objectMsg;

            msg =((String)jsonObjectMsg.get("message"));

           System.out.println(msg);
           // if(msg.equals("Login successful")) {
                user.setId((int)(long) jsonObjectMsg.get("userid"));
            //}
            return msg;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}








