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
    private Login login;
    private DeleteGame deleteGame;
    private Highscore highscore;
    private Play play;
    private JoinGame joinGame;
    private StartMenu startMenu;
    private CardLayout cardLayout;

    public PanelFrame(){
        JPanel panel = new JPanel();
        ScreenSize screenSize = new ScreenSize();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(2000,3000);
        setTitle("Snake Client");
        setLocationRelativeTo(null);

        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(new CardLayout(0, 0));


        deleteGame = new DeleteGame();
        panel.add(deleteGame, Deletegame);

        login = new Login();
        panel.add(login, Login);

        highscore = new Highscore();
        panel.add(highscore, Highscore);

        play = new Play();
        panel.add(play, Play);

        joinGame = new JoinGame();
        panel.add(joinGame, JoinGame);

        startMenu = new StartMenu();
        panel.add(startMenu, StartMenu);

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
