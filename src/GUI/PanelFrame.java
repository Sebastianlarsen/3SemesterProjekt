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
    public static final String Login = "Login";
    public static final String StartMenu = "Start Menu";
    public static final String JoinGame = "Join Game";
    private JPanel Panel;
    private Login login;
    private DeleteGame deleteGame;
    private Highscore highscore;
    private Play play;
    private JoinGame joinGame;
    private StartMenu startMenu;
    private CardLayout cardLayout;

    public PanelFrame(){
        Panel = new JPanel();
        ScreenSize screenSize = new ScreenSize();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Panel);
        setSize(screenSize.getScreenWidth(),screenSize.getScreenHeight());
        setTitle("Snake Client");
        setLocationRelativeTo(null);

        Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        Panel.setLayout(new CardLayout(0,0));


        deleteGame = new DeleteGame();
        Panel.add(deleteGame, Deletegame);

        login = new Login();
        Panel.add(login, Login);

        highscore = new Highscore();
        Panel.add(highscore, Highscore);

        play = new Play();
        Panel.add(play, Play);

        joinGame = new JoinGame();
        Panel.add(joinGame, JoinGame);

        startMenu = new StartMenu();
        Panel.add(startMenu, StartMenu);

        cardLayout = (CardLayout) getContentPane().getLayout();
    }

    public DeleteGame getDeletegame() {
        return deleteGame;
    }

    public Highscore getHighscore() {
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
