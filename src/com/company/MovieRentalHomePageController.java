package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javax.swing.*;
import java.awt.*;

public class MovieRentalHomePageController {

    final String orange = "#fc9e4f";
    final String darkGray = "#474448";
    final String lightGray = "#6b6d76";
    final String white = "#f6f6f6";

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
    public void handleButtonMouseEntered(ActionEvent e){
        accountBtn.setTextFill(Color.valueOf(white));

    }
    public void handleButtonMouseExit(){
        accountBtn.setTextFill(Color.valueOf(orange));
    }
}//end controller

