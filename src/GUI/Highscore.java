package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Highscore extends JPanel {

    private JFrame frame;
    private JButton btnBack;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lblPlace1;
    private JLabel lblPlace2;
    private JLabel lblPlace3;
    private JLabel lblPlace4;
    private JLabel lblPlace5;
    private JLabel lblPlace6;



    /**
     * Create the frame
     */
    public Highscore() {

        setLayout(null);

        JLabel lblHighscore = new JLabel("Highscore");
        lblHighscore.setHorizontalAlignment(SwingConstants.CENTER);
        lblHighscore.setBounds(198, 22, 89, 22);
        add(lblHighscore);

        lblPlace1 = new JLabel("1. Place");
        lblPlace1.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace1.setBounds(83, 57, 46, 14);
        add(lblPlace1);

        lblPlace2 = new JLabel("2. Place");
        lblPlace2.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace2.setBounds(83, 82, 46, 14);
        add(lblPlace2);

        lblPlace3 = new JLabel("3. Place");
        lblPlace3.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace3.setBounds(83, 107, 46, 14);
        add(lblPlace3);

        lblPlace4 = new JLabel("4. Place");
        lblPlace4.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace4.setBounds(83, 132, 46, 14);
        add(lblPlace4);

        lblPlace5 = new JLabel("5. Place");
        lblPlace5.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace5.setBounds(83, 157, 46, 14);
        add(lblPlace5);

        lblPlace6 = new JLabel("6. Place");
        lblPlace6.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlace6.setBounds(83, 182, 46, 14);
        add(lblPlace6);

        lbl1 = new JLabel("");
        lbl1.setBounds(223, 57, 46, 14);
        add(lbl1);

        lbl2 = new JLabel("");
        lbl2.setBounds(223, 82, 46, 14);
        add(lbl2);

        lbl3 = new JLabel("");
        lbl3.setBounds(223, 107, 46, 14);
        add(lbl3);

        lbl4 = new JLabel("");
        lbl4.setBounds(223, 132, 46, 14);
        add(lbl4);

        lbl5 = new JLabel("");
        lbl5.setBounds(223, 157, 46, 14);
        add(lbl5);

        lbl6 = new JLabel("");
        lbl6.setBounds(223, 182, 46, 14);
        add(lbl6);

        btnBack = new JButton("Back");
        btnBack.setBounds(335, 227, 89, 23);
        add(btnBack);
    }
    public JButton getBtnBack(){
        return btnBack;
    }

    public JLabel getLbl1(){
        return lbl1;
    }
    public JLabel getLbl2(){
        return lbl2;
    }
    public JLabel getLbl3(){
        return lbl3;
    }
    public JLabel getLbl4(){
        return lbl4;
    }
    public JLabel getLbl5(){
        return lbl5;
    }
    public JLabel getLbl6(){
        return lbl6;
    }
    public void addActionListener(ActionListener l){
        btnBack.addActionListener(l);
    }
}