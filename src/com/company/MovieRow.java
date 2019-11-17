package com.company;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class MovieRow {
    private ImageView Location1IV;
    private ImageView Location2IV;
    private ImageView Location3IV;
    private ImageView Location4IV;
    private ImageView Location5IV;
    private ImageView Location6IV;
    private ImageView Location7IV;
    private ImageView Location8IV;
    private Label Location1Lbl;
    private Label Location2Lbl;
    private Label Location3Lbl;
    private Label Location4Lbl;
    private Label Location5Lbl;
    private Label Location6Lbl;
    private Label Location7Lbl;
    private Label Location8Lbl;
    private DBController moviePosterController;


    public MovieRow(ImageView Location1IV, ImageView Location2IV, ImageView Location3IV, ImageView Location4IV, ImageView Location5IV, ImageView Location6IV, ImageView Location7IV, ImageView Location8IV,
                    Label Location1Lbl, Label Location2Lbl, Label Location3Lbl, Label Location4Lbl, Label Location5Lbl, Label Location6Lbl, Label Location7Lbl, Label Location8Lbl) {
        this.Location1IV = Location1IV;
        this.Location2IV = Location2IV;
        this.Location3IV = Location3IV;
        this.Location4IV = Location4IV;
        this.Location5IV = Location5IV;
        this.Location6IV = Location6IV;
        this.Location7IV = Location7IV;
        this.Location8IV = Location8IV;
        this.Location1Lbl = Location1Lbl;
        this.Location2Lbl = Location2Lbl;
        this.Location3Lbl = Location3Lbl;
        this.Location4Lbl = Location4Lbl;
        this.Location5Lbl = Location5Lbl;
        this.Location6Lbl = Location6Lbl;
        this.Location7Lbl = Location7Lbl;
        this.Location8Lbl = Location8Lbl;
        this.moviePosterController = new DBController();
        moviePosterController.connectToDB();
    }

    public ArrayList<Movie> setPostersWithMovieIDs(int Movie_ID1, int Movie_ID2, int Movie_ID3, int Movie_ID4,
                                       int Movie_ID5, int Movie_ID6, int Movie_ID7, int Movie_ID8) {
        final String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";
        ArrayList<Movie> Movies = new ArrayList<>();
        // Load Image 1
        Movie movie1= moviePosterController.selectMovieFromMoviesWhereMovieIDis(Movie_ID1);
        Movies.add(movie1);
        Image img1 = new Image(MOVIE_PREFIX + movie1.getPoster());
        Location1IV.setImage(img1);
        Location1Lbl.setText(movie1.getTitle());

        // Load Image 2
        Movie movie2= moviePosterController.selectMovieFromMoviesWhereMovieIDis(Movie_ID2);
        Movies.add(movie2);
        Image img2 = new Image(MOVIE_PREFIX + movie2.getPoster());
        Location2IV.setImage(img2);
        Location2Lbl.setText(movie2.getTitle());

        // Load Image 3
        Movie movie3= moviePosterController.selectMovieFromMoviesWhereMovieIDis(Movie_ID3);
        Movies.add(movie3);
        Image img3 = new Image(MOVIE_PREFIX + movie3.getPoster());
        Location3IV.setImage(img3);
        Location3Lbl.setText(movie3.getTitle());

        // Load Image 4
        Movie movie4= moviePosterController.selectMovieFromMoviesWhereMovieIDis(Movie_ID4);
        Movies.add(movie4);
        Image img4 = new Image(MOVIE_PREFIX + movie4.getPoster());
        Location4IV.setImage(img4);
        Location4Lbl.setText(movie4.getTitle());

        // Load Image 5
        Movie movie5= moviePosterController.selectMovieFromMoviesWhereMovieIDis(Movie_ID5);
        Movies.add(movie5);
        Image img5 = new Image(MOVIE_PREFIX + movie5.getPoster());
        Location5IV.setImage(img5);
        Location5Lbl.setText(movie5.getTitle());

        // Load Image 6
        Movie movie6= moviePosterController.selectMovieFromMoviesWhereMovieIDis(Movie_ID6);
        Movies.add(movie6);
        Image img6 = new Image(MOVIE_PREFIX + movie6.getPoster());
        Location6IV.setImage(img6);
        Location6Lbl.setText(movie6.getTitle());

        // Load Image 7
        Movie movie7= moviePosterController.selectMovieFromMoviesWhereMovieIDis(Movie_ID7);
        Movies.add(movie7);
        Image img7 = new Image(MOVIE_PREFIX + movie7.getPoster());
        Location7IV.setImage(img7);
        Location7Lbl.setText(movie7.getTitle());

        // Load Image 8
        Movie movie8= moviePosterController.selectMovieFromMoviesWhereMovieIDis(Movie_ID8);
        Movies.add(movie8);
        Image img8 = new Image(MOVIE_PREFIX + movie8.getPoster());
        Location8IV.setImage(img8);
        Location8Lbl.setText(movie8.getTitle());

        return Movies;
    }

    public ArrayList<Movie> autoSetRowWithTag(String Tag) throws IllegalMovieArgumentException {
        final String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";
        ArrayList<Movie> posterArray = moviePosterController.selectRANDOMMoviePostersFromMoviesWhereTagIs(Tag, 8);
        // Load Image 1
        Image img1 = new Image(MOVIE_PREFIX + posterArray.get(0).getPoster());
        Location1IV.setImage(img1);
        Location1Lbl.setText(posterArray.get(0).getTitle());
        posterArray.get(0).setImageView(Location1IV.getId());

        // Load Image 2
        Image img2 = new Image(MOVIE_PREFIX + posterArray.get(1).getPoster());
        Location2IV.setImage(img2);
        Location2Lbl.setText(posterArray.get(1).getTitle());
        posterArray.get(1).setImageView(Location1IV.getId());

        // Load Image 3
        Image img3 = new Image(MOVIE_PREFIX + posterArray.get(2).getPoster());
        Location3IV.setImage(img3);
        Location3Lbl.setText(posterArray.get(2).getTitle());
        posterArray.get(2).setImageView(Location1IV.getId());

        // Load Image 4
        Image img4 = new Image(MOVIE_PREFIX + posterArray.get(3).getPoster());
        Location4IV.setImage(img4);
        Location4Lbl.setText(posterArray.get(3).getTitle());
        posterArray.get(3).setImageView(Location1IV.getId());

        // Load Image 5
        Image img5 = new Image(MOVIE_PREFIX + posterArray.get(4).getPoster());
        Location5IV.setImage(img5);
        Location5Lbl.setText(posterArray.get(4).getTitle());
        posterArray.get(4).setImageView(Location1IV.getId());

        // Load Image 6
        Image img6 = new Image(MOVIE_PREFIX + posterArray.get(5).getPoster());
        Location6IV.setImage(img6);
        Location6Lbl.setText(posterArray.get(5).getTitle());
        posterArray.get(5).setImageView(Location1IV.getId());

        // Load Image 7
        Image img7 = new Image(MOVIE_PREFIX + posterArray.get(6).getPoster());
        Location7IV.setImage(img7);
        Location7Lbl.setText(posterArray.get(6).getTitle());
        posterArray.get(6).setImageView(Location1IV.getId());

        // Load Image 8
        Image img8 = new Image(MOVIE_PREFIX + posterArray.get(7).getPoster());
        Location8IV.setImage(img8);
        Location8Lbl.setText(posterArray.get(7).getTitle());
        posterArray.get(7).setImageView(Location1IV.getId());

    return posterArray;
    }

}
