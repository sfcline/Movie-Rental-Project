/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Sets the scene and calls SignInBoxController. */
public class SignUpBox {

  public static Stage SignUpWindow = new Stage();

  /**
   * Sets up Sign Up Window
   *
   * @param title title.
   * @throws Exception exception.
   */
  public static void display(String title) throws Exception {
    Parent root = FXMLLoader.load(SignInBox.class.getResource("SignUpBox.fxml"));
    SignUpWindow.setTitle("Sign Up");
    SignUpWindow.setScene(new Scene(root, 390, 425));
    SignUpWindow.setResizable(false);
    SignUpWindow.show();
  }
}
