/*
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */
package com.company;

/**
 * Admin class, extends Account class. Created for internal Administrators of the company who
 * require additional control over traditional users.
 */
public class Admin extends Account {

    private int adminID;

    /**
     * Seven parameter constructor to create and Administrator Account.
     *
     * @param accountID    int, passed to Account constructor.
     * @param userName     String, passed to Account constructor.
     * @param password     String, passed to Account constructor.
     * @param firstName    String, passed to Account constructor.
     * @param lastName     String, passed to Account constructor.
     * @param emailAddress String, passed to Account constructor.
     * @param adminID      String, Unique Administrator ID used to make changes in the system.
     * @throws IllegalAccountArgumentException thrown if a parameter is invalid.
     */
    Admin(
            int accountID,
            String userName,
            String password,
            String firstName,
            String lastName,
            String emailAddress,
            int adminID)
            throws IllegalAccountArgumentException {
        super(accountID, userName, password, firstName, lastName, emailAddress);
        setAdminID(adminID);
    }

    /**
     * Returns Administrator Id.
     *
     * @return int adminID of Account.
     */
    public int getAdminID() {
        return adminID;
    }

    /**
     * Sets Administrator ID of Account.
     *
     * @param adminID the value assigned to Account's Administrator ID if it is validated.
     * @throws IllegalAccountArgumentException thrown if invalid parameter is passed.
     */
    private void setAdminID(int adminID) throws IllegalAccountArgumentException {
        if (adminID > 0) {
            this.adminID = adminID;
        } else {
            throw new IllegalAccountArgumentException(
                    "Invalid Administrator ID "
                            + adminID
                            + " Administrator ID must be greater than 0 "
                            + "and must be unique.");
        }
    }
}
