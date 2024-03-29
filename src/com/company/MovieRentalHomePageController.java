/*
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */
package com.company;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * MovieRentalHomePageController, controls everything on the main page of the program.
 */
public class MovieRentalHomePageController implements Initializable {

    private HashMap<String, ArrayList<Movie>> DisplayedMovies = new HashMap<>();
    private final String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";
    private String tempSearch = " ";

    /////////// inserting Objects to be displayed on Home Scene//////////////////////
    @FXML
    Button accountBtn = new Button();
    @FXML
    Button moodBtn = new Button();
    @FXML
    ImageView RecBanner1,
            RecBanner2,
            RecBanner3,
            RecBanner4,
            RecBanner5,
            RecBanner6,
            RecBanner7,
            RecBanner8,
            RomBanner1,
            RomBanner2,
            RomBanner3,
            RomBanner4,
            RomBanner5,
            RomBanner6,
            RomBanner7,
            RomBanner8,
            ComBanner1,
            ComBanner2,
            ComBanner3,
            ComBanner4,
            ComBanner5,
            ComBanner6,
            ComBanner7,
            ComBanner8,
            FamBanner1,
            FamBanner2,
            FamBanner3,
            FamBanner4,
            FamBanner5,
            FamBanner6,
            FamBanner7,
            FamBanner8,
            HorBanner1,
            HorBanner2,
            HorBanner3,
            HorBanner4,
            HorBanner5,
            HorBanner6,
            HorBanner7,
            HorBanner8 = new ImageView();
    @FXML
    Label RecLabel1,
            RecLabel2,
            RecLabel3,
            RecLabel4,
            RecLabel5,
            RecLabel6,
            RecLabel7,
            RecLabel8,
            RomLabel1,
            RomLabel2,
            RomLabel3,
            RomLabel4,
            RomLabel5,
            RomLabel6,
            RomLabel7,
            RomLabel8,
            ComLabel1,
            ComLabel2,
            ComLabel3,
            ComLabel4,
            ComLabel5,
            ComLabel6,
            ComLabel7,
            ComLabel8,
            FamLabel1,
            FamLabel2,
            FamLabel3,
            FamLabel4,
            FamLabel5,
            FamLabel6,
            FamLabel7,
            FamLabel8,
            HorLabel1,
            HorLabel2,
            HorLabel3,
            HorLabel4,
            HorLabel5,
            HorLabel6,
            HorLabel7,
            HorLabel8 = new Label();
    @FXML
    AnchorPane ShadowPane, MovieDetailsPane = new AnchorPane();
    @FXML
    Label movieTitleDetails,
            movieRuntimeDetails,
            movieReleaseDateDetails,
            movieRatingsDetails,
            movieTaglineDetails,
            movieOverviewDetails,
            movieStarringDetails,
            movieDirectedByDetails = new Label();
    @FXML
    ImageView moviePosterDetails = new ImageView();
    @FXML
    TextField SearchTF = new TextField();
    @FXML
    private AnchorPane searchPane;
    @FXML
    private TableView<Movie> searchTable;
    @FXML
    private TableColumn<?, ?> searchName;
    @FXML
    private TableColumn<?, ?> searchRating;
    @FXML
    private TableColumn<?, ?> searchYear;
    @FXML
    private TableColumn<MovieImage, ImageView> searchImage;
    //////////////////////////////////////////////////////////////////////////////////

