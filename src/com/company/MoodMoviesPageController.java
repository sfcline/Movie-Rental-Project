package com.company;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
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
    @FXML Label moodTitle = new Label();

    @FXML
    ImageView moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5, moodBanner6, moodBanner7, moodBanner8,
    moodBanner9, moodBanner10, moodBanner11, moodBanner12, moodBanner13, moodBanner14, moodBanner15, moodBanner16
            = new ImageView();
    @FXML
    Label moodLabel1, moodLabel2, moodLabel3, moodLabel4, moodLabel5, moodLabel6, moodLabel7, moodLabel8,
    moodLabel9, moodLabel10, moodLabel11, moodLabel12, moodLabel13, moodLabel14, moodLabel15, moodLabel16
            = new Label();
    @FXML
    AnchorPane MovieDetailsPane = new AnchorPane();
    @FXML Label movieTitleDetails, movieRuntimeDetails, movieReleaseDateDetails, movieRatingsDetails,
            movieTaglineDetails, movieOverviewDetails = new Label();
    @FXML ImageView moviePosterDetails = new ImageView();

    ArrayList<Node> recommendedMoodList = new ArrayList<>();

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

    public void settingMoodTitle(String mood) {
        moodTitle.setText(mood);
    }

    public void loadMovies() {
        recommendedMoodList.add(moodBanner1);
        recommendedMoodList.add(moodBanner2);
        recommendedMoodList.add(moodBanner3);
        recommendedMoodList.add(moodBanner4);
        recommendedMoodList.add(moodBanner5);
        recommendedMoodList.add(moodBanner6);
        recommendedMoodList.add(moodBanner7);
        recommendedMoodList.add(moodBanner8);
        recommendedMoodList.add(moodBanner9);
        recommendedMoodList.add(moodBanner10);
        recommendedMoodList.add(moodBanner11);
        recommendedMoodList.add(moodBanner12);
        recommendedMoodList.add(moodBanner13);
        recommendedMoodList.add(moodBanner14);
        recommendedMoodList.add(moodBanner15);
        recommendedMoodList.add(moodBanner16);
        recommendedMoodList.add(moodLabel1);
        recommendedMoodList.add(moodLabel2);
        recommendedMoodList.add(moodLabel3);
        recommendedMoodList.add(moodLabel4);
        recommendedMoodList.add(moodLabel5);
        recommendedMoodList.add(moodLabel6);
        recommendedMoodList.add(moodLabel7);
        recommendedMoodList.add(moodLabel8);
        recommendedMoodList.add(moodLabel9);
        recommendedMoodList.add(moodLabel10);
        recommendedMoodList.add(moodLabel11);
        recommendedMoodList.add(moodLabel12);
        recommendedMoodList.add(moodLabel13);
        recommendedMoodList.add(moodLabel14);
        recommendedMoodList.add(moodLabel15);
        recommendedMoodList.add(moodLabel16);


        MovieRowMood Recommended = new MovieRowMood(recommendedMoodList);
        DisplayedMoodMovies.put("Recommended", Recommended.setPostersWithMovieIDs(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));

        MovieDetailsPane.setVisible(false);
    }

    public void showMovieDetailsRecommended(MouseEvent e) {
        ImageView tmp = (ImageView) e.getSource();
        Movie currentMovie = DisplayedMoodMovies.get("Recommended").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length()-1)))-1);
        setDetails(currentMovie);
        showDetails();
    }

    public void showDetails(){
        MovieDetailsPane.setVisible(true);
    }
    public void setDetails(Movie movie) {
        movieTitleDetails.setText(movie.getTitle());
        movieRuntimeDetails.setText(formatRuntime(movie.getRunTime()));
        movieRatingsDetails.setText(String.valueOf(movie.getRating()));
        movieReleaseDateDetails.setText(movie.getReleaseDate());
        movieTaglineDetails.setText(movie.getTagLine());
        movieOverviewDetails.setText(movie.getOverview());
        Image img = new Image(MOVIE_PREFIX + movie.getPoster());
        moviePosterDetails.setImage(img);
    }

    public String formatRuntime(double runtime) {
        String hours;
        String minutes;
        hours = String.valueOf((int)runtime/60);
        minutes = String.valueOf(Math.round(runtime%60));
        return hours + " hrs " + minutes + " mins";
    }

    public void handleRentMovie() {
        handleCloseMovieDetails();
        System.out.println("Movie Rented!");
    }

    public void handleCloseMovieDetails() {
        MovieDetailsPane.setVisible(false);
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
