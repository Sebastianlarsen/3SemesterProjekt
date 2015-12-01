package Run;

import Logic.ControlInput;

import java.awt.*;

/**
 * Created by Sebastian on 19-10-2015.
 */

public class Main {


    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                   // Login window = new Login();
                    //window.frame.setVisible(true);


                } catch (Exception e) {
                    e.printStackTrace();
                }

                ControlInput controlInput = new ControlInput();

            }
        });
    }
}