    private ArrayList<Node> recommendedList = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            loadMovies();
        } catch (IllegalMovieArgumentException e) {
            e.printStackTrace();
        }
        searchPane.setVisible(false);
    }

    /**
     * Opens the Account Page.
     *
     * @throws Exception exception.
     */
    public void openAccountPage() throws Exception {
        AccountPage.display("Account Page");
        MovieRentalHomePage.close();
    }

    /**
     * Opens The Mood Page.
     *
     * @throws Exception exception
     */
    public void openMoodPage() throws Exception {
        InAMoodPage.display("In A Mood Page");
        MovieRentalHomePage.close();
    }

    /**
     * Called when the mouse enters a Node.
     *
     * @param e - Mouse Event thrown by mouse entering the Node
     */
    public void handleImageMouseEntered(MouseEvent e) {
        ImageView tmp = (ImageView) e.getSource();
        tmp.setScaleX(1.02);
        tmp.setScaleY(1.02);
        tmp.setCursor(Cursor.HAND);
    }

    /**
     * Called when mouse exits a Node.
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
     * Called when the mouse enters a Node.
     *
     * @param e - Mouse Event thrown by mouse entering the button.
     */
    public void handleButtonMouseEntered(MouseEvent e) {
        Button tmp = (Button) e.getSource();
        tmp.setScaleX(1.03);
        tmp.setScaleY(1.03);
        tmp.setCursor(Cursor.HAND);
    }

    /**
     * Called when the mouse exits a button.
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
     * Test Class for GUI to load movies in. Will be removed later.
     *
     * @throws IllegalMovieArgumentException thrown if parameter to make Movie is rejected.
     */
    private void loadMovies() throws IllegalMovieArgumentException {
        recommendedList.add(RecBanner1);
        recommendedList.add(RecBanner2);
        recommendedList.add(RecBanner3);
        recommendedList.add(RecBanner4);
        recommendedList.add(RecBanner5);
        recommendedList.add(RecBanner6);
        recommendedList.add(RecBanner7);
        recommendedList.add(RecBanner8);
        recommendedList.add(RecLabel1);
        recommendedList.add(RecLabel2);
        recommendedList.add(RecLabel3);
        recommendedList.add(RecLabel4);
        recommendedList.add(RecLabel5);
        recommendedList.add(RecLabel6);
        recommendedList.add(RecLabel7);
        recommendedList.add(RecLabel8);

        MovieRow Recommended = new MovieRow(recommendedList);
    /*
    MovieRow Recommended = new MovieRow(RecBanner1, RecBanner2, RecBanner3, RecBanner4,
            RecBanner5, RecBanner6, RecBanner7, RecBanner8,
            RecLabel1, RecLabel2, RecLabel3, RecLabel4,
            RecLabel5, RecLabel6, RecLabel7, RecLabel8);
    */
        DisplayedMovies.put("Recommended", Recommended.setPostersWithMovieIDs(1, 2, 3, 4, 5, 6, 7, 8));
        MovieRow Romance =
                new MovieRow(
                        RomBanner1,
                        RomBanner2,
                        RomBanner3,
                        RomBanner4,
                        RomBanner5,
                        RomBanner6,
                        RomBanner7,
                        RomBanner8,
                        RomLabel1,
                        RomLabel2,
                        RomLabel3,
                        RomLabel4,
                        RomLabel5,
                        RomLabel6,
                        RomLabel7,
                        RomLabel8);
        DisplayedMovies.put("Romance", Romance.autoSetRowWithTag("Romance"));
        MovieRow Comedy =
                new MovieRow(
                        ComBanner1,
                        ComBanner2,
                        ComBanner3,
                        ComBanner4,
                        ComBanner5,
                        ComBanner6,
                        ComBanner7,
                        ComBanner8,
                        ComLabel1,
                        ComLabel2,
                        ComLabel3,
                        ComLabel4,
                        ComLabel5,
                        ComLabel6,
                        ComLabel7,
                        ComLabel8);
        DisplayedMovies.put("Comedy", Comedy.autoSetRowWithTag("Comedy"));
        MovieRow Family =
                new MovieRow(
                        FamBanner1,
                        FamBanner2,
                        FamBanner3,
                        FamBanner4,
                        FamBanner5,
                        FamBanner6,
                        FamBanner7,
                        FamBanner8,
                        FamLabel1,
                        FamLabel2,
                        FamLabel3,
                        FamLabel4,
                        FamLabel5,
                        FamLabel6,
                        FamLabel7,
                        FamLabel8);
        DisplayedMovies.put("Family", Family.autoSetRowWithTag("Family"));
        MovieRow Horror =
                new MovieRow(
                        HorBanner1,
                        HorBanner2,
                        HorBanner3,
                        HorBanner4,
                        HorBanner5,
                        HorBanner6,
                        HorBanner7,
                        HorBanner8,
                        HorLabel1,
                        HorLabel2,
                        HorLabel3,
                        HorLabel4,
                        HorLabel5,
                        HorLabel6,
                        HorLabel7,
                        HorLabel8);
        DisplayedMovies.put("Horror", Horror.autoSetRowWithTag("Horror"));

        ShadowPane.setVisible(false);
        MovieDetailsPane.setVisible(false);
    }

    /**
     * Displays the movie details for the recommended row.
     *
     * @param e mouse click.
     */
    public void showMovieDetailsRecommended(MouseEvent e) {
        ImageView tmp = (ImageView) e.getSource();
        Movie currentMovie =
                DisplayedMovies.get("Recommended")
                        .get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
        setDetails(currentMovie);
        showDetails();
    }

    /**
     * Shows the movie details for the romance genre.
     *
     * @param e mouse click.
     */
    public void showMovieDetailsRomance(MouseEvent e) {
        ImageView tmp = (ImageView) e.getSource();
        Movie currentMovie =
                DisplayedMovies.get("Romance")
                        .get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
        setDetails(currentMovie);
        showDetails();
    }

    /**
     * Shows the movie details for the comedy genre.
     *
     * @param e mouse click.
     */
    public void showMovieDetailsComedy(MouseEvent e) {
        ImageView tmp = (ImageView) e.getSource();
        Movie currentMovie =
                DisplayedMovies.get("Comedy")
                        .get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
        setDetails(currentMovie);
        showDetails();
    }

    /**
     * Shows the movie details for the family genre.
     *
     * @param e mouse click.
     */
    public void showMovieDetailsFamily(MouseEvent e) {
        ImageView tmp = (ImageView) e.getSource();
        Movie currentMovie =
                DisplayedMovies.get("Family")
                        .get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
        setDetails(currentMovie);
        showDetails();
    }

    /**
     * Shows the movie details for the horror genre.
     *
     * @param e mouse click.
     */
    public void showMovieDetailsHorror(MouseEvent e) {
        ImageView tmp = (ImageView) e.getSource();
        Movie currentMovie =
                DisplayedMovies.get("Horror")
                        .get(Integer.parseInt(tmp.getId().substring((tmp.getId().length() - 1))) - 1);
        setDetails(currentMovie);
        showDetails();
    }

    /**
     * Sets the movie detail pane to visible.
     */
    private void showDetails() {
        ShadowPane.setVisible(true);
        MovieDetailsPane.setVisible(true);
    }

    /**
     * Populates the movie details pane.
     *
     * @param movie the movie to be populated.
     */
    public void setDetails(Movie movie) {
        movieTitleDetails.setText(movie.getTitle());
        movieRuntimeDetails.setText(formatRuntime(movie.getRunTime()));
        movieRatingsDetails.setText(String.valueOf(movie.getRating()));
        movieReleaseDateDetails.setText(movie.getReleaseDate());
        movieTaglineDetails.setText(movie.getTagLine());
        movieOverviewDetails.setText(movie.getOverview());
        movieDirectedByDetails.setText(movie.getDirector());
        movieStarringDetails.setText(movie.getStar());
        Image img = new Image(MOVIE_PREFIX + movie.getPoster());
        moviePosterDetails.setImage(img);
    }

    /**
     * Formats the runtime to a presentable String.
     *
     * @param runtime the number of the runtime.
     * @return the formatted String.
     */
    private String formatRuntime(double runtime) {
        String hours;
        String minutes;
        hours = String.valueOf((int) runtime / 60);
        minutes = String.valueOf(Math.round(runtime % 60));
        return hours + " hrs " + minutes + " mins";
    }

    /**
     * Called when rent movie button is clicked.
     */
    public void handleRentMovie() {

        handleCloseMovieDetails();
        System.out.println("Movie Rented!");
    }

    /**
     * Called when close movie button is clicked.
     */
    public void handleCloseMovieDetails() {
        ShadowPane.setVisible(false);
        MovieDetailsPane.setVisible(false);
        searchPane.setVisible(false);
    }

    /**
     * Searches the database for movies matching the search query text box then populates an
     * ObservableList with those movies.
     */
    public void searchQuery() {
        if (SearchTF.getText().length() > 0
                && SearchTF.getText() != null
                && !(SearchTF.getText().equals(tempSearch))) {
            tempSearch = SearchTF.getText();
            DBController searchController = new DBController();
            searchController.connectToDB();
            ArrayList<Movie> searchResultsList = searchController.selectMovieFromMoviesWhereKeywordIs(SearchTF.getText());

            for (Movie movie : searchResultsList) {
                movie.setMovieImage(movie.getPoster());
                System.out.println(MOVIE_PREFIX + movie.getPoster());
                System.out.println(movie.getMovieImage());
            }

            ObservableList<Movie> searchObservableList = FXCollections.observableArrayList(searchResultsList);
            searchPane.setVisible(true);
            ShadowPane.setVisible(true);
            searchImage.setCellValueFactory(new PropertyValueFactory<>("movieImage"));
            searchName.setCellValueFactory(new PropertyValueFactory("Title"));
            searchRating.setCellValueFactory(new PropertyValueFactory("Rating"));
            searchYear.setCellValueFactory(new PropertyValueFactory("releaseDate"));
            searchTable.setItems(searchObservableList);
            System.out.println(searchResultsList);
        } else {
            System.out.println("Please Enter Text to Search.");
        }
    }

    /**
     * Makes the search pane invisible when called.
     */
    public void movieSearchDetails() {
        setDetails(searchTable.getSelectionModel().getSelectedItem());
        showDetails();
        searchPane.setVisible(false);
    }

    /**
     * Makes the search pane visible when called.
     */
    public void movieSearchShow() {
        searchPane.setVisible(true);
        ShadowPane.setVisible(true);
    }
} // end
