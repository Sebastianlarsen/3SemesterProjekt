package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Sebastian on 10-11-2015.
 */
public class StartMenu extends JPanel{
    private JLabel lblStartMenu;
    private JButton btnLogout;
    private JButton btnDeletegame;
    private JButton btnHighscore;
    private JButton btnPlay;


    public StartMenu () {

        setLayout(null);



        lblStartMenu = new JLabel("Start Menu");
        btnPlay = new JButton("Play Snake");
        btnHighscore = new JButton("Highscore");
        btnDeletegame = new JButton("Delete Game");
        btnLogout = new JButton("Logout");


        lblStartMenu.setBounds(70, 30, 150, 20);
        btnPlay.setBounds(70, 30, 150, 20);
        btnHighscore.setBounds(70, 30, 150, 20);
        btnDeletegame.setBounds(400, 150, 70, 30);
        btnLogout.setBounds(200, 60, 200, 50);



        add(lblStartMenu);
        add(btnPlay);
        add(btnHighscore);
        add(btnDeletegame);
        add(btnLogout);

    }


    public JLabel getlblStartMenu() {
        return lblStartMenu;
    }

    public JButton getBtnPlay() {
        return btnPlay;
    }

    public JButton getBtnHigscore() {
        return btnHighscore;
    }

    public JButton getBtnDeletegame() {
        return btnDeletegame;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

    public void addActionListener(ActionListener l){

        btnPlay.addActionListener(l);
        btnHighscore.addActionListener(l);
        btnDeletegame.addActionListener(l);
        btnLogout.addActionListener(l);

    }


}


