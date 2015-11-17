package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;


/**
 * Created by Sebastian on 30-10-2015.
 */

public class Login extends JPanel {

    private JTextField txtUsername;
    private JLabel lblPassword;
    private JButton btnLogin;
    private JLabel LoginLabel;
    private JLabel lblUsername;
    private JTextField txtPassword;



    public Login() {

        ScreenSize screenSize = new ScreenSize();

        int screenWidth = screenSize.getScreenWidth();
        int screenHeight = screenSize.getScreenHeight();


        double width = 1*screenWidth;
        double height = 1*screenHeight;

        int txt_width = (int) width;
        int txt_height = (int) height;

        System.out.println(txt_width);
        System.out.println(txt_height);
        setLayout(null);


        lblPassword = new JLabel();
        txtUsername = new JTextField();
        lblUsername = new JLabel("Username");
        LoginLabel = new JLabel("Login");
        txtPassword = new JTextField("Password");
        btnLogin = new JButton("Login");


        setSize(300, 200);
        setLocation(500, 280);
        LoginLabel.setLayout(null);


        lblPassword.setBounds(70, 30, 150, 20);
        txtUsername.setBounds(70, 30, 150, 20);
        lblUsername.setBounds(300, 250, 120, 30);
        LoginLabel.setBounds(400, 150, 70, 30);
        txtPassword.setBounds(200, 60, 200, 50);
        btnLogin.setBounds(350, 600, 160, 30);



        //adding all to the LoginPanel
        LoginLabel.add(lblPassword);
        LoginLabel.add(lblUsername);
        LoginLabel.add(txtUsername);
        LoginLabel.add(txtPassword);
        LoginLabel.add(btnLogin);

    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void addActionListener(ActionListener l){
        btnLogin.addActionListener(l);
    }


}