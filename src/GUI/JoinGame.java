package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class JoinGame extends JPanel {

    private JFrame frame;
    private JButton BtnBack;
    private JButton BtnJoinGame;
    private JComboBox combobox;
   


    /**
     * Create the application.
     */
    public JoinGame() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblJoinGame = new JLabel("Join Game");
        lblJoinGame.setHorizontalAlignment(SwingConstants.CENTER);
        lblJoinGame.setBounds(121, 24, 124, 14);
        frame.getContentPane().add(lblJoinGame);

        JButton btnJoinGame = new JButton("Join Game");
        btnJoinGame.setBounds(335, 227, 89, 23);
        frame.getContentPane().add(btnJoinGame);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(236, 227, 89, 23);
        frame.getContentPane().add(btnBack);

        JLabel lblSearchForGames = new JLabel("Search for Games");
        lblSearchForGames.setBounds(10, 116, 124, 14);
        frame.getContentPane().add(lblSearchForGames);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(146, 83, 109, 80);
        frame.getContentPane().add(comboBox);

    }
    public JButton getBtnBack(){
        return BtnBack;
    }
    public JButton getBtnJoinGame(){
        return BtnJoinGame;
    }

    public JComboBox getcombobox(){
        return combobox;
    }
    public void addActionListener(ActionListener l){
        BtnJoinGame.addActionListener(l);
        BtnBack.addActionListener(l);
        combobox.addActionListener(l);
    }
}



