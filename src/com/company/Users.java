package com.company;

import java.util.ArrayList;

public class Users extends Account {

  private ArrayList<Movie> preferences;

  private  ArrayList<Movie> history;

  Users(
      int accountID,
      String userName,
      String password,
      String firstName,
      String lastName,
      String emailAddress,
      ArrayList<Movie> newPref)
      throws IllegalAccountArgumentException {
    super(accountID, userName, password, firstName, lastName, emailAddress);
    this.preferences = new ArrayList<>(newPref);
    this.history = new ArrayList<>();
  }

  public ArrayList<Movie> getPreferences() {
    return preferences;
  }

  public void setPreferences(Movie newPreference) {
    if (preferences.size() < 10) {
      this.preferences.add(0,newPreference);
    } else if (preferences.size() == 10) {
      this.preferences.remove(9);
      this.preferences.add(0,newPreference);
    }
  }

  public ArrayList<Movie> getHistory() {
    return history;
  }

  public void setHistory(Movie newEntry) {
    this.history.add(0,newEntry);
  }
}
