package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MovieRentalHomePageController {

    ///////////inserting Objects to be displayed on Survey Scene//////////////////////
@FXML
    Button accountBtn = new Button();

    public void signInButtonPressed(ActionEvent event) throws Exception {
        openAccountPage();
    }//end pressButton

    //Opens the Account Page
    public void openAccountPage() throws Exception {
        AccountPage.display("Account Page");
    }
}//end controller

