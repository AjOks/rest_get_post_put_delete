package mypkg.service;


import mypkg.Message;
import mypkg.database.DatabaseClass;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class MessageService{

    Map<Integer, Message> messages = DatabaseClass.getMessages();

    /*private List<Message> listOfMessages = new ArrayList<Message>();
    public List<Message> getAllMessages(){
        Message m1 = new Message(001,"Hello this is message 1", "AJOks");
        Message m2 = new Message(002,"I love Science", "Gabby");
        Message m3 = new Message(003,"A millionaire ... ", "Tony");
        listOfMessages.add(m1);
        listOfMessages.add(m2);
        listOfMessages.add(m3);

        return listOfMessages;
    }*/

    public MessageService(){   /*HashMap(key,value)*/
        messages.put(001,new Message(001,"Hello this is message 1", "AJOks"));
        messages.put(002,new Message(002,"I love Science", "Gabby"));
        messages.put(003,new Message(003,"A millionaire ... ", "Tony"));
    }

    public List<Message> getAllMessages() {
        return new ArrayList<Message>(messages.values());
    }

    public Message getMessage(int id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        message.setMessageId(messages.size() + 1);
        messages.put(message.getMessageId(), message);
        return message;
    }

    public Message updateMessage(Message message) {
        if (message.getMessageId() <= 0) {
            return null;
        }
        messages.put(message.getMessageId(), message);
        return message;
    }

    public Message removeMessage(int id) {
        return messages.remove(id);
    }
}
