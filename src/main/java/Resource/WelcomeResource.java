package Resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/welcome")
public class WelcomeResource {

    @GET
    public String getMessage(){
        return "Welcome My dear Friend";
    }

    @GET
    @Path("/{data}")
    public String getCustomeMessage(@PathParam("data") String data){
        return "OH...new Message..."+" Welcome "+data;
    }
}
