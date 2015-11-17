package GUI;


import javax.swing.*;
import java.awt.event.ActionListener;


 // Created by Sebastian on 10-11-2015.

public class Highscore extends JPanel {

    private JLabel lblHighscore;
    private JLabel lbl1stplace;
    private JLabel lbl1place;
    private JLabel lbl2ndplace;
    private JLabel lbl2place;
    private JLabel lbl3rdplace;
    private JLabel lbl3place;
    private JLabel lbl4thplace;
    private JLabel lbl4place;
    private JLabel lbl5thplace;
    private JLabel lbl5place;
    private JLabel lbl6thplace;
    private JLabel lbl6place;
    private JLabel lbl7thplace;
    private JLabel lbl7place;
    private JButton btnBack;


    public Highscore() {

        setLayout(null);


        lblHighscore = new JLabel("Highscore");
        lbl1stplace = new JLabel("1. place");
        lbl1place = new JLabel(" ");
        lbl2ndplace = new JLabel("2. place");
        lbl2place = new JLabel(" ");
        lbl3rdplace = new JLabel("3. place");
        lbl3place = new JLabel(" ");
        lbl4thplace = new JLabel("4. place");
        lbl4place = new JLabel(" ");
        lbl5thplace = new JLabel("5. place");
        lbl5place = new JLabel(" ");
        lbl6thplace = new JLabel("6. place");
        lbl6place = new JLabel(" ");
        lbl7thplace = new JLabel("7. place");
        lbl7place = new JLabel(" ");
        btnBack = new JButton("Back");


        lblHighscore.setBounds(426, 117, 161, 33);
        lbl1stplace.setBounds(449, 227, 115, 33);
        lbl1place.setBounds(366, 278, 282, 38);
        lbl2ndplace.setBounds(449, 344, 115, 33);
        lbl2place.setBounds(449, 344, 115, 33);
        lbl3rdplace.setBounds(449, 344, 115, 33);
        lbl3place.setBounds(449, 344, 115, 33);
        lbl4thplace.setBounds(449, 344, 115, 33);
        lbl4place.setBounds(449, 344, 115, 33);
        lbl5thplace.setBounds(449, 344, 115, 33);
        lbl5place.setBounds(449, 344, 115, 33);
        lbl6thplace.setBounds(449, 344, 115, 33);
        lbl6place.setBounds(449, 344, 115, 33);
        lbl7thplace.setBounds(449, 344, 115, 33);
        lbl7place.setBounds(449, 344, 115, 33);
        btnBack.setBounds(200, 60, 200, 50);

        add(lblHighscore);
        add(lbl1stplace);
        add(lbl1place);
        add(lbl2ndplace);
        add(lbl2place);
        add(lbl3rdplace);
        add(lbl3place);
        add(lbl4thplace);
        add(lbl4place);
        add(lbl5thplace);
        add(lbl5place);
        add(lbl6thplace);
        add(lbl6place);
        add(lbl7thplace);
        add(lbl7place);

    }

        public JLabel getLblHighscore(){
            return getLblHighscore();
        }
        public JLabel getLbl1stplace(){
            return getLbl1stplace();
        }
        public JLabel getLbl2ndplace(){
            return getLbl2ndplace();
        }
        public JLabel getLbl3rdplace(){
            return getLbl3rdplace();
        }
        public JLabel getLbl4thplace() {
            return getLbl4thplace();
        }
        public JLabel getLbl5thplace(){
            return getLbl5thplace();
        }
        public JLabel getLbl6thplace(){
            return getLbl6thplace();
        }
        public JLabel getLbl7thplace(){
            return getLbl7thplace();
        }
        public JButton getBtnBack(){
            return getBtnBack();
        }
        public void addActionListener(ActionListener l){
            btnBack.addActionListener(l);
        }
}

