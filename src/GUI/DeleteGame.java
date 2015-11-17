package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Sebastian on 30-10-2015.
 */
public class DeleteGame extends JPanel {

    private JLabel lblDeleteGame;
    private JLabel lblinsertGameID;
    private JTextField txtGameID;
    private JButton btnDelete;
    private JButton btnBack;

    public DeleteGame () {

        setLayout(null);


        lblDeleteGame = new JLabel("Delete Game");
        lblinsertGameID = new JLabel("Insert GameID");
        txtGameID = new JTextField();
        btnBack = new JButton("Back");
        btnDelete = new JButton("Delete");


        lblDeleteGame.setBounds(70, 30, 150, 20);
        lblinsertGameID.setBounds(70, 30, 150, 20);
        txtGameID.setBounds(300, 250, 120, 30);
        btnDelete.setBounds(400, 150, 70, 30);
        btnBack.setBounds(200, 60, 200, 50);


        //adding all to the LoginPanel
        add(lblDeleteGame);
        add(lblinsertGameID);
        add(txtGameID);
        add(btnBack);
        add(btnDelete);

    }

        public JTextField getTxtGameID() {
            return txtGameID;
        }

        public JButton getBtnDelete() {
            return btnDelete;
        }

        public JButton getBtnBack() {
            return btnBack;
        }

        public void addActionListener(ActionListener l){

            btnDelete.addActionListener(l);
            btnBack.addActionListener(l);

    }
}
