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