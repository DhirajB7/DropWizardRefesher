package Resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloWordResource {

    @GET
    @Path("/{name}")
    public String greeting(@PathParam("name") String name){
        return "Hello "+name+" !";
    }
}
