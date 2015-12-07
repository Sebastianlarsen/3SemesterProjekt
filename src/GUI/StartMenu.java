package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class StartMenu extends JPanel {

    private JFrame frame;
    private JLabel lblStartMenu;
    private JButton btnHighscore;
    private JButton btnPlaySnake;
    private JButton btnLogout;
    private JButton btnDeleteGame;

    /**
     * Create the frame.
     */
    public StartMenu() {
        setLayout(null);

        lblStartMenu = new JLabel("Start Menu");
        lblStartMenu.setHorizontalAlignment(SwingConstants.CENTER);
        lblStartMenu.setBounds(172, 30, 130, 14);
        add(lblStartMenu);

        btnHighscore = new JButton("Highscore");
        btnHighscore.setBounds(45, 55, 139, 23);
        add(btnHighscore);

        btnPlaySnake = new JButton("Play Snake");
        btnPlaySnake.setBounds(45, 104, 139, 23);
        add(btnPlaySnake);

        btnLogout = new JButton("Logout");
        btnLogout.setBounds(45, 196, 139, 23);
        add(btnLogout);

        btnDeleteGame = new JButton("Delete Game");
        btnDeleteGame.setBounds(45, 151, 139, 23);
        add(btnDeleteGame);
    }
    public JButton getBtnHighscore(){
        return btnHighscore;
    }
    public JButton getBtnPlaySnake(){
        return btnPlaySnake;
    }
    public JButton getBtnLogout(){
        return btnLogout;
    }
    public JButton getBtnDeleteGame(){
        return btnDeleteGame;
    }
    public void addActionListener(ActionListener l){
        btnHighscore.addActionListener(l);
        btnPlaySnake.addActionListener(l);
        btnLogout.addActionListener(l);
        btnDeleteGame.addActionListener(l);
    }
}



