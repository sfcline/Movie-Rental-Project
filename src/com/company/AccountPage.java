/**
 * Movie Rental Project. Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Account Page class, Sets Scene, calls the Account Page controller. */
public class AccountPage {
  public static Stage AccountWindow = new Stage();

  /**
   * Sets up the Sign Up Window to be displayed.
   *
   * @param title the title to be displayed by the window.
   * @throws Exception thrown if ivalid parameter is passed to Account.
   */
  public static void display(String title) throws Exception {
    Parent root = FXMLLoader.load(AccountPage.class.getResource("AccountPage.fxml"));
    AccountWindow.setTitle(title);
    AccountWindow.setScene(new Scene(root, 1142, 658));
    AccountWindow.setResizable(false);
    AccountWindow.show();
  }

  public static void close() {
    AccountWindow.close();
  }
}
