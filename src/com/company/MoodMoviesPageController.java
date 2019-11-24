package com.company;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;


public class MoodMoviesPageController implements Initializable {

    private HashMap<String, ArrayList<Movie>> DisplayedMoodMovies = new HashMap<>();
    final String orange = "#fc9e4f";
    final String darkGray = "#474448";
    final String lightGray = "#6b6d76";
    final String white = "#f6f6f6";
    final String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";

    @FXML
    Button accountBtn = new Button();
    @FXML
    Button homeBtn = new Button();
    @FXML
    Button moodBtn = new Button();

    @FXML
    ImageView moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5, moodBanner6, moodBanner7, moodBanner8,
    moodBanner9, moodBanner10, moodBanner11, moodBanner12, moodBanner13, moodBanner14, moodBanner15, moodBanner16
            = new ImageView();
    @FXML
    Label moodLabel1, moodLabel2, moodLabel3, moodLabel4, moodLabel5, moodLabel6, moodLabel7, moodLabel8,
    moodLabel9, moodLabel10, moodLabel11, moodLabel12, moodLabel13, moodLabel14, moodLabel15, moodLabel16
            = new Label();
    @FXML
    AnchorPane ShadowPane, MovieDetailsPane = new AnchorPane();
    @FXML Label movieTitleDetails, movieRuntimeDetails, movieReleaseDateDetails, movieRatingsDetails,
            movieTaglineDetails, movieOverviewDetails = new Label();
    @FXML ImageView moviePosterDetails = new ImageView();

    ArrayList<Node> recommendedList = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources)  {
        try {
            loadMovies();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void handleImageMouseEntered(MouseEvent e){
        ImageView tmp = (ImageView)e.getSource();
        tmp.setScaleX(1.02);
        tmp.setScaleY(1.02);
        tmp.setCursor(Cursor.HAND);
    }

    /**
     * @param e - Mouse Event thrown by mouse entering the Node
     */
    public void handleImageMouseExit(MouseEvent e){
        ImageView tmp = (ImageView)e.getSource();
        tmp.setScaleX(.98);
        tmp.setScaleY(.98);
        tmp.setCursor(Cursor.DEFAULT);
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
    public void loadMovies() throws Exception {
        recommendedList.add(moodBanner1);
        recommendedList.add(moodBanner2);
        recommendedList.add(moodBanner3);
        recommendedList.add(moodBanner4);
        recommendedList.add(moodBanner5);
        recommendedList.add(moodBanner6);
        recommendedList.add(moodBanner7);
        recommendedList.add(moodBanner8);
        recommendedList.add(moodLabel1);
        recommendedList.add(moodLabel2);
        recommendedList.add(moodLabel3);
        recommendedList.add(moodLabel4);
        recommendedList.add(moodLabel5);
        recommendedList.add(moodLabel6);
        recommendedList.add(moodLabel7);
        recommendedList.add(moodLabel8);

        MovieRow Recommended = new MovieRow(recommendedList);
    }

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
}
