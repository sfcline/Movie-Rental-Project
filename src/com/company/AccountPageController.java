/*
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */
package com.company;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

/**
 * AccountPageController class, controls the account page.
 */
public class AccountPageController {

    private final String orange = "#fc9e4f";
    final String darkGray = "#474448";
    final String lightGray = "#6b6d76";
    private final String white = "#f6f6f6";

    /////////// inserting Objects to be displayed on Survey Scene//////////////////////
    @FXML
    AnchorPane editUserPane = new AnchorPane();
    @FXML
    AnchorPane loginInfoPane = new AnchorPane();
    @FXML
    AnchorPane viewingHistoryPane = new AnchorPane();
    @FXML
    Button homeBtn = new Button();
    @FXML
    Button moodBtn = new Button();
    @FXML
    Button saveChanges = new Button();
    @FXML
    Button loginInfo = new Button();
    @FXML
    Button viewingHistory = new Button();
    @FXML
    Button changeName = new Button();
    @FXML
    Button editUserAccountBtn = new Button();
    @FXML
    Label emailSent = new Label();
    @FXML
    Label passLabel = new Label();
    @FXML
    Label userLabel = new Label();
    @FXML
    Label username = new Label();
    @FXML
    Label piTest = new Label();
    @FXML
    Label vhTest = new Label();
    @FXML
    Label userFirstName = new Label();
    @FXML
    Label userLastName = new Label();
    @FXML
    Label userEmail = new Label();
    @FXML
    TextField enterNewPassword = new TextField();
    @FXML
    TextField confirmNewPassword = new TextField();
    @FXML
    TextField editFirstName = new TextField();
    @FXML
    TextField editLastName = new TextField();
    @FXML
    TextField editEmail = new TextField();
    @FXML
    TextField enterCurrentPassword = new TextField();
    @FXML
    ImageView historyBanner1 = new ImageView();
    @FXML
    ImageView historyBanner2 = new ImageView();
    @FXML
    ImageView historyBanner3 = new ImageView();
    @FXML
    ImageView historyBanner4 = new ImageView();
    @FXML
    ImageView historyBanner5 = new ImageView();
    @FXML
    ImageView historyBanner6 = new ImageView();
    @FXML
    ImageView historyBanner7 = new ImageView();
    @FXML
    ImageView historyBanner8 = new ImageView();
    @FXML
    ImageView historyBanner9 = new ImageView();
    @FXML
    ImageView historyBanner10 = new ImageView();
    @FXML
    ImageView historyBanner11 = new ImageView();
    @FXML
    ImageView historyBanner12 = new ImageView();
    @FXML
    ImageView historyBanner13 = new ImageView();
    @FXML
    ImageView historyBanner14 = new ImageView();
    @FXML
    ImageView historyBanner15 = new ImageView();
    @FXML
    ImageView historyBanner16 = new ImageView();
    @FXML
    ImageView historyBanner17 = new ImageView();
    @FXML
    ImageView historyBanner18 = new ImageView();
    @FXML
    ImageView historyBanner19 = new ImageView();
    @FXML
    ImageView historyBanner20 = new ImageView();
    @FXML
    ImageView historyBanner21 = new ImageView();
    @FXML
    ImageView historyBanner22 = new ImageView();
    @FXML
    ImageView historyBanner23 = new ImageView();
    @FXML
    ImageView historyBanner24 = new ImageView();
    @FXML
    ImageView historyBanner25 = new ImageView();
    @FXML
    ImageView historyBanner26 = new ImageView();
    @FXML
    ImageView historyBanner27 = new ImageView();
    @FXML
    ImageView historyBanner28 = new ImageView();
    @FXML
    ImageView historyBanner29 = new ImageView();
    @FXML
    ImageView historyBanner30 = new ImageView();
    @FXML
    ImageView historyBanner31 = new ImageView();
    @FXML
    ImageView historyBanner32 = new ImageView();
    @FXML
    ImageView historyBanner33 = new ImageView();
    @FXML
    ImageView historyBanner34 = new ImageView();
    @FXML
    ImageView historyBanner35 = new ImageView();

