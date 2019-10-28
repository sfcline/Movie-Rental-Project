package com.company;

public abstract class Account {

  protected int accountID;

  protected String userName;

  protected String password;

  protected String firstName;

  protected String lastName;

  protected String emailAddress;

  Account(
      int accountID,
      String userName,
      String password,
      String firstName,
      String lastName,
      String emailAddress)
      throws IllegalAccountArgumentException {
    setAccountID(accountID);
    setUserName(userName);
    setPassword(password);
    setFirstName(firstName);
    setLastName(lastName);
    setEmailAddress(emailAddress);
  }

  public int getAccountID() {
    return accountID;
  }

  public void setAccountID(int accountID) throws IllegalAccountArgumentException {
    if (accountID > 0) {
      this.accountID = accountID;
    } else {
      throw new IllegalAccountArgumentException(
          "Invalid Account ID "
              + accountID
              + " Account ID must be greater than 0 "
              + "and must be unique.");
    }
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) throws IllegalAccountArgumentException {
    if (userName != null && userName.length() > 0) {
      this.userName = userName;
    } else {
      throw new IllegalAccountArgumentException(
          "Invalid User Name "
              + userName
              + " User Name must be "
              + "greater than zero characters long.");
    }
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) throws IllegalAccountArgumentException {
    if (password != null && password.length() > 0) {
      this.password = password;
    } else {
      throw new IllegalAccountArgumentException(
          "Invalid Password "
              + password
              + " Password must be "
              + "greater than zero characters long.");
    }
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) throws IllegalAccountArgumentException {
    if (firstName != null && firstName.length() > 0) {
      this.firstName = firstName;
    } else {
      throw new IllegalAccountArgumentException(
          "Invalid First Name "
              + firstName
              + " First Name must be "
              + "greater than zero characters long.");
    }
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) throws IllegalAccountArgumentException {
    if (lastName != null && lastName.length() > 0) {
      this.lastName = lastName;
    } else {
      throw new IllegalAccountArgumentException(
          "Invalid Last Name "
              + lastName
              + " Last Name must be "
              + "greater than zero characters long.");
    }
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) throws IllegalAccountArgumentException {
    if (emailAddress != null && emailAddress.length() > 0) {
      this.emailAddress = emailAddress;
    } else {
      throw new IllegalAccountArgumentException(
          "Invalid Email Address "
              + emailAddress
              + " Email Address must be "
              + "greater than zero characters long.");
    }
  }
}
