package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class DeleteGame extends JPanel {

    private JPanel contentPane;
    private JTextField textField;
    private JLabel lblGameID;
    private JLabel lblDeleteGame;
    private JButton btnBack;
    private JButton btnDeleteGame;



    /**
     * Create the frame.
     */
    public DeleteGame() {

        setLayout(null);

        lblDeleteGame = new JLabel("Delete Game");
        lblDeleteGame.setHorizontalAlignment(SwingConstants.CENTER);
        lblDeleteGame.setBounds(69, 51, 95, 14);
        add(lblDeleteGame);

        lblGameID = new JLabel("Insert GameID");
        lblGameID.setHorizontalAlignment(SwingConstants.CENTER);
        lblGameID.setBounds(69, 98, 95, 14);
        add(lblGameID);

        textField = new JTextField();
        textField.setText("");
        textField.setBounds(190, 95, 166, 20);
        add(textField);
        textField.setColumns(10);

        btnDeleteGame = new JButton("Delete Game");
        btnDeleteGame.setBounds(279, 227, 145, 23);
        add(btnDeleteGame);

        btnBack = new JButton("Back");
        btnBack.setBounds(180, 227, 89, 23);
        add(btnBack);
    }
    public int  getGameID() {
        return Integer.parseInt(lblGameID.getText());
    }
    public void clearTxt() {
        textField.setText("");
    }
    public JButton getBtnBack(){
        return btnBack;
    }
    public JButton getBtnDeleteGame(){
        return btnDeleteGame;
    }
    public void addActionListener(ActionListener l){
        btnDeleteGame.addActionListener(l);
        btnBack.addActionListener(l);
    }

}