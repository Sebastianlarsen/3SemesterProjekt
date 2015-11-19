package Logic;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Sebastian on 10-11-2015.
 */
public class ControlInput {

    public Frame frame;

    public ControlInput() {

        frame = new Frame();
        frame.setVisible(true);


        frame.getPanelFrame().getLogin().addActionlistener(new LoginActionListener());


        class LoginActionListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == frame.getPanelFrame().getLogin().getBtnLogin()) {
                    frame.getPanelFrame().getCardLayout().show(frame.getPanelFrame(), getPanelFrame().getStartMenu);

                }
            }
        }

    }

    private class LoginActionListener {
    }
}


