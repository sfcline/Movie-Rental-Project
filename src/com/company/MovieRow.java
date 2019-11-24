package com.company;

import javafx.scene.Node;
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
    private ArrayList<ImageView> IVList;
    private ArrayList<Label> LblList = new ArrayList<>();


    public MovieRow(ImageView Location1IV, ImageView Location2IV, ImageView Location3IV, ImageView Location4IV,
                    ImageView Location5IV, ImageView Location6IV, ImageView Location7IV, ImageView Location8IV,
                    Label Location1Lbl, Label Location2Lbl, Label Location3Lbl, Label Location4Lbl, Label Location5Lbl,
                    Label Location6Lbl, Label Location7Lbl, Label Location8Lbl) {
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
        this.IVList = new ArrayList<>();
        IVList.add(Location1IV);IVList.add(Location2IV);IVList.add(Location3IV);IVList.add(Location4IV);
        IVList.add(Location5IV);IVList.add(Location6IV);IVList.add(Location7IV);IVList.add(Location8IV);
        this.LblList = new ArrayList<Label>();
        LblList.add(Location1Lbl);LblList.add(Location2Lbl);LblList.add(Location3Lbl);LblList.add(Location4Lbl);
        LblList.add(Location5Lbl);LblList.add(Location6Lbl);LblList.add(Location7Lbl);LblList.add(Location8Lbl);
    }

    public MovieRow(ArrayList<Node> recomendedList) {
        this.Location1IV = (ImageView)recomendedList.get(0);
        this.Location2IV =(ImageView)recomendedList.get(1);
        this.Location3IV = (ImageView)recomendedList.get(2);
        this.Location4IV = (ImageView)recomendedList.get(3);
        this.Location5IV = (ImageView)recomendedList.get(4);
        this.Location6IV = (ImageView)recomendedList.get(5);
        this.Location7IV = (ImageView)recomendedList.get(6);
        this.Location8IV = (ImageView)recomendedList.get(7);
        this.Location1Lbl = (Label)recomendedList.get(8);
        this.Location2Lbl = (Label)recomendedList.get(9);
        this.Location3Lbl = (Label)recomendedList.get(10);
        this.Location4Lbl = (Label)recomendedList.get(11);
        this.Location5Lbl = (Label)recomendedList.get(12);
        this.Location6Lbl = (Label)recomendedList.get(13);
        this.Location7Lbl = (Label)recomendedList.get(14);
        this.Location8Lbl = (Label)recomendedList.get(15);

        this.moviePosterController = new DBController();
        moviePosterController.connectToDB();

        this.IVList = new ArrayList<>();
                IVList.add(Location1IV);IVList.add(Location2IV);IVList.add(Location3IV);IVList.add(Location4IV);
        IVList.add(Location5IV);IVList.add(Location6IV);IVList.add(Location7IV);IVList.add(Location8IV);
        this.LblList = new ArrayList<Label>();
        LblList.add(Location1Lbl);LblList.add(Location2Lbl);LblList.add(Location3Lbl);LblList.add(Location4Lbl);
        LblList.add(Location5Lbl);LblList.add(Location6Lbl);LblList.add(Location7Lbl);LblList.add(Location8Lbl);
    }

    public ArrayList<Movie> setPostersWithMovieIDs(int Movie_ID1, int Movie_ID2, int Movie_ID3, int Movie_ID4,
                                       int Movie_ID5, int Movie_ID6, int Movie_ID7, int Movie_ID8) {
        ArrayList<Integer> movieIdList = new ArrayList<>();
        movieIdList.add(Movie_ID1);movieIdList.add(Movie_ID2);movieIdList.add(Movie_ID3);movieIdList.add(Movie_ID4);
        movieIdList.add(Movie_ID5);movieIdList.add(Movie_ID6);movieIdList.add(Movie_ID7);movieIdList.add(Movie_ID8);


        final String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";
        ArrayList<Movie> Movies = new ArrayList<>();
        // Load Images 1-8
        for(int i = 0; i<8; i++){
            Movie tempMovie= moviePosterController.selectMovieFromMoviesWhereMovieIDis(movieIdList.get(i));
            Movies.add(tempMovie);
            Image img = new Image(MOVIE_PREFIX + tempMovie.getPoster());
            (this.IVList.get(i)).setImage(img);
            (LblList.get(i)).setText(tempMovie.getTitle());
        }


        return Movies;
    }

    public ArrayList<Movie> autoSetRowWithTag(String Tag) throws IllegalMovieArgumentException {
        final String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";
        ArrayList<Movie> posterArray = moviePosterController.selectRANDOMMoviePostersFromMoviesWhereTagIs(Tag, 8);

        // Load Image loop 1-8
        for(int i = 0; i<8; i++){
            Image tempImg = new Image(MOVIE_PREFIX + posterArray.get(i).getPoster());
            (IVList.get(i)).setImage(tempImg);
            (LblList.get(i)).setText(posterArray.get(i).getTitle());
        posterArray.get(i).setImageView(IVList.get(i).getId());
        }

    return posterArray;
    }

}
