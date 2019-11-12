package com.company;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InAMoodPageController {

    final String orange = "#fc9e4f";
    final String darkGray = "#474448";
    final String lightGray = "#6b6d76";
    final String white = "#f6f6f6";

    @FXML Button accountBtn = new Button();
    @FXML Button homeBtn = new Button();
    @FXML Button dudeBtn = new Button();


    public void openMovieRentalHomePage() throws Exception {
        MovieRentalHomePage.display("Movie Rental Homepage");
        InAMoodPage.close();
    }
    public void openAccountPage() throws Exception {
        AccountPage.display("Account Page");
        InAMoodPage.close();
    }
    public void openMoodMoviePage() throws Exception {
        MoodMoviesPage.display("Mood Movies Page");
        InAMoodPage.close();
    }

}
