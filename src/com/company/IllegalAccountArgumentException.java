package com.company;

public class IllegalAccountArgumentException extends Exception {

    private static final long serialVersionUID = 1L;

    public IllegalAccountArgumentException() {
        super("Invalid argument for the Stock class method");
    }

    public IllegalAccountArgumentException(String message) {
        super(message);
    }
}
