package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CreateGame extends JPanel{

    private JFrame frame;
    private JTextField txtGameName;
    private JButton btnCreateGame;
    private JButton btnBack;
    private JLabel lblCreateGame;
    private JLabel lblSetGameName;
    private JLabel lblSetMapsize;
    private JLabel lblSetControls;
    private JTextField txtControls;
    private JTextField txtMapSize;



    /**
     * Create the application.
     */
    public CreateGame() {


    setLayout(null);

        lblCreateGame = new JLabel("Create Game");
        lblCreateGame.setHorizontalAlignment(SwingConstants.CENTER);
        lblCreateGame.setBounds(135, 25, 108, 14);
        add(lblCreateGame);

        lblSetGameName = new JLabel("Set Game Name");
        lblSetGameName.setHorizontalAlignment(SwingConstants.CENTER);
        lblSetGameName.setBounds(20, 50, 118, 14);
        add(lblSetGameName);

        txtGameName = new JTextField();
        txtGameName.setBounds(173, 50, 165, 20);
        add(txtGameName);
        txtGameName.setColumns(10);

        btnCreateGame = new JButton("Create Game");
        btnCreateGame.setBounds(306, 227, 118, 23);
        add(btnCreateGame);

        btnBack = new JButton("Back");
        btnBack.setBounds(193, 227, 89, 23);
        add(btnBack);

        lblSetMapsize = new JLabel("Set MapSize");
        lblSetMapsize.setHorizontalAlignment(SwingConstants.CENTER);
        lblSetMapsize.setBounds(20, 133, 118, 14);
        add(lblSetMapsize);

        lblSetControls = new JLabel("Set Controls");
        lblSetControls.setHorizontalAlignment(SwingConstants.CENTER);
        lblSetControls.setBounds(20, 90, 118, 14);
        add(lblSetControls);

        txtControls = new JTextField();
        txtControls.setBounds(173, 87, 165, 20);
        add(txtControls);
        txtControls.setColumns(10);

        txtMapSize = new JTextField();
        txtMapSize.setBounds(173, 130, 165, 20);
        add(txtMapSize);
        txtMapSize.setColumns(10);
    }

    public JButton getBtnBack() {
        return btnBack;
    }
    public JButton getBtnCreateGame(){
        return btnCreateGame;
    }
    public String getGameName(){
        return txtGameName.getText();
    }
    public String getControls(){
        return txtControls.getText();
    }
    public int getMapSize(){
        return Integer.parseInt(txtMapSize.getText());
    }

    public void addActionListener(ActionListener l){
        btnBack.addActionListener(l);
        btnCreateGame.addActionListener(l);
    }
    public void clearTxt(){

        txtControls.setText("");
        txtGameName.setText("");
        txtMapSize.setText("");
    }
}