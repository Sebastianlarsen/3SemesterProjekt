package SDK;

import GUI.PanelFrame;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

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
            clientResponse.getEntity(String.class);
            System.out.println(clientResponse);

            return String.valueOf(clientResponse);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public String post(String json, String path, PanelFrame frame) {

        try {
            Client client = Client.create();

            WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
            ClientResponse ClientResponse = webResource.type("application/json").post(ClientResponse.class, json);

        /*if (response.getStatus() != 200 && response.getStatus() != 201) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }*/
            System.out.println("\nOutput from Server... \n");
            ClientResponse.getEntity(String.class);
            System.out.println(ClientResponse);

            if (ClientResponse != null) {
                return ClientResponse.getEntity(String.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "HTTP failed", "Error", JOptionPane.ERROR_MESSAGE);


        }
        return json;
    }

    public String Delete(String path) {
        try {
            Client client = Client.create();

            WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
            ClientResponse ClientResponse = webResource.type("application/json").post(ClientResponse.class);

            System.out.println("\nOutput from Server... \n");
            ClientResponse.getEntity(String.class);
            System.out.println(ClientResponse);

            return String.valueOf(ClientResponse);

        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }
}

  /*  public  Parser(String Json, User user) {
        JsonParser jsonParser = new JsonParser();

        try {
            Object obj = JsonParser.parser(Json);
            JSONObject jsonObject = (JSONObject) obj;

            user.setEmail((String) jsonObject.get("Email"));
            user.setFirst_name((String) jsonObject.get("FirstName"));
            user.setLast_name((String) jsonObject.get("LastName"));
            user.setStatus((String) jsonObject.get("Active"));
            user.setCreated((String) jsonObject.get("Created"));


        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
    }*/