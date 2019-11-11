package com.company;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    }

    public void setPostersWithMovieIDs(int Movie_ID1, int Movie_ID2, int Movie_ID3, int Movie_ID4,
                                       int Movie_ID5, int Movie_ID6, int Movie_ID7, int Movie_ID8) {
        DBController moviePosterController = new DBController();
        moviePosterController.connectToDB();
        final String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";
        // Load Image 1
        Image img1 = new Image(MOVIE_PREFIX + moviePosterController.selectMoviePosterFromMoviesWhereMovieIDis(Movie_ID1));
        Location1IV.setImage(img1);

        // Load Image 2
        Image img2 = new Image(MOVIE_PREFIX + moviePosterController.selectMoviePosterFromMoviesWhereMovieIDis(Movie_ID2));
        Location2IV.setImage(img2);

        // Load Image 3
        Image img3 = new Image(MOVIE_PREFIX + moviePosterController.selectMoviePosterFromMoviesWhereMovieIDis(Movie_ID3));
        Location3IV.setImage(img3);

        // Load Image 4
        Image img4 = new Image(MOVIE_PREFIX + moviePosterController.selectMoviePosterFromMoviesWhereMovieIDis(Movie_ID4));
        Location4IV.setImage(img4);

        // Load Image 5
        Image img5 = new Image(MOVIE_PREFIX + moviePosterController.selectMoviePosterFromMoviesWhereMovieIDis(Movie_ID5));
        Location5IV.setImage(img5);

        // Load Image 6
        Image img6 = new Image(MOVIE_PREFIX + moviePosterController.selectMoviePosterFromMoviesWhereMovieIDis(Movie_ID6));
        Location6IV.setImage(img6);

        // Load Image 7
        Image img7 = new Image(MOVIE_PREFIX + moviePosterController.selectMoviePosterFromMoviesWhereMovieIDis(Movie_ID7));
        Location7IV.setImage(img7);

        // Load Image 8
        Image img8 = new Image(MOVIE_PREFIX + moviePosterController.selectMoviePosterFromMoviesWhereMovieIDis(Movie_ID8));
        Location8IV.setImage(img8);
    }

    public void setLabelsWithMovieIDs(int Movie_ID1, int Movie_ID2, int Movie_ID3, int Movie_ID4,
                                      int Movie_ID5, int Movie_ID6, int Movie_ID7, int Movie_ID8) {
        DBController moviePosterController = new DBController();
        moviePosterController.connectToDB();
        // Load Image 1
        Location1Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWhereMovieIDis(Movie_ID1));

        // Load Image 2
        Location2Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWhereMovieIDis(Movie_ID2));

        // Load Image 3
        Location3Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWhereMovieIDis(Movie_ID3));

        // Load Image 4
        Location4Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWhereMovieIDis(Movie_ID4));

        // Load Image 5
        Location5Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWhereMovieIDis(Movie_ID5));

        // Load Image 6
        Location6Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWhereMovieIDis(Movie_ID6));

        // Load Image 7
        Location7Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWhereMovieIDis(Movie_ID7));

        // Load Image 8
        Location8Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWhereMovieIDis(Movie_ID8));
    }

    public void autoSetRowWithTag(String Tag) {
        DBController moviePosterController = new DBController();
        moviePosterController.connectToDB();
        final String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";
        // Load Image 1
        String Poster1 = moviePosterController.selectRANDOMMoviePosterFromMoviesWhereTagIs(Tag);
        Image img1 = new Image(MOVIE_PREFIX + Poster1);
        Location1IV.setImage(img1);
        Location1Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWherePosterIs(Poster1));

        // Load Image 2
        String Poster2 = moviePosterController.selectRANDOMMoviePosterFromMoviesWhereTagIs(Tag);
        Image img2 = new Image(MOVIE_PREFIX + Poster2);
        Location2IV.setImage(img2);
        Location2Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWherePosterIs(Poster2));

        // Load Image 3
        String Poster3 = moviePosterController.selectRANDOMMoviePosterFromMoviesWhereTagIs(Tag);
        Image img3 = new Image(MOVIE_PREFIX + Poster3);
        Location3IV.setImage(img3);
        Location3Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWherePosterIs(Poster3));

        // Load Image 4
        String Poster4 = moviePosterController.selectRANDOMMoviePosterFromMoviesWhereTagIs(Tag);
        Image img4 = new Image(MOVIE_PREFIX + Poster4);
        Location4IV.setImage(img4);
        Location4Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWherePosterIs(Poster4));

        // Load Image 5
        String Poster5 = moviePosterController.selectRANDOMMoviePosterFromMoviesWhereTagIs(Tag);
        Image img5 = new Image(MOVIE_PREFIX + Poster5);
        Location5IV.setImage(img5);
        Location5Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWherePosterIs(Poster5));

        // Load Image 6
        String Poster6 =moviePosterController.selectRANDOMMoviePosterFromMoviesWhereTagIs(Tag);
        Image img6 = new Image(MOVIE_PREFIX + Poster6);
        Location6IV.setImage(img6);
        Location6Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWherePosterIs(Poster6));

        // Load Image 7
        String Poster7 = moviePosterController.selectRANDOMMoviePosterFromMoviesWhereTagIs(Tag);
        Image img7 = new Image(MOVIE_PREFIX + Poster7);
        Location7IV.setImage(img7);
        Location7Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWherePosterIs(Poster7));

        // Load Image 8
        String Poster8 = moviePosterController.selectRANDOMMoviePosterFromMoviesWhereTagIs(Tag);
        Image img8 = new Image(MOVIE_PREFIX + Poster8);
        Location8IV.setImage(img8);
        Location8Lbl.setText(moviePosterController.selectMovieTitleFromMoviesWherePosterIs(Poster8));
    }
}
