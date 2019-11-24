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
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

/** AccountPageController class, controls the account page. */
public class AccountPageController {

  final String orange = "#fc9e4f";
  final String darkGray = "#474448";
  final String lightGray = "#6b6d76";
  final String white = "#f6f6f6";

  /////////// inserting Objects to be displayed on Survey Scene//////////////////////
    @FXML AnchorPane editUserPane = new AnchorPane();
    @FXML AnchorPane loginInfoPane = new AnchorPane();
    @FXML AnchorPane viewingHistoryPane = new AnchorPane();
    @FXML Button homeBtn = new Button();
  @FXML Button moodBtn = new Button();
  @FXML Button saveChanges = new Button();
  @FXML Button loginInfo = new Button();
  @FXML Button viewingHistory = new Button();
  @FXML Button changeName = new Button();
  @FXML Button editUserAccountBtn = new Button();
  @FXML Label emailSent = new Label();
  @FXML Label passLabel = new Label();
  @FXML Label userLabel = new Label();
  @FXML Label username = new Label();
  @FXML Label piTest = new Label();
  @FXML Label vhTest = new Label();
  @FXML Label userFirstName = new Label();
  @FXML Label userLastName = new Label();
  @FXML Label userEmail = new Label();
  @FXML TextField enterNewPassword = new TextField();
  @FXML TextField confirmNewPassword = new TextField();
  @FXML TextField editFirstName = new TextField();
  @FXML TextField editLastName = new TextField();
  @FXML TextField editEmail = new TextField();
  @FXML TextField enterCurrentPassword = new TextField();

  public AccountPageController() throws Exception {
    loginInfoPressed();
  }

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
    loginInfoPane.setVisible(true);
    viewingHistoryPane.setVisible(false);
    // username.setText(user.getUsername());
    // userFirstName.setText(user.getFirstName());
    // userLastName.setText(user.getLastName());
  }

  public void viewingHistoryPressed() throws Exception {
    viewingHistory.setTextFill(Color.valueOf(orange));
    loginInfo.setTextFill(Color.valueOf(white));
      loginInfoPane.setVisible(false);
      viewingHistoryPane.setVisible(true);
      editUserPane.setVisible(false);
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
      if(editUserPane.isVisible()){
          editUserPane.setVisible(false);
          return;
      }

      editUserPane.setVisible(true);
  }

  public void changeNamePressed(){
    //DBController db = new DBController();
    //db.connectToDB();
    //db.setUserName(editFirstName.getText(), editLastName.getText(), .getUsername());

    userFirstName.setText(editFirstName.getText());
    userLastName.setText(editLastName.getText());
    userEmail.setText(editEmail.getText());
    editFirstName.clear();
    editLastName.clear();
    enterNewPassword.clear();
    confirmNewPassword.clear();
    editEmail.clear();
    enterCurrentPassword.clear();
  }
} // end controller
