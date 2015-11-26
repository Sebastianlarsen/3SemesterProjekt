package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;

public class DeleteGame extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JButton BtnBack;
    private JButton BtnDeleteGame;



    /**
     * Create the frame.
     */
    public DeleteGame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblDeleteGame = new JLabel("Delete Game");
        lblDeleteGame.setHorizontalAlignment(SwingConstants.CENTER);
        lblDeleteGame.setBounds(69, 51, 95, 14);
        contentPane.add(lblDeleteGame);

        JLabel lblGameID = new JLabel("Insert GameID");
        lblGameID.setHorizontalAlignment(SwingConstants.CENTER);
        lblGameID.setBounds(69, 98, 95, 14);
        contentPane.add(lblGameID);

        textField = new JTextField();
        textField.setText("...");
        textField.setBounds(190, 95, 166, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnDeleteGame = new JButton("Delete Game");
        btnDeleteGame.setBounds(279, 227, 145, 23);
        contentPane.add(btnDeleteGame);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(180, 227, 89, 23);
        contentPane.add(btnBack);
    }
    public JButton getBtnBack(){
        return BtnBack;
    }
    public JButton getBtnDeleteGame(){
        return BtnDeleteGame;
    }
    public void addActionListener(ActionListener l){
        BtnDeleteGame.addActionListener(l);
        BtnBack.addActionListener(l);
    }
}