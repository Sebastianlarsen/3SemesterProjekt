package Logic;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Sebastian on 10-11-2015.
 */
public class ControlInput {

    public Frame frame;

    public ControlInput(){

        frame = new Frame();
        frame.setVisible(true);
    }

    public void run(){

         frame.getLogin().addActionlistener(new LoginActionListener());

    }

    private class LoginActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == frame.getLogin().getLogin().getBtnLogin()){

            }
        }
    }

}
