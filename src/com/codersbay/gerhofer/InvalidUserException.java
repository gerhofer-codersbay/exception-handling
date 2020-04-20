package com.codersbay.gerhofer;

/* this is a checked exception */
public class InvalidUserException extends Exception {

    public InvalidUserException(String message) {
        super(message);
    }

}
