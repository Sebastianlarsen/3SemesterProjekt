package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Sebastian on 10-11-2015.
 */
public class Play extends JPanel {
    private JLabel lblPlay;
    private JButton btnBack;
    private JButton btnCreateGame;
    private JButton btnJoinGame;

    public Play (){

        setLayout(null);


        lblPlay = new JLabel("Play Snake");
        btnCreateGame = new JButton("Create Game ");
        btnJoinGame = new JButton("Join Game");
        btnBack = new JButton("Back");


        lblPlay.setBounds(70, 30, 150, 20);
        btnCreateGame.setBounds(70, 30, 150, 20);
        btnJoinGame.setBounds(300, 250, 120, 30);
        btnBack.setBounds(200, 60, 200, 50);


        //adding all to the LoginPanel
        add(lblPlay);
        add(btnCreateGame);
        add(btnJoinGame);
        add(btnBack);

    }

    public JLabel getLblPlay() {
        return lblPlay;
    }

    public JButton getBtnCreateGame() {
        return btnCreateGame;
    }

    public JButton getBtnJoinGame(){
        return btnJoinGame;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void addActionListener(ActionListener l){

        btnCreateGame.addActionListener(l);
        btnJoinGame.addActionListener(l);
        btnBack.addActionListener(l);

    }
}

