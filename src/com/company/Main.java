package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // sets up Movie Rental Home Page
    @Override
    public void start(Stage primaryStage) throws Exception{
        SignInBox.display("Sign In");


        // Refuses access to survey if user hasn't signed in
        if (!(primaryStage.isFocused() && User.hasSignedIn())){
            primaryStage.close();
        }
    } //ends start


    public static void main(String[] args) {
        launch(args);
    } // ends main
} // ends Main

