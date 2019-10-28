package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

public class SignInBoxController {

    ///////////inserting Objects to be displayed on Survey Scene//////////////////////
    @FXML
    TextField usernameField = new TextField();
    @FXML
    Button submitBtn = new Button();
    @FXML
    PasswordField passwordField = new PasswordField();
    @FXML
    Label passwordCheck = new Label();
    //////////////////////////////////////////////////////////////////////////////////


    // When sign in button is pressed Prints to console and authenticates users
    public void signInButtonPressed(ActionEvent event) {
        authenticateUser();
    }//end pressButton

    // tests if username and password are valid, if they are prints prompt, clears fields, and grants access to survey
    public void authenticateUser() {
        Boolean passwordStatus = User.isGoodPassword(usernameField.getText(),passwordField.getText());
        if (passwordStatus == true){
            passwordCheck.setTextFill(Paint.valueOf("#009918"));
            passwordCheck.setText("User Authentication Successful.");
            usernameField.clear();
            passwordField.clear();
            try {
                openMovieRentalHome();
            } catch (Exception e) {
                passwordCheck.setTextFill(Paint.valueOf("#cc0000"));
                passwordCheck.setText(e.toString());
            }
            SignInBox.close();

        }else{
            passwordCheck.setTextFill(Paint.valueOf("#cc0000"));
            passwordCheck.setText("User Authentication Failed. Please Try Again");
            usernameField.clear();
            passwordField.clear();
        }
    }//end authenticateUser


    public void openSignUpBox() throws Exception {
        SignUpBox.display("Sign Up");

    }
    public void openMovieRentalHome() throws Exception {
        MovieRentalHomePage.display("Movie Rental Homepage");
    }
}//end MovieRentalController
