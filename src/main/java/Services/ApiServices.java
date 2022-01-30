package Services;

import javax.json.JsonObject;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ApiServices {
    String URL = "https://api.megaventory.com/v2017a";
    Client client;
    WebTarget target;
    Invocation.Builder request;

    public void startOperation(String endURL){
        client = ClientBuilder.newClient();
        target = client.target(URL+endURL);
        request = target.request().accept(MediaType.APPLICATION_JSON);
    }
    
    public void endOperation(){
        client.close();
    }

    public Response requestPost(String jsonString,String endURL){
        startOperation(endURL);
        Response post = request.post(Entity.json(jsonString));

        return post;
    }
}
