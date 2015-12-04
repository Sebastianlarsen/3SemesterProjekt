package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class JoinGame extends JPanel {

    private JFrame frame;
    private JButton btnBack;
    private JButton btnJoinGame;
    private JComboBox combobox;
    private JLabel lblSearchForGames;
    private JLabel lblSetControls;
    private JTextField txtsetControls;
   


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
        btnJoinGame.setBounds(297, 227, 106, 23);
        add(btnJoinGame);

        btnBack = new JButton("Back");
        btnBack.setBounds(190, 227, 89, 23);
        add(btnBack);

        lblSearchForGames = new JLabel("Search for Games");
        lblSearchForGames.setHorizontalAlignment(SwingConstants.CENTER);
        lblSearchForGames.setBounds(10, 143, 124, 14);
        add(lblSearchForGames);

        combobox = new JComboBox();
        combobox.setBounds(150, 134, 129, 32);
        add(combobox);

        lblSetControls = new JLabel("Set Controls");
        lblSetControls.setHorizontalAlignment(SwingConstants.CENTER);
        lblSetControls.setBounds(10, 76, 124, 14);
        add(lblSetControls);

        txtsetControls = new JTextField();
        txtsetControls.setBounds(150, 73, 129, 20);
        add(txtsetControls);
        txtsetControls.setColumns(10);

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

    public JTextField getTxtsetControls() {
        return txtsetControls;
    }

    public void addActionListener(ActionListener l){
        btnJoinGame.addActionListener(l);
        btnBack.addActionListener(l);
        combobox.addActionListener(l);
    }
    public JLabel getLblSearchForGames(){
        return lblSearchForGames;
    }
}



