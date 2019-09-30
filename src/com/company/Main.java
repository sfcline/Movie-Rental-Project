package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // sets up Movie box Stage
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MovieRentalHomePage.fxml"));
        primaryStage.setTitle("Movie Rental Homepage");
        primaryStage.setScene(new Scene(root, 1142, 658));
        primaryStage.setResizable(false);
        primaryStage.show();
        SignInBox.display("Sign In");


        // Refuses access to the interface if user hasn't signed in
        if (!(primaryStage.isFocused() && User.hasSignedIn())){
            primaryStage.close();
        }
    } //ends start


    public static void main(String[] args) {
        launch(args);
    } // ends main
} // ends Main

