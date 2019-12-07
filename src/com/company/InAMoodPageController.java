package com.company;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class InAMoodPageController {

    final String orange = "#fc9e4f";
    final String darkGray = "#474448";
    final String lightGray = "#6b6d76";
    final String white = "#f6f6f6";

    @FXML
    Button accountBtn = new Button();
    @FXML
    Button homeBtn = new Button();
    @FXML
    Button adventureBtn = new Button();
    @FXML
    Button cowboyBtn = new Button();
    @FXML
    Button warBtn = new Button();
    @FXML
    Button scaredBtn = new Button();
    @FXML
    Button laughBtn = new Button();
    @FXML
    Button childrenBtn = new Button();
    @FXML
    Button scienceBtn = new Button();
    @FXML
    Button actionBtn = new Button();
    @FXML
    Button mysteryBtn = new Button();
    @FXML
    Button dramaBtn = new Button();
    @FXML
    Button romanceBtn = new Button();
    @FXML
    Button sleepBtn = new Button();

    public void openMovieRentalHomePage() throws Exception {
        MovieRentalHomePage.display("Movie Rental Homepage");
        InAMoodPage.close();
    }

    public void openAccountPage() throws Exception {
        AccountPage.display("Account Page");
        InAMoodPage.close();
    }

    /**
     * Opens the In A Mood Movie Page when called.
     *
     * @param e mouse event.
     * @throws Exception thrown if IllegalMovieArgumentException is thrown.
     */
    public void openMoodMoviePage(MouseEvent e) throws Exception {
        Button tmp = (Button) e.getSource();
        String mood = tmp.getText().toLowerCase() + "...";
        MoodMoviesPage.display("Mood Movies Page", mood);
        InAMoodPage.close();
    }

    /**
     * Called when the mouse enters a Node.
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
     * Called when a mouse enters a Node.
     *
     * @param e - Mouse Event thrown by mouse entering the Node
     */
    public void handleButtonMouseExit(MouseEvent e) {
        Button tmp = (Button) e.getSource();
        tmp.setScaleX(.97);
        tmp.setScaleY(.97);
        tmp.setCursor(Cursor.DEFAULT);
    }
}
