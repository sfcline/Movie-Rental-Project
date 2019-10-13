package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MovieRentalHomePage {
  public static Stage MovieRentalWindow = new Stage();

  // sets up Sign Up Window
  public static void display(String title) throws Exception {
    Parent root =
        FXMLLoader.load(MovieRentalHomePage.class.getResource("MovieRentalHomePage.fxml"));
    MovieRentalWindow.setTitle("Movie Rental Homepage");
    MovieRentalWindow.setScene(new Scene(root, 1142, 658));
    MovieRentalWindow.setResizable(false);
    MovieRentalWindow.show();
  }
}
