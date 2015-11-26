package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Play extends JPanel {

    private JFrame frame;
    private JButton BtnBack;
    private JButton BtnJoinGame;
    private JButton BtnCreateGame;

    /**
     * Create the application.
     */
    public Play() {
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

        JLabel lblPlaySnake = new JLabel("Play Snake");
        lblPlaySnake.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlaySnake.setBounds(146, 26, 136, 14);
        frame.getContentPane().add(lblPlaySnake);

        JButton btnJoinGame = new JButton("Join Game");
        btnJoinGame.setBounds(278, 227, 146, 23);
        frame.getContentPane().add(btnJoinGame);

        JButton btnCreateGame = new JButton("Create Game");
        btnCreateGame.setBounds(148, 227, 120, 23);
        frame.getContentPane().add(btnCreateGame);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(10, 227, 128, 23);
        frame.getContentPane().add(btnBack);
    }
    public JButton getBtnBack(){
        return BtnBack;
    }
    public JButton getBtnJoinGame(){
        return BtnJoinGame;
    }
    public JButton getBtnCreateGame(){
        return BtnCreateGame;
    }
    public void addActionListener(ActionListener l){
        BtnJoinGame.addActionListener(l);
        BtnBack.addActionListener(l);
        BtnCreateGame.addActionListener(l);
    }
}
