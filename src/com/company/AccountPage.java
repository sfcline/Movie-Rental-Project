package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
