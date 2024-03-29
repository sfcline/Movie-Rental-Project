/*
 * Movie Rental Project. Software Engineering Fundamentals. Fall 2019. Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */
package com.company;

public class User {
    private static String username = ""; // Test Username
    private static String password = ""; // Test Password
    private static boolean passwordStatus;

    /////////// Setters//////////////
    public void setUsername(String input) {
        username = input;
    }

    public void setPassword(String input) {
        password = input;
    }

    /////////// Getters//////////////
    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    /////// Helper Methods/////////////

    // tests user entered PW and UN to previously saved UN and PW and returns t/f
    public static Boolean isGoodPassword(String un, String pw) {
        passwordStatus = un.equals(getUsername()) && pw.equals(getPassword());
        return passwordStatus;
    } // end isGoodPassword

    /////// Helper Methods/////////////

    // tests user entered PW and UN to previously saved UN and PW and returns t/f
    Boolean isGoodPassword() {
        passwordStatus = username.equals(getUsername()) && password.equals(getPassword());
        return passwordStatus;
    } // end isGoodPassword

    // checks if user has signed in based on passwordStatus
    public static Boolean hasSignedIn() {
        return passwordStatus;
    }
}
