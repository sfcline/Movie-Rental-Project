package com.company;

import static com.company.SignUpBox.SignUpWindow;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Paint;


public class SignUpBoxController {
    ///////////inserting Objects to be displayed on Survey Scene//////////////////////
    @FXML
    Button signUpBtn = new Button();
    @FXML
    RadioButton ageButton = new RadioButton();
    @FXML
    TextField username1 = new TextField();
    @FXML
    TextField username2 = new TextField();
    @FXML
    PasswordField password1 = new PasswordField();
    @FXML
    PasswordField password2 = new PasswordField();
    @FXML
    Label errorCodeTop = new Label();
    @FXML
    Label errorCodeBottom = new Label();
    @FXML
    Label newUserLabel = new Label();
    @FXML
    Label ageError = new Label();

    //////////////////////////////////////////////////////////////////////////////////

    //Checks if Username Fields 1 & 2 are of correct length and if they match
    public boolean checkUsernameLength(){
        boolean isGoodUsername = false;
        String UsernameField1Entry = username1.getText();
        String UsernameField2Entry = username2.getText();
        if((username1.getText().trim()).length() < 6 && (username2.getText().trim()).length() < 6){             //Both Fields < 6
            errorCodeTop.setTextFill(Paint.valueOf("#cc0000"));//Red
            errorCodeTop.setText("Both Username Fields Too Short.");
        }else if(((username1.getText().trim()).length() >= 6 && (username2.getText().trim()).length() < 6)) {   //Field 2 < 6
            errorCodeTop.setTextFill(Paint.valueOf("#cc0000"));//Red
            errorCodeTop.setText("Second Username Field Too Short.");
        }else if(((username1.getText().trim()).length() < 6 && (username2.getText().trim()).length() >= 6)) {   //Field 1 < 6
            errorCodeTop.setTextFill(Paint.valueOf("#cc0000"));//Red
            errorCodeTop.setText("First Username Field Too Short.");
        }else{                                                                                                  //Both Correct Length
            if ((UsernameField1Entry.trim()).equals((UsernameField2Entry.trim()))) {                            //Both Fields Match
                errorCodeTop.setTextFill(Paint.valueOf("#009918"));//Green
                errorCodeTop.setText("Username Valid.");
                isGoodUsername = true;
            }else{                                                                                             //Fields Dont Match
                errorCodeTop.setTextFill(Paint.valueOf("#cc0000"));//Red
                errorCodeTop.setText("Username Fields Don't Match.");
            }//end internal if-else
        }//end external if-else
        return isGoodUsername;
    }// end checkUsernameLength

    //Checks if Password Fields 1 & 2 are of correct length and if they match
    public boolean checkPasswordLength() {
        boolean isGoodPassword = false;
        String PasswordField1Entry = password1.getText();
        String PasswordField2Entry = password2.getText();
        if((password1.getText().trim()).length() < 6 && (password2.getText().trim()).length() < 6){             //Both Fields < 6
            errorCodeBottom.setTextFill(Paint.valueOf("#cc0000"));//Red
            errorCodeBottom.setText("Both Password Fields Too Short.");
        }else if(((password1.getText().trim()).length() >= 6 && (password2.getText().trim()).length() < 6)) {   // Field 2 < 6
            errorCodeBottom.setTextFill(Paint.valueOf("#cc0000"));//Red
            errorCodeBottom.setText("Second Password Field Too Short.");
        }else if(((password1.getText().trim()).length() < 6 && (password2.getText().trim()).length() >= 6)) {   // Field 1 < 6
            errorCodeBottom.setTextFill(Paint.valueOf("#cc0000"));//Red
            errorCodeBottom.setText("First Password Field Too Short.");
        }else{                                                                                                  //Both correct Length
            if ((PasswordField1Entry.trim()).equals((PasswordField2Entry.trim()))) {                            //Both Fields Match
                errorCodeBottom.setTextFill(Paint.valueOf("#009918"));//Green
                errorCodeBottom.setText("Password Valid.");
                isGoodPassword = true;
            }else{                                                                                              //Fields Dont Match
                errorCodeBottom.setTextFill(Paint.valueOf("#cc0000"));//Red
                errorCodeBottom.setText("Password Fields Don't Match.");
            }//end internal if-else
        }//end external if-else
        return isGoodPassword;
    }//end checkPasswordLength

    public void signUpButtonPressed() {
        boolean UsernameStatus = checkUsernameLength();
        boolean PasswordStatus = checkPasswordLength();
        /*This portion will also be used to check if user already exists.
        * based on this result as well as username and password status
        * we will create a new user or reject and prompt the User*/
        if (ageButton.isSelected()) {
            ageError.setText(" ");
            if (UsernameStatus && PasswordStatus) {                                 //If Username is UNIQUE, then add user to DataBase
                //User.setUsername(username1.getText().trim());
                //User.setPassword(password1.getText().trim());
                System.out.println("[remove this later] NEW USER CREATED!");
                SignUpWindow.close();
            } else {                                                                  //If Username is not UNIQUE, then reject user Creation
                newUserLabel.setTextFill(Paint.valueOf("#cc0000"));//Red
                newUserLabel.setText("Unable to Create New User.");
            }
        }else {
            ageError.setTextFill(Paint.valueOf("#cc0000"));
            ageError.setText("You must be over the age of 13 to create an account.");
        }
        //end if-else
    }//end signUpButtonPressed
}
