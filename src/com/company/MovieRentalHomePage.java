/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** MovieRentalHomePage, sets the scene and calls the controller for the main page. */
public class MovieRentalHomePage {
  public static Stage MovieRentalWindow = new Stage();

  /**
   * Sets up Sign Up Window.
   *
   * @param title title.
   * @throws Exception exception.
   */
  public static void display(String title) throws Exception {
    Parent root =
        FXMLLoader.load(MovieRentalHomePage.class.getResource("MovieRentalHomePage.fxml"));
    MovieRentalWindow.setTitle(title);
    MovieRentalWindow.setScene(new Scene(root, 1142, 658));
    MovieRentalWindow.setResizable(false);
    MovieRentalWindow.show();
  }

  public static void close(){
    MovieRentalWindow.close();
  }
}
