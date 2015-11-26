package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class StartMenu extends JPanel {

    private JFrame frame;
    private JButton BtnHighscore;
    private JButton BtnPlaySnake;
    private JButton BtnLogout;
    private JButton BtnDeleteGame;

    /**
     * Create the application.
     */
    public StartMenu() {
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

        JLabel lblStartMenu = new JLabel("Start Menu");
        lblStartMenu.setHorizontalAlignment(SwingConstants.CENTER);
        lblStartMenu.setBounds(172, 30, 130, 14);
        frame.getContentPane().add(lblStartMenu);

        JButton btnHighscore = new JButton("Highscore");
        btnHighscore.setBounds(45, 55, 139, 23);
        frame.getContentPane().add(btnHighscore);

        JButton btnPlaySnake = new JButton("Play Snake");
        btnPlaySnake.setBounds(45, 104, 139, 23);
        frame.getContentPane().add(btnPlaySnake);

        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(45, 196, 139, 23);
        frame.getContentPane().add(btnLogout);

        JButton btnDeleteGame = new JButton("Delete Game");
        btnDeleteGame.setBounds(45, 151, 139, 23);
        frame.getContentPane().add(btnDeleteGame);
    }
    public JButton getBtnHighscore(){
        return BtnHighscore;
    }
    public JButton getBtnPlaySnake(){
        return BtnPlaySnake;
    }
    public JButton getBtnLogout(){
        return BtnLogout;
    }
    public JButton getBtnDeleteGame(){
        return BtnDeleteGame;
    }
    public void addActionListener(ActionListener l){
        BtnHighscore.addActionListener(l);
        BtnPlaySnake.addActionListener(l);
        BtnLogout.addActionListener(l);
        BtnDeleteGame.addActionListener(l);
    }
}



