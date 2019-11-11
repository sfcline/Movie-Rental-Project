/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import java.util.ArrayList;

/** Class used to create accounts for customer users with no administrative privileges. */
public class Users extends Account {

  private ArrayList<Movie> preferences;

  private ArrayList<Movie> history;

  private ArrayList<Movie> recommendationsList;

  /**
   * @param accountID int, passed to Account constructor.
   * @param userName String, passed to Account constructor.
   * @param password String, passed to Account constructor.
   * @param firstName String, passed to Account constructor.
   * @param lastName String, passed to Account constructor.
   * @param emailAddress String, passed to Account constructor.
   * @param newPref ArrayList the generated list to create unique movie preferences.
   * @throws IllegalAccountArgumentException thrown if any parameters are flagged as invalid.
   */
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
    setNewUserRecommendationsList();
  }

  /**
   * Returns the entire list of preferences.
   *
   * @return ArrayList, the entire list of preferences.
   */
  public ArrayList<Movie> getPreferences() {
    return preferences;
  }

  /**
   * Adds a single Movie to the list of preferences. If list is 10 movies long, the oldest is
   * deleted.
   *
   * @param newPreference Movie, new movie to be added.
   */
  public void setPreferences(Movie newPreference) {
    if (preferences.size() < 10) {
      this.preferences.add(0, newPreference);
    } else if (preferences.size() == 10) {
      this.preferences.remove(9);
      this.preferences.add(0, newPreference);
    }
  }

  /**
   * Returns User History.
   *
   * @return ArrayList History of Account.
   */
  public ArrayList<Movie> getHistory() {
    return history;
  }

  /**
   * Sets History of Account.
   *
   * @param newEntry to be added to the history ArrayList.
   */
  public void setHistory(Movie newEntry) {
    this.history.add(0, newEntry);
  }

  /** Sets recommendation list of Account. */
  public void setRecommendationsList() {
    // insert whatever recommendation algorithm we want here
    // this.recommendationsList = newRecommendations;
  }
  /** Resets recommendation list of Account. */
  public void setNewUserRecommendationsList() {
    recommendationsList = new ArrayList<>();
    // recommendationsList.add(Movie);
  }
}
