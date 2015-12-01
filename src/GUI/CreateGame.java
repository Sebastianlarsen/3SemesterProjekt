package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CreateGame extends JPanel{

    private JFrame frame;
    private JTextField textField;
    private JButton btnCreateGame;
    private JButton btnBack;


    /**
     * Create the application.
     */
    public CreateGame() {


    setLayout(null);

        JLabel lblCreateGame = new JLabel("Create Game");
        lblCreateGame.setHorizontalAlignment(SwingConstants.CENTER);
        lblCreateGame.setBounds(65, 66, 108, 14);
        add(lblCreateGame);

        JLabel lblSetGameName = new JLabel("Set Game Name");
        lblSetGameName.setHorizontalAlignment(SwingConstants.CENTER);
        lblSetGameName.setBounds(65, 111, 118, 14);
        add(lblSetGameName);

        textField = new JTextField();
        textField.setBounds(193, 108, 165, 20);
        add(textField);
        textField.setColumns(10);

        btnCreateGame = new JButton("Create Game");
        btnCreateGame.setBounds(306, 227, 118, 23);
        add(btnCreateGame);

        btnBack = new JButton("Back");
        btnBack.setBounds(193, 227, 89, 23);
        add(btnBack);
    }

    public JButton getBtnBack() {
        return btnBack;
    }
    public JButton getBtnCreateGame(){
        return btnCreateGame;
    }
    public void addActionListener(ActionListener l){
        btnBack.addActionListener(l);
        btnCreateGame.addActionListener(l);
    }
}