package Logic;

import GUI.PanelFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Sebastian on 10-11-2015.
 */
public class ControlInput {




    private PanelFrame frame;

    public ControlInput() {

        frame = new PanelFrame();
        frame.setVisible(true);

    }

    public void run() {
        frame.getLogin().addActionListener(new LoginActionListener());
        frame.getStartMenu().addActionListener(new StartMenuActionListener());
        frame.getHighscore().addActionListener(new HighscoreActionListener());
        frame.getJoinGame().addActionListener(new JoinGameActionListener());
        frame.getPlay().addActionListener(new PlayActionListener());
        frame.getDeletegame().addActionListener(new DeleteGameActionListener());
        frame.show(frame.Login);

    }



    private class LoginActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == frame.getLogin().getBtnLogin()) {
                frame.show(PanelFrame.StartMenu);
            }

        }
    }

    class StartMenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == frame.getStartMenu().getBtnDeleteGame()) {
                frame.show(PanelFrame.StartMenu);

            } else if (e.getSource() == frame.getStartMenu().getBtnHighscore()) {

                frame.show(PanelFrame.Highscore);

            } else if (e.getSource() == frame.getStartMenu().getBtnLogout()) {

                frame.show(PanelFrame.Login);

            } else if (e.getSource() == frame.getStartMenu().getBtnPlaySnake()) {

                frame.show(PanelFrame.Play);

            }

        }
    }
    class HighscoreActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == frame.getHighscore().getBtnBack()){
                frame.show(PanelFrame.Highscore);
            }
        }
    }
    class JoinGameActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == frame.getJoinGame().getBtnBack()){
                frame.show(PanelFrame.StartMenu);
            }
            else if (e.getSource()== frame.getJoinGame()){

            }
            else if (e.getSource() == frame.getJoinGame().getcombobox()){

            }
        }
    }
    class PlayActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()== frame.getPlay().getBtnBack()){
                frame.show(PanelFrame.StartMenu);
            }
            else if (e.getSource()==frame.getJoinGame().getBtnJoinGame()){
                frame.show(PanelFrame.JoinGame);
            }

        }
    }
    class DeleteGameActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()== frame.getDeletegame().getBtnBack()){
                frame.show(PanelFrame.StartMenu);
            }
            else if (e.getSource()== frame.getDeletegame().getBtnDeleteGame()){

            }
        }
    }
}





