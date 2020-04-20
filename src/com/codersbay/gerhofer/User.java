package com.codersbay.gerhofer;

public class User {

    private Long id;
    private String name;

    public User(Long id, String name) throws InvalidUserException {
        if (id == null || name == null) {
            throw new InvalidUserException("Name and Id must not be null!");
        }
        if (name.length() < 3 || name.length() > 15) {
            throw new InvalidNameException("Name of User is invalid!");
        }
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
