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

    public void setServerConnection(Socket serverConnection) {
        ServerConnection = serverConnection;
    }

    public ServerConnection(String hostname, int port) {

        this.hostname = hostname;
        this.port = port;
    }

    /**
     *
     * @throws UnknownHostException
     * @throws IOException
     */
    public void connect() throws UnknownHostException, IOException {
        System.out.printf("Trying to connect to" + hostname, ":" + port);
        ServerConnection = new Socket(hostname, port);
        System.out.println("Connection established");
    }

    /**
     *
     * @throws IOException
     */
    public void BufferedReader() throws IOException {
        String userInput;
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(ServerConnection.getInputStream()));


        System.out.println("Response from server");
        while ((userInput = stdIn.readLine()) != null) {
            System.out.println(userInput);

        }
    }


    public void readResponse() throws IOException{
    }
}

