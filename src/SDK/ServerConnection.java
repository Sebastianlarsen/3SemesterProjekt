package SDK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Sebastian on 16-11-2015.
 */
public class ServerConnection {

    private String hostname;
    private int port;

    Socket ServerConnection;


    public ServerConnection(String hostname, int port) {

        this.hostname = hostname;
        this.port = port;
    }

    public void connect() throws UnknownHostException, IOException {
        System.out.printf("Trying to connect to" + hostname, ":" + port);
        ServerConnection = new Socket(hostname, port);
        System.out.println("Connection established");
    }

    public void readresponse() throws IOException {
        String userInput;
        BufferedReader stdn = new BufferedReader(new InputStreamReader(ServerConnection.getInputStream()));


        System.out.println("Response from server");
        while ((userInput = stdn.readLine()) != null) {
            System.out.println(userInput);

        }
    }

    /*
        ServerConnection client = new ServerConnection("localhost", 24599);
        //creating an object of Serverconnection
        try {
            //trying to connect to server
            client.connect();
            //if succesfull, read response from server
            client.readresponse();
        } catch (UnknownHostException e) {
            System.err.println("Host unknown. Cannot establish connection");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Cannot establish connection. Server may not be up." + e.getMessage());
            e.printStackTrace();
        }
    }*/
}
