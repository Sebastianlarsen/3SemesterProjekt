package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Sebastian on 10-11-2015.
 */
public class JoinGame extends JPanel{
    private JButton BtnBack;
    private JLabel LblJoinGame;
    private JLabel LblSearch;
    private JButton BtnJoinGame;


    public JoinGame () {

        setLayout(null);


        LblJoinGame = new JLabel("Join game");
        LblSearch = new JLabel("Search for games.. ");
        BtnBack = new JButton("Back");
        BtnJoinGame = new JButton("Join Game");


        LblSearch.setBounds(70, 30, 150, 20);
        LblJoinGame.setBounds(70, 30, 150, 20);
        BtnJoinGame.setBounds(300, 250, 120, 30);
        BtnBack.setBounds(200, 60, 200, 50);


        //adding all to the LoginPanel
        add(LblSearch);
        add(LblJoinGame);
        add(BtnBack);
        add(BtnJoinGame);

    }

    public JButton getBtnDelete() {
        return BtnJoinGame;
    }

    public JButton getBtnBack() {
        return BtnBack;
    }

    public void addActionListener(ActionListener l){

        BtnJoinGame.addActionListener(l);
        BtnBack.addActionListener(l);

    }
}



