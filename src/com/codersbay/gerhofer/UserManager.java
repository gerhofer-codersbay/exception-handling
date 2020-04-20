package com.codersbay.gerhofer;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private static List<User> USERS;

    static {
        try {
            USERS = new ArrayList<>(List.of(
                        new User(1L, "Jordan"),
                        new User(2L, "Brandon"),
                        new User(3L, "Martha"),
                        new User(4L, "Mark"),
                        new User(5L, "Charlotte"),
                        new User(6L, "Joanne")
                ));
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
    }

    public static User findUser(Long id) {
        for (User user : USERS) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public static void addUser(Long id, String name) throws InvalidUserException {
        USERS.add(new User(id, name));
    }

}
