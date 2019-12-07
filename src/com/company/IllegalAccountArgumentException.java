/*
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */
package com.company;

/**
 * Illegal Account Argument Exception. Thrown when a parameter doesn't meet the requirements in
 * Account and its children.
 */
public class IllegalAccountArgumentException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Default Illegal Account Argument Exception.
     */
    public IllegalAccountArgumentException() {
        super("Invalid argument for the Stock class method");
    }

    /**
     * Custom Messae Illegal Account Argument Exception.
     *
     * @param message The message that the Exception will display.
     */
    public IllegalAccountArgumentException(String message) {
        super(message);
    }
}
