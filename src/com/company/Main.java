/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Main class, calls Controllers */
public class Main extends Application {

  /**
   * Sets up Movie Rental Home Page
   *
   * @param primaryStage stage.
   * @throws Exception exception.
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    SignInBox.display("Sign In");

    // Refuses access to survey if user hasn't signed in
    if (!(primaryStage.isFocused() && User.hasSignedIn())) {
      primaryStage.close();
    }
  } // ends start

  /**
   * Runnable,calls launch(args)
   *
   * @param args main.
   */
  public static void main(String[] args) {
    launch(args);
  } // ends main
} // ends Main
