package Run;

import Logic.ControlInput;
import SDK.ServerConnection;

import java.io.IOException;
import java.net.UnknownHostException;

/**
 * Created by Sebastian on 19-10-2015.
 */

public class Main {


      public static void main(String[] args) {

          ServerConnection client = new ServerConnection ("localhost",9990);
          try {
              //trying to establish connection to the server
              client.connect();
              //if successful, read response from server
              client.readResponse();

          } catch (UnknownHostException e) {
              System.err.println("Host unknown. Cannot establish connection");
          } catch (IOException e) {
              System.err.println("Cannot establish connection. Server may not be up."+e.getMessage());
              e.printStackTrace();
          }
      }
                  ControlInput controlInput = new ControlInput();

              }






