package Run;

import GUI.Login;
import Logic.ControlInput;

/**
 * Created by Sebastian on 19-10-2015.
 */

public class Main {


    public static void main(String[] args) {
        try {
            Login window = new Login();
            window.frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ControlInput controlInput = new ControlInput();
        controlInput.run();

    }
}








