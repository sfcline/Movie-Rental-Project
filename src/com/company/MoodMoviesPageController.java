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
    /** Increases size of banner when called. */
    public void growBanner() {
        scaleImg(RecBanner1, 1.01);
    }

    /** Decreases size of banner when called. */
    public void shrinkBanner() {
        scaleImg(RecBanner1, .99);
    }

    public void scaleImg(Node img, double amount) {
        img.setScaleX(amount);
        img.setScaleY(amount);
    }
}
