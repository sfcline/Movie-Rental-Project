/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/** AccountPageController class, controls the account page. */
public class AccountPageController {
  /////////// inserting Objects to be displayed on Survey Scene//////////////////////
  @FXML Button homeBtn = new Button();

  /**
   * Called when the signInButton is activated. calls openMovieRentalPage().
   *
   * @param event signInButton pressed.
   * @throws Exception exception.
   */
  public void signInButtonPressed(ActionEvent event) throws Exception {
    openMovieRentalHomePage();
  } // end pressButton

  /**
   * Opens the Home Page.
   *
   * @throws Exception exception.
   */
  public void openMovieRentalHomePage() throws Exception {
    MovieRentalHomePage.display("Movie Rental Homepage");
  }
} // end controller
