package mypkg;


import mypkg.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Path("/messages")
public class MessageResourceController {

    MessageService messageService = new MessageService();

    /*
    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

    @GET
    @Path("/{messageId}/xml")
    @Produces(MediaType.APPLICATION_XML)
    public Message getMessage(@PathParam("messageId") int id) {
        return messageService.getMessage(id);
    }
    */

    /*GET REQUESTS: Reading messages from our local database*/
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

    @GET
    @Path("/{messageId}/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("messageId") int id) {
        return messageService.getMessage(id);
    }

    /*POST REQUEST: Adding a new message to our local database*/
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message addMessage(Message message){
        return messageService.addMessage(message);
    }

    /*PUT: updating a message in our local database*/
    @PUT
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message updateMessage(@PathParam("messageId") int id, Message message) {
        message.setMessageId(id);
        return messageService.updateMessage(message);
    }

    /*DELETE: deleting a message in our local database*/
    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message deleteMessage(@PathParam("messageId") int id) {
        return messageService.removeMessage(id);
    }
}
