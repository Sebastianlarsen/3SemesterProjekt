package SDK;

import GUI.PanelFrame;
import Model.User;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.*;


public class ServerConnection {


    public ServerConnection() {
        this.hostAddress = "http://localhost";
        this.port = 24599;
    }

    private String hostAddress;
    private int port;

    /*public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public void setPort(int port) {
        this.port = port;
    }*/

    public String getHostAddress() {
        return hostAddress;
    }

    public int getPort() {
        return port;
    }

    /**
     * get method. Receives a string with the path with which to get data from the server. Returns it in the message
     * variable
     * @param path
     * @return
     */
    public String get(String path) {

        try {


            Client client = Client.create();

            WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
            ClientResponse clientResponse = webResource.type("application/json").get(ClientResponse.class);

            System.out.println("\nOutput from Server... \n");
            String output = clientResponse.getEntity(String.class);
            System.out.println(output);


            return output;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Like the get method, it receives a string corresponding to the path from which it will connect with the server.
     * Also it receives data as a String in json format, which it sends to the server. Is done with the ClientResponse
     * object. The string variable message gets the answer from the server and the method returns the string.
     * @param json
     * @param path
     * @param frame
     * @return
     */
    public String post(String json, String path, PanelFrame frame) {

        try {
            Client client = Client.create();

            WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
            ClientResponse ClientResponse = webResource.type("application/json").post(ClientResponse.class, json);

        /*if (ClientResponse.getStatus() != 200 && ClientResponse.getStatus() != 201) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + ClientResponse.getStatus());
        }*/
            System.out.println("\nOutput from Server... \n");
            String output = ClientResponse.getEntity(String.class);
            System.out.println(output);

            if (ClientResponse != null) {
                return output;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "HTTP failed", "Error", JOptionPane.ERROR_MESSAGE);


        }
        return "";
    }

    /**
     * Delete method. Like the get method it receives a path as parameter and uses to connect to the server.
     * @param path
     * @return
     */

    public String delete(String path) {
        try {
            Client client = Client.create();

            WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
            ClientResponse ClientResponse = webResource.type("application/json").delete(ClientResponse.class);

            System.out.println("\nOutput from Server... \n");
            String output = ClientResponse.getEntity(String.class);
            System.out.println(output);

            return output;

        } catch (Exception e) {
            e.printStackTrace();
            return "";

        }
    }

    /**
     * Like the post method, it receives both a path and data, which it sends to the server through the .put method.
     * @param path
     * @param json
     * @return
     */
    public String put(String path, String json){
        try {

            Client client = Client.create();

            WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
            ClientResponse clientResponse = webResource.type("application/json").put(ClientResponse.class, json);

            System.out.println("\nOutput from server ....\n");
            String output = clientResponse.getEntity(String.class);
            System.out.println(output);

            return output;

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Parsing the string and Json, getting the jsonObject.
     * @param Json
     * @param user
     */
   public void parser(String Json, User user)  {
       JSONParser jsonParser = new JSONParser();

       try {
            Object obj = jsonParser.parse(Json);
            JSONObject jsonObject = (JSONObject) obj;

            user.setEmail((String) jsonObject.get("Email"));
            user.setFirstname((String) jsonObject.get("FirstName"));
            user.setLastname((String) jsonObject.get("LastName"));
            user.setStatus((String) jsonObject.get("Active"));
            user.setCreated((String) jsonObject.get("Created"));



        } catch (Exception e) {
           e.printStackTrace();
       }


    }
}