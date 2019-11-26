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
    private String clickedButton = "";
    final String adventureBtn = "to have an adventure...";
    final String cowboyBtn = "to ride 'em, cowboy...";
    final String warBtn = "to declare war...";
    final String scaredBtn = "to be scared ****less...";
    final String laughBtn = "to laugh...";
    final String childrenBtn = "for children to be entertained...";
    final String scienceBtn = "for aliens and unicorns...";
    final String actionBtn = "for some action...";
    final String mysteryBtn = "to solve a mystery...";
    final String dramaBtn = "to start some drama...";
    final String romanceBtn = "for romance...";
    final String sleepBtn = "to learn in your sleep...";

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

    public void initialize(URL location, ResourceBundle resources) {

        try {
            //loadMovies();
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
        clickedButton = mood;
        System.out.println("Clicked Button equals " + clickedButton);
    }



    public void loadMovies(String mood) throws IllegalMovieArgumentException {
        moodTitle.setText(mood);
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

        switch (mood) {
            case (adventureBtn):
                MovieRowMood Adventure = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("Adventure", Adventure.autoSetRowWithTag("Adventure"));
                break;
            case (cowboyBtn):
                MovieRowMood Western = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("Western", Western.autoSetRowWithTag("Western"));
                break;
            case (warBtn):
                MovieRowMood War = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("War", War.autoSetRowWithTag("War"));
                break;
            case (scaredBtn):
                MovieRowMood Scared = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("Thriller", Scared.autoSetRowWithTag("Thriller"));
                break;
            case (laughBtn):
                MovieRowMood Comedy = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("Comedy", Comedy.autoSetRowWithTag("Comedy"));
                break;
            case (childrenBtn):
                MovieRowMood Family = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("Family", Family.autoSetRowWithTag("Family"));
                break;
            case (scienceBtn):
                MovieRowMood ScienceFiction = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("Fantasy", ScienceFiction.autoSetRowWithTag("Fantasy"));
                break;
            case (actionBtn):
                MovieRowMood Action = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("Action", Action.autoSetRowWithTag("Action"));
                break;
            case (sleepBtn):
                MovieRowMood History = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("History", History.autoSetRowWithTag("History"));
                break;
            case (romanceBtn):
                MovieRowMood Romance = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("Romance", Romance.autoSetRowWithTag("Romance"));
                break;
            case (dramaBtn):
                MovieRowMood Drama = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("Drama", Drama.autoSetRowWithTag("Drama"));
                break;
            case (mysteryBtn):
                MovieRowMood Mystery = new MovieRowMood(moodBanner1, moodBanner2, moodBanner3, moodBanner4, moodBanner5,
                        moodBanner6, moodBanner7, moodBanner8, moodBanner9, moodBanner10, moodBanner11, moodBanner12,
                        moodBanner13, moodBanner14, moodBanner15, moodBanner16, moodLabel1, moodLabel2, moodLabel3, moodLabel4,
                        moodLabel5, moodLabel6, moodLabel7, moodLabel8, moodLabel9, moodLabel10, moodLabel11, moodLabel12,
                        moodLabel13, moodLabel14, moodLabel15, moodLabel16);
                DisplayedMoodMovies.put("Crime", Mystery.autoSetRowWithTag("Crime"));
                break;
            default:

        }
        MovieDetailsPane.setVisible(false);
    }

    public void showMovieDetailsRecommended(MouseEvent e) {
        ImageView tmp = (ImageView) e.getSource();
        String mood = moodTitle.getText();
        switch (mood) {
            case (adventureBtn):
                Movie currentMovie1 = DisplayedMoodMovies.get("Adventure").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie1);
                break;
            case (cowboyBtn):
                Movie currentMovie2 = DisplayedMoodMovies.get("Western").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie2);
                break;
            case (warBtn):
                Movie currentMovie3 = DisplayedMoodMovies.get("War").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie3);
                break;
            case (scaredBtn):
                Movie currentMovie4 = DisplayedMoodMovies.get("Thriller").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie4);
                break;
            case (laughBtn):
                Movie currentMovie5 = DisplayedMoodMovies.get("Comedy").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie5);
                break;
            case (childrenBtn):
                Movie currentMovie6 = DisplayedMoodMovies.get("Family").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie6);
                break;
            case (scienceBtn):
                Movie currentMovie7 = DisplayedMoodMovies.get("Fantasy").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie7);
                break;
            case (actionBtn):
                Movie currentMovie8 = DisplayedMoodMovies.get("Action").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie8);
                break;
            case (sleepBtn):
                Movie currentMovie9 = DisplayedMoodMovies.get("History").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie9);
                break;
            case (romanceBtn):
                Movie currentMovie10 = DisplayedMoodMovies.get("Romance").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie10);
                break;
            case (dramaBtn):
                Movie currentMovie11 = DisplayedMoodMovies.get("Drama").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie11);
                break;
            case (mysteryBtn):
                Movie currentMovie12 = DisplayedMoodMovies.get("Crime").get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
                setDetails(currentMovie12);
                showDetails();
                break;
            default:

        }
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