    @FXML
    Label historyLabel1 = new Label();
    @FXML
    Label historyLabel2 = new Label();
    @FXML
    Label historyLabel3 = new Label();
    @FXML
    Label historyLabel4 = new Label();
    @FXML
    Label historyLabel5 = new Label();
    @FXML
    Label historyLabel6 = new Label();
    @FXML
    Label historyLabel7 = new Label();
    @FXML
    Label historyLabel8 = new Label();
    @FXML
    Label historyLabel9 = new Label();
    @FXML
    Label historyLabel10 = new Label();
    @FXML
    Label historyLabel11 = new Label();
    @FXML
    Label historyLabel12 = new Label();
    @FXML
    Label historyLabel13 = new Label();
    @FXML
    Label historyLabel14 = new Label();
    @FXML
    Label historyLabel15 = new Label();
    @FXML
    Label historyLabel16 = new Label();
    @FXML
    Label historyLabel17 = new Label();
    @FXML
    Label historyLabel18 = new Label();
    @FXML
    Label historyLabel19 = new Label();
    @FXML
    Label historyLabel20 = new Label();
    @FXML
    Label historyLabel21 = new Label();
    @FXML
    Label historyLabel22 = new Label();
    @FXML
    Label historyLabel23 = new Label();
    @FXML
    Label historyLabel24 = new Label();
    @FXML
    Label historyLabel25 = new Label();
    @FXML
    Label historyLabel26 = new Label();
    @FXML
    Label historyLabel27 = new Label();
    @FXML
    Label historyLabel28 = new Label();
    @FXML
    Label historyLabel29 = new Label();
    @FXML
    Label historyLabel30 = new Label();
    @FXML
    Label historyLabel31 = new Label();
    @FXML
    Label historyLabel32 = new Label();
    @FXML
    Label historyLabel33 = new Label();
    @FXML
    Label historyLabel34 = new Label();
    @FXML
    Label historyLabel35 = new Label();

    public AccountPageController() {
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

    /**
     * Called when change password button is pressed.
     */
    public void changePassPressed() {

        emailSent.setVisible(true);
        setUserInfo();
    }

    /**
     * Called when the login Info button is pressed.
     */
    public void loginInfoPressed() {
        viewingHistory.setTextFill(Color.valueOf(white));
        loginInfo.setTextFill(Color.valueOf(orange));
        loginInfoPane.setVisible(true);
        viewingHistoryPane.setVisible(false);
        // username.setText(user.getUsername());
        // userFirstName.setText(user.getFirstName());
        // userLastName.setText(user.getLastName());
    }

    /**
     * Called when the viewing history button is pressed.
     */
    public void viewingHistoryPressed() {
        viewingHistory.setTextFill(Color.valueOf(orange));
        loginInfo.setTextFill(Color.valueOf(white));
        loginInfoPane.setVisible(false);
        viewingHistoryPane.setVisible(true);
        editUserPane.setVisible(false);
    }

    /**
     * Called when setting user information.
     */
    private void setUserInfo() {
        String firstName = editFirstName.getText();
        String lastName = editLastName.getText();
        String email = editEmail.getText();
        String password = enterCurrentPassword.getText();
    /*
    try{
      Users currentUser = new Users();

    Users currentUser = new Users(firstName, lastName, email, password);
    }
    catch(IllegalAccountArgumentException e){
      System.out.println("Error creating User Account");
    }

     */
    }

    /**
     * Opens the Home Page.
     *
     * @throws Exception exception.
     */
    private void openMovieRentalHomePage() throws Exception {
        MovieRentalHomePage.display("Movie Rental Homepage");
    }

    private void openMoodPage() throws Exception {
        InAMoodPage.display("In A Mood Page");
    }

    /**
     * Called when the mouse "mouses over" an Node object.
     *
     * @param e - Mouse Event thrown by mouse entering the Node
     */
    public void handleButtonMouseEntered(MouseEvent e) {
        Button tmp = (Button) e.getSource();
        tmp.setScaleX(1.03);
        tmp.setScaleY(1.03);
        tmp.setCursor(Cursor.HAND);
    }

    /**
     * Called when the mouse exits a Node object.
     *
     * @param e - Mouse Event thrown by mouse entering the Node
     */
    public void handleButtonMouseExit(MouseEvent e) {
        Button tmp = (Button) e.getSource();
        tmp.setScaleX(.97);
        tmp.setScaleY(.97);
        tmp.setCursor(Cursor.DEFAULT);
    }

    /**
     * Called when the mouse enters a Node.
     *
     * @param e the mouse event.
     */
    public void handleImageMouseEntered(MouseEvent e) {
        ImageView tmp = (ImageView) e.getSource();
        tmp.setScaleX(1.02);
        tmp.setScaleY(1.02);
        tmp.setCursor(Cursor.HAND);
    }

    /**
     * Called when the mouse exits a Node object.
     *
     * @param e - Mouse Event thrown by mouse entering the Node
     */
    public void handleImageMouseExit(MouseEvent e) {
        ImageView tmp = (ImageView) e.getSource();
        tmp.setScaleX(.98);
        tmp.setScaleY(.98);
        tmp.setCursor(Cursor.DEFAULT);
    }

    /**
     * Called when the Edit Button is pressed.
     */
    public void editButtonPressed() {
        if (editUserPane.isVisible()) {
            editUserPane.setVisible(false);
            return;
        }

        editUserPane.setVisible(true);
    }

    /**
     * Called when the Change Name button is pressed.
     */
    public void changeNamePressed() {
        // DBController db = new DBController();
        // db.connectToDB();
        // db.setUserName(editFirstName.getText(), editLastName.getText(), .getUsername());

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
