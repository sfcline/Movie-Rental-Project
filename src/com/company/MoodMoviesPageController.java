package com.company;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class MoodMoviesPageController {

    @FXML
    Button accountBtn = new Button();
    @FXML
    Button homeBtn = new Button();
    @FXML
    Button moodBtn = new Button();
    @FXML Button grooveBtn = new Button();
    @FXML Button smartBtn = new Button();
    @FXML Button inspiredBtn = new Button();
    @FXML Button laughBtn = new Button();
    @FXML Button childrenBtn = new Button();
    @FXML Button productiveBtn = new Button();
    @FXML Button cryBtn = new Button();
    @FXML Button leaveBtn = new Button();
    @FXML Button cookBtn = new Button();
    @FXML Button romanceBtn = new Button();
    @FXML Button sleepBtn = new Button();
    @FXML
    ImageView RecBanner1, RecBanner2, RecBanner3, RecBanner4, RecBanner5, RecBanner6, RecBanner7, RecBanner8
            = new ImageView();
    @FXML
    Label RecLabel1, RecLabel2, RecLabel3, RecLabel4, RecLabel5, RecLabel6, RecLabel7, RecLabel8
            = new Label();

    public void openMovieRentalHomePage() throws Exception {
        MovieRentalHomePage.display("Movie Rental Homepage");
        MoodMoviesPage.close();
    }

    public void openAccountPage() throws Exception {
        AccountPage.display("Account Page");
        MoodMoviesPage.close();
    }

    public void openMoodPage() throws Exception {
        InAMoodPage.display("In A Mood Page");
        MoodMoviesPage.close();

    }
}
