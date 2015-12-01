package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class JoinGame extends JPanel {

    private JFrame frame;
    private JButton btnBack;
    private JButton btnJoinGame;
    private JComboBox combobox;
   


    /**
     * Create the application.
     */
    public JoinGame() {

        setLayout(null);

        JLabel lblJoinGame = new JLabel("Join Game");
        lblJoinGame.setHorizontalAlignment(SwingConstants.CENTER);
        lblJoinGame.setBounds(121, 24, 124, 14);
        add(lblJoinGame);

        btnJoinGame = new JButton("Join Game");
        btnJoinGame.setBounds(335, 227, 89, 23);
        add(btnJoinGame);

        btnBack = new JButton("Back");
        btnBack.setBounds(236, 227, 89, 23);
        add(btnBack);

        JLabel lblSearchForGames = new JLabel("Search for Games");
        lblSearchForGames.setBounds(10, 116, 124, 14);
        add(lblSearchForGames);

        combobox = new JComboBox();
        combobox.setBounds(146, 83, 109, 80);
        add(combobox);

    }
    public JButton getBtnBack(){
        return btnBack;
    }
    public JButton getBtnJoinGame(){
        return btnJoinGame;
    }

    public JComboBox getcombobox(){
        return combobox;
    }
    public void addActionListener(ActionListener l){
        btnJoinGame.addActionListener(l);
        btnBack.addActionListener(l);
        combobox.addActionListener(l);
    }
}



