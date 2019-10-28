package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class InAMoodPage {
    public static Stage InAMoodWindow = new Stage();

    // sets up In A Mood Window
    public static void display(String title) throws Exception {
        Parent root =
                FXMLLoader.load(MovieRentalHomePage.class.getResource("InAMood.fxml"));
        InAMoodWindow.setTitle("In A Mood Page");
        InAMoodWindow.setScene(new Scene(root, 1142, 658));
        InAMoodWindow.setResizable(false);
        InAMoodWindow.show();
    }

    final String orange = "#fc9e4f";
    final String darkGray = "#474448";
    final String lightGray = "#6b6d76";
    final String white = "#f6f6f6";

    ///////////inserting Objects to be displayed on Survey Scene//////////////////////
    @FXML
    Button accountBtn = new Button();
    Button homeBtn = new Button();
    Button moodBtn = new Button();

    public void accountButtonPressed(ActionEvent event) throws Exception {
        openAccountPage();
    }//end pressButton

    public void homeButtonPressed(ActionEvent event) throws Exception {
        openMovieRentalHome();
    }//end pressButton

    public void moodButtonPressed(ActionEvent event) throws Exception {
        openMoodPage();
    }//end pressButton

    //Opens the Account Page
    public void openAccountPage() throws Exception {
        AccountPage.display("Account Page");
    }

    //Opens the Home Page
    public void openMovieRentalHome() throws Exception {
        MovieRentalHomePage.display("Movie Rental Homepage");
    }

    //Opens the Mood Page
    public void openMoodPage() throws Exception {
        InAMoodPage.display("In A Mood Page");
    }
    public void handleButtonMouseEntered(MouseEvent e){
        Button tmp = (Button)e.getSource();
        tmp.setTextFill(Color.valueOf(white));
    }
    public void handleButtonMouseExit(MouseEvent e){
        Button tmp = (Button)e.getSource();
        tmp.setTextFill(Color.valueOf(orange));
    }
}
