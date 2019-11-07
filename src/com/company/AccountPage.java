/**Movie Rental Project
 * Software Engineering Fundamentals
 * Fall 2019
 * Jeremy Martin, Liana Madden, Stephen Cline, Sean Lamont
 *
 */
package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Account Page class, Sets Scene, calls the Account Page controller.
 */
public class AccountPage {
  public static Stage AccountWindow = new Stage();

  // sets up Sign Up Window
  public static void display(String title) throws Exception {
    Parent root = FXMLLoader.load(MovieRentalHomePage.class.getResource("AccountPage.fxml"));
    AccountWindow.setTitle("Account Page");
    AccountWindow.setScene(new Scene(root, 1142, 658));
    AccountWindow.setResizable(false);
    AccountWindow.show();
  }
}
