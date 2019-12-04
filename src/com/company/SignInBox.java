/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */
package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/** SignInBox class sets the stage and calls the controller. */
public class SignInBox {

  public static Stage SignInWindow = new Stage();

  /**
   * Sets up the sign in window to be displayed.
   *
   * @param title the title of the window.
   * @throws Exception thrown if Exception is found.
   */
  public static void display(String title) throws Exception {
    SignInWindow.initModality(Modality.APPLICATION_MODAL);
    Parent root = FXMLLoader.load(SignInBox.class.getResource("SignInBox.fxml"));
    SignInWindow.setTitle("Sign In");
    SignInWindow.setScene(new Scene(root, 275, 400));
    SignInWindow.setResizable(false);
    SignInWindow.showAndWait();
  }

  /** Closes the sign in box window when called. */
  public static void close() {
    SignInWindow.close();
  }
}
