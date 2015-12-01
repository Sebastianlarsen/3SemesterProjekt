package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Play extends JPanel {

    private JFrame frame;
    private JButton btnBack;
    private JButton btnJoinGame;
    private JButton btnCreateGame;

    /**
     * Create the application.
     */
    public Play() {
        setLayout(null);

        JLabel lblPlaySnake = new JLabel("Play Snake");
        lblPlaySnake.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlaySnake.setBounds(146, 26, 136, 14);
        add(lblPlaySnake);

        btnJoinGame = new JButton("Join Game");
        btnJoinGame.setBounds(278, 227, 146, 23);
        add(btnJoinGame);

        btnCreateGame = new JButton("Create Game");
        btnCreateGame.setBounds(148, 227, 120, 23);
        add(btnCreateGame);

        btnBack = new JButton("Back");
        btnBack.setBounds(10, 227, 128, 23);
        add(btnBack);
    }
    public JButton getBtnBack(){
        return btnBack;
    }
    public JButton getBtnJoinGame(){
        return btnJoinGame;
    }
    public JButton getBtnCreateGame(){
        return btnCreateGame;
    }
    public void addActionListener(ActionListener l){
        btnJoinGame.addActionListener(l);
        btnBack.addActionListener(l);
        btnCreateGame.addActionListener(l);
    }
}
