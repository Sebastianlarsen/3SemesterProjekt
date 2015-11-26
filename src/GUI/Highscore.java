package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Highscore extends JPanel {

    private JFrame frame;
    private JButton BtnBack;


    /**
     * Create the application.
     */
    public Highscore() {
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

        JLabel lblHighscore = new JLabel("Highscore");
        lblHighscore.setHorizontalAlignment(SwingConstants.CENTER);
        lblHighscore.setBounds(198, 22, 89, 22);
        frame.getContentPane().add(lblHighscore);

        JLabel lblPlace1 = new JLabel("1. Place");
        lblPlace1.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace1.setBounds(83, 57, 46, 14);
        frame.getContentPane().add(lblPlace1);

        JLabel lblPlace2 = new JLabel("2. Place");
        lblPlace2.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace2.setBounds(83, 82, 46, 14);
        frame.getContentPane().add(lblPlace2);

        JLabel lblPlace3 = new JLabel("3. Place");
        lblPlace3.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace3.setBounds(83, 107, 46, 14);
        frame.getContentPane().add(lblPlace3);

        JLabel lblPlace4 = new JLabel("4. Place");
        lblPlace4.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace4.setBounds(83, 132, 46, 14);
        frame.getContentPane().add(lblPlace4);

        JLabel lblPlace5 = new JLabel("5. Place");
        lblPlace5.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace5.setBounds(83, 157, 46, 14);
        frame.getContentPane().add(lblPlace5);

        JLabel lblPlace6 = new JLabel("6. Place");
        lblPlace6.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace6.setBounds(83, 182, 46, 14);
        frame.getContentPane().add(lblPlace6);

        JLabel lbl1 = new JLabel("");
        lbl1.setBounds(223, 57, 46, 14);
        frame.getContentPane().add(lbl1);

        JLabel lbl2 = new JLabel("");
        lbl2.setBounds(223, 82, 46, 14);
        frame.getContentPane().add(lbl2);

        JLabel lbl3 = new JLabel("");
        lbl3.setBounds(223, 107, 46, 14);
        frame.getContentPane().add(lbl3);

        JLabel lbl4 = new JLabel("");
        lbl4.setBounds(223, 132, 46, 14);
        frame.getContentPane().add(lbl4);

        JLabel lbl5 = new JLabel("");
        lbl5.setBounds(223, 157, 46, 14);
        frame.getContentPane().add(lbl5);

        JLabel lbl6 = new JLabel("");
        lbl6.setBounds(223, 182, 46, 14);
        frame.getContentPane().add(lbl6);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(335, 227, 89, 23);
        frame.getContentPane().add(btnBack);
    }
    public JButton getBtnBack(){
        return BtnBack;
    }

    public void addActionListener(ActionListener l){
        BtnBack.addActionListener(l);
    }
}