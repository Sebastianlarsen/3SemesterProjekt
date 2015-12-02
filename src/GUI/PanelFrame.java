package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


/**
 * Created by Sebastian on 16-11-2015.
 */
public class PanelFrame extends JFrame{

    public static final String Deletegame = "Delete Game";
    public static final String Highscore = "Highscore";
    public static final String Play = "Play";
    public static final String Login = "LOGIN";
    public static final String StartMenu = "Start Menu";
    public static final String JoinGame = "Join Game";
    public static final String CreateGame = "Create Game";
    private Login login;
    private DeleteGame deleteGame;
    private CreateGame createGame;
    private Highscore highscore;
    private Play play;
    private JoinGame joinGame;
    private StartMenu startMenu;
    private CardLayout cardLayout;
    private JPanel contentpane;


    public PanelFrame(){
        contentpane = new JPanel();

        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Snake Game");
        setContentPane(contentpane);
        setLayout(null);



        contentpane.setBorder(new EmptyBorder(0, 0, 0, 0));
        contentpane.setLayout(new CardLayout(0, 0));


        deleteGame = new DeleteGame();
        contentpane.add(deleteGame, Deletegame);

        createGame = new CreateGame();
        contentpane.add(createGame, CreateGame);

        login = new Login();
        contentpane.add(login, Login);

        highscore = new Highscore();
        contentpane.add(highscore, Highscore);

        play = new Play();
        contentpane.add(play, Play);

        joinGame = new JoinGame();
        contentpane.add(joinGame, JoinGame);

        startMenu = new StartMenu();
        contentpane.add(startMenu, StartMenu);

        cardLayout = (CardLayout) getContentPane().getLayout();
    }

   public DeleteGame getDeletegame() {
        return deleteGame;
    }

    public CreateGame getCreateGame(){
        return createGame;
    }

   public Highscore getHighscore(){
       return highscore;
   }

    public Play getPlay() {
        return play;
    }

    public Login getLogin() {
        return login;
    }

    public StartMenu getStartMenu() {
        return startMenu;
    }

    public JoinGame getJoinGame() {
        return joinGame;
    }

    public void show(String card){
        cardLayout.show(this.getContentPane(),card);
    }


}



