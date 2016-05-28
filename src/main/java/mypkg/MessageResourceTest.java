package mypkg;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messagesTest")      //URL to call this method: http://localhost:8080/restservice/webapi/messages     *webapi path is defined in web.xml
public class MessageResourceTest {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Hello jersey!";
    }
}
