package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AccountPageController {
    ///////////inserting Objects to be displayed on Survey Scene//////////////////////
    @FXML
    Button homeBtn = new Button();

    public void signInButtonPressed(ActionEvent event) throws Exception {
        openMovieRentalHomePage();
    }//end pressButton

    //Opens the Home Page
    public void openMovieRentalHomePage() throws Exception {
        MovieRentalHomePage.display("Movie Rental Homepage");
    }
}//end controller
