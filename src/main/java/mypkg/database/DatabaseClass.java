package mypkg.database;


import mypkg.Message;
import mypkg.Profile;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

    private static Map<Integer, Message> messages = new HashMap<Integer, Message>();
    private static Map<Integer, Profile> profiles = new HashMap<Integer, Profile>();

    public static Map<Integer, Message> getMessages(){
        return messages;
    }

    public static Map<Integer, Profile> getProfiles(){
        return profiles;
    }
}
