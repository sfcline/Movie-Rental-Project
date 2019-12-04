/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */

package com.company;

/** Abstract Parent class for every type of users and admins. */
public abstract class Account {

  protected int accountID;

  protected String userName;

  protected String password;

  protected String firstName;

  protected String lastName;

  protected String emailAddress;

  /**
   * Six parameter constructor.
   *
   * @param accountID int, the ID of the count, not decided by Account creator.
   * @param userName String, the visible username, decided by user.
   * @param password String, the password decided by Account creator, used for all logins.
   * @param firstName String, Account owner's first name.
   * @param lastName String, Account owner's last name.
   * @param emailAddress String, Account owner's email address, used for verifications.
   * @throws IllegalAccountArgumentException thrown if illegal parameters are attempted.
   */
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

  /**
   * Returns Account Id.
   *
   * @return int accountID of Account.
   */
  public int getAccountID() {
    return accountID;
  }

  /**
   * Sets accountID of Account.
   *
   * @param accountID the value assigned to Account's Account ID if it is validated.
   * @throws IllegalAccountArgumentException thrown if invalid parameter is passed.
   */
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

  /**
   * Returns Account's userName.
   *
   * @return String, userName.
   */
  public String getUserName() {
    return userName;
  }

  /**
   * Sets userName of Account.
   *
   * @param userName the value assigned to Account's User Name if it is validated.
   * @throws IllegalAccountArgumentException thrown if invalid parameter is passed.
   */
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

  /**
   * Returns Account's Password.
   *
   * @return String password of Account.
   */
  public String getPassword() {
    return password;
  }

  /**
   * Sets password of Account.
   *
   * @param password the value assigned to Account's Password if it is validated.
   * @throws IllegalAccountArgumentException thrown if invalid parameter is passed.
   */
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

  /**
   * Returns Account Owner's First Name.
   *
   * @return String firstName of Account.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets firstName of Account.
   *
   * @param firstName the value assigned to Account's First Name if it is validated.
   * @throws IllegalAccountArgumentException thrown if invalid parameter is passed.
   */
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

  /**
   * Returns Account Owner's Last Name.
   *
   * @return String lastName of Account.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets lastName of Account.
   *
   * @param lastName the value assigned to Account's Last Name if it is validated.
   * @throws IllegalAccountArgumentException thrown if invalid parameter is passed.
   */
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

  /**
   * Returns Account Owner's Email Address.
   *
   * @return String emailAddress of Account.
   */
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * Sets emailAddress of Account.
   *
   * @param emailAddress the value assigned to Account's Email Address if it is validated.
   * @throws IllegalAccountArgumentException thrown if invalid parameter is passed.
   */
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
