package Logic;

import Model.User;
import SDK.ServerConnection;

import java.awt.*;

/**
 * Created by Sebastian on 30-11-2015.
 */
public class Controls {

    private static ServerConnection serverConnection;

    public Controls(){
        serverConnection = new ServerConnection();
    }

    public boolean deleteGame(User currentUser, Frame frame){
        try {

        }
        catch (Exception e){

        }
        return false;
    }


    public static ServerConnection getServerConnection(){
        return serverConnection;
    }
}

