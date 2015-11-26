package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Login extends JFrame {

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
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(335, 227, 89, 23);
        frame.getContentPane().add(btnLogin);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsername.setBounds(46, 78, 100, 23);
        frame.getContentPane().add(lblUsername);

        textField = new JTextField();
        textField.setBounds(207, 79, 179, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblPassword.setBounds(46, 153, 100, 14);
        frame.getContentPane().add(lblPassword);

        JButton btnCreateUser = new JButton("Create User");
        btnCreateUser.setBounds(207, 227, 118, 23);
        frame.getContentPane().add(btnCreateUser);

        passwordField = new JPasswordField();
        passwordField.setBounds(207, 153, 179, 20);
        frame.getContentPane().add(passwordField);

        JLabel lblWelcomeToSnake = new JLabel("Welcome to Snake - Please Login or Create an User");
        lblWelcomeToSnake.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcomeToSnake.setBounds(10, 11, 414, 23);
        frame.getContentPane().add(lblWelcomeToSnake);
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
    public void addActionListener(ActionListener l){
        btnLogin.addActionListener(l);
    }
}
