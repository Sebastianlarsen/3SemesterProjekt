package GUI;

import javax.swing.*;

/**
 * Created by Sebastian on 30-10-2015.
 */
public class CreateGame extends JPanel{
    private JLabel lblCreateGame;
    private JLabel lblSetName;

    public CreateGame(){

        setLayout(null);

        lblCreateGame = new JLabel("Create Game");
        lblSetName = new JLabel("Set game name");

        lblCreateGame.setBounds(100,200,333,444);
        lblSetName.setBounds(100,200,333,444);

        add(lblCreateGame);
        add(lblSetName);

    }

    public JLabel getLblSetName(){
        return lblSetName;
    }

    public JLabel getLblCreateGame() {
        return lblCreateGame;
    }
}
