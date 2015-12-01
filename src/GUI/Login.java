package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Login extends JPanel {

    public JFrame frame;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnLogin;
    private JLabel lblUsername;
    private JLabel lblPassword;

    /**
     * Create the application.
     */
    public Login() {

        setLayout(null);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(335, 227, 89, 23);
        add(btnLogin);

        lblUsername = new JLabel("Username");
        lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsername.setBounds(46, 78, 100, 23);
        add(lblUsername);

        textField = new JTextField();
        textField.setBounds(207, 79, 179, 20);
        add(textField);
        textField.setColumns(10);

        lblPassword = new JLabel("Password");
        lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblPassword.setBounds(46, 153, 100, 14);
        add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(207, 153, 179, 20);
        add(passwordField);

        JLabel lblWelcomeToSnake = new JLabel("Welcome to Snake - Please Login");
        lblWelcomeToSnake.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcomeToSnake.setBounds(10, 11, 414, 23);
        add(lblWelcomeToSnake);
    }
    public JTextField getTxtUsername() {
        return textField;
    }

    public JTextField getTxtPassword() {
        return passwordField;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void ClearLogin(){
        textField.setText("");
        passwordField.setText("");
    }


    public void addActionListener(ActionListener l){
        btnLogin.addActionListener(l);
    }
}
