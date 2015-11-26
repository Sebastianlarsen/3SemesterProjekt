package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CreateGame extends JPanel{

    private JFrame frame;
    private JTextField textField;
    private JButton BtnCreateGame;
    private JButton btnBack;


    /**
     * Create the application.
     */
    public CreateGame() {
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

        JLabel lblCreateGame = new JLabel("Create Game");
        lblCreateGame.setHorizontalAlignment(SwingConstants.CENTER);
        lblCreateGame.setBounds(65, 66, 108, 14);
        frame.getContentPane().add(lblCreateGame);

        JLabel lblSetGameName = new JLabel("Set Game Name");
        lblSetGameName.setHorizontalAlignment(SwingConstants.CENTER);
        lblSetGameName.setBounds(65, 111, 118, 14);
        frame.getContentPane().add(lblSetGameName);

        textField = new JTextField();
        textField.setBounds(193, 108, 165, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnCreateGame = new JButton("Create Game");
        btnCreateGame.setBounds(306, 227, 118, 23);
        frame.getContentPane().add(btnCreateGame);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(193, 227, 89, 23);
        frame.getContentPane().add(btnBack);
    }

    public JButton getBtnBack() {
        return btnBack;
    }
    public JButton getBtnCreateGame(){
        return BtnCreateGame;
    }
    public void addActionListener(ActionListener l){
        btnBack.addActionListener(l);
        BtnCreateGame.addActionListener(l);
    }
}