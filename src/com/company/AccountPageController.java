/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/** AccountPageController class, controls the account page. */
public class AccountPageController {

  final String orange = "#fc9e4f";
  final String darkGray = "#474448";
  final String lightGray = "#6b6d76";
  final String white = "#f6f6f6";

  /////////// inserting Objects to be displayed on Survey Scene//////////////////////
  @FXML Button homeBtn = new Button();
  @FXML Button moodBtn = new Button();
  @FXML Button changePass = new Button();
  @FXML Button loginInfo = new Button();
  @FXML Button viewingHistory = new Button();
  @FXML Button changeName = new Button();
  @FXML Button edit = new Button();
  @FXML Label emailSent = new Label();
  @FXML Label passLabel = new Label();
  @FXML Label userLabel = new Label();
  @FXML Label username = new Label();
  @FXML Label piTest = new Label();
  @FXML Label vhTest = new Label();
  @FXML Label firstName = new Label();
  @FXML Label lastName = new Label();
  @FXML Label userFirstName = new Label();
  @FXML Label userLastName = new Label();
  @FXML TextField enterPass = new TextField();
  @FXML TextField confirmPass = new TextField();
  @FXML TextField enterFirstName = new TextField();
  @FXML TextField enterLastName = new TextField();

  /**
   * Called when the signInButton is activated. calls openMovieRentalPage().
   *
   * @throws Exception exception.
   */
  public void homeBtnPressed() throws Exception {
    openMovieRentalHomePage();
    AccountPage.close();
  } // end pressButton

  public void InAMoodBtnPressed() throws Exception {
    openMoodPage();
    AccountPage.close();
  }

  public void changePassPressed(){
    emailSent.setVisible(true);
  }

  public void loginInfoPressed() throws Exception {
    viewingHistory.setTextFill(Color.valueOf(white));
    loginInfo.setTextFill(Color.valueOf(orange));
    vhTest.setVisible(false);
    piTest.setVisible(false);
    passLabel.setVisible(true);
    userLabel.setVisible(true);
    username.setVisible(true);
    enterPass.setVisible(true);
    confirmPass.setVisible(true);
    changePass.setVisible(true);
    firstName.setVisible(true);
    lastName.setVisible(true);
    userFirstName.setVisible(true);
    userLastName.setVisible(true);
    edit.setVisible(true);
    // username.setText(user.getUsername());
    // userFirstName.setText(user.getFirstName());
    // userLastName.setText(user.getLastName());
  }

  public void viewingHistoryPressed() throws Exception {
    viewingHistory.setTextFill(Color.valueOf(orange));
    loginInfo.setTextFill(Color.valueOf(white));
    emailSent.setVisible(false);
    passLabel.setVisible(false);
    userLabel.setVisible(false);
    username.setVisible(false);
    enterPass.setVisible(false);
    confirmPass.setVisible(false);
    changePass.setVisible(false);
    firstName.setVisible(false);
    lastName.setVisible(false);
    userFirstName.setVisible(false);
    userLastName.setVisible(false);
    edit.setVisible(false);
    enterFirstName.setVisible(false);
    enterLastName.setVisible(false);
    changeName.setVisible(false);
    piTest.setVisible(false);
    vhTest.setVisible(true);
  }

  /**
   * Opens the Home Page.
   *
   * @throws Exception exception.
   */
  public void openMovieRentalHomePage() throws Exception {
    MovieRentalHomePage.display("Movie Rental Homepage");
  }
  public void openMoodPage() throws Exception {
    InAMoodPage.display("In A Mood Page");
  }



  /**
   * @param e - Mouse Event thrown by mouse entering the Node
   */
  public void handleButtonMouseEntered(MouseEvent e){
    Button tmp = (Button)e.getSource();
    tmp.setScaleX(1.03);
    tmp.setScaleY(1.03);
    tmp.setCursor(Cursor.HAND);
  }

  /**
   * @param e - Mouse Event thrown by mouse entering the Node
   */
  public void handleButtonMouseExit(MouseEvent e){
    Button tmp = (Button)e.getSource();
    tmp.setScaleX(.97);
    tmp.setScaleY(.97);
    tmp.setCursor(Cursor.DEFAULT);
  }

  public void editButtonPressed(){
    userFirstName.setVisible(false);
    userLastName.setVisible(false);
    edit.setVisible(false);
    enterFirstName.setVisible(true);
    enterLastName.setVisible(true);
    changeName.setVisible(true);
  }

  public void changeNamePressed(){
    userFirstName.setText(enterFirstName.getText());
    userLastName.setText(enterLastName.getText());
    userFirstName.setVisible(true);
    userLastName.setVisible(true);
    edit.setVisible(true);
    enterFirstName.setVisible(false);
    enterLastName.setVisible(false);
    changeName.setVisible(false);
    /*DBController db = new DBController();
    db.connectToDB();
    db.setUserName(enterFirstName.getText(), enterLastName.getText(), user.getUsername());*/
    enterFirstName.clear();
    enterLastName.clear();
  }
} // end controller
