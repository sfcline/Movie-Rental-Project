package com.company;

public class Admin extends Account {

  private int adminID;

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

  public int getAdminID() {
    return adminID;
  }

  public void setAdminID(int adminID) throws IllegalAccountArgumentException {
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
