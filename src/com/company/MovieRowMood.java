package com.company;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class MovieRowMood {
  private ImageView Location1IV;
  private ImageView Location2IV;
  private ImageView Location3IV;
  private ImageView Location4IV;
  private ImageView Location5IV;
  private ImageView Location6IV;
  private ImageView Location7IV;
  private ImageView Location8IV;
  private ImageView Location9IV;
  private ImageView Location10IV;
  private ImageView Location11IV;
  private ImageView Location12IV;
  private ImageView Location13IV;
  private ImageView Location14IV;
  private ImageView Location15IV;
  private ImageView Location16IV;
  private Label Location1Lbl;
  private Label Location2Lbl;
  private Label Location3Lbl;
  private Label Location4Lbl;
  private Label Location5Lbl;
  private Label Location6Lbl;
  private Label Location7Lbl;
  private Label Location8Lbl;
  private Label Location9Lbl;
  private Label Location10Lbl;
  private Label Location11Lbl;
  private Label Location12Lbl;
  private Label Location13Lbl;
  private Label Location14Lbl;
  private Label Location15Lbl;
  private Label Location16Lbl;
  private DBController moviePosterController;
  private ArrayList<ImageView> IVList;
  private ArrayList<Label> LblList = new ArrayList<>();

  /**
   * Sets the movie row based on the mood.
   *
   * @param Location1IV Location.
   * @param Location2IV Location.
   * @param Location3IV Location.
   * @param Location4IV Location.
   * @param Location5IV Location.
   * @param Location6IV Location.
   * @param Location7IV Location.
   * @param Location8IV Location.
   * @param Location9IV Location.
   * @param Location10IV Location.
   * @param Location11IV Location.
   * @param Location12IV Location.
   * @param Location13IV Location.
   * @param Location14IV Location.
   * @param Location15IV Location.
   * @param Location16IV Location.
   * @param Location1Lbl Location.
   * @param Location2Lbl Location.
   * @param Location3Lbl Location.
   * @param Location4Lbl Location.
   * @param Location5Lbl Location.
   * @param Location6Lbl Location.
   * @param Location7Lbl Location.
   * @param Location8Lbl Location.
   * @param Location9Lbl Location.
   * @param Location10Lbl Location.
   * @param Location11Lbl Location.
   * @param Location12Lbl Location.
   * @param Location13Lbl Location.
   * @param Location14Lbl Location.
   * @param Location15Lbl Location.
   * @param Location16Lbl Location.
   */
  public MovieRowMood(
      ImageView Location1IV,
      ImageView Location2IV,
      ImageView Location3IV,
      ImageView Location4IV,
      ImageView Location5IV,
      ImageView Location6IV,
      ImageView Location7IV,
      ImageView Location8IV,
      ImageView Location9IV,
      ImageView Location10IV,
      ImageView Location11IV,
      ImageView Location12IV,
      ImageView Location13IV,
      ImageView Location14IV,
      ImageView Location15IV,
      ImageView Location16IV,
      Label Location1Lbl,
      Label Location2Lbl,
      Label Location3Lbl,
      Label Location4Lbl,
      Label Location5Lbl,
      Label Location6Lbl,
      Label Location7Lbl,
      Label Location8Lbl,
      Label Location9Lbl,
      Label Location10Lbl,
      Label Location11Lbl,
      Label Location12Lbl,
      Label Location13Lbl,
      Label Location14Lbl,
      Label Location15Lbl,
      Label Location16Lbl) {
    this.Location1IV = Location1IV;
    this.Location2IV = Location2IV;
    this.Location3IV = Location3IV;
    this.Location4IV = Location4IV;
    this.Location5IV = Location5IV;
    this.Location6IV = Location6IV;
    this.Location7IV = Location7IV;
    this.Location8IV = Location8IV;
    this.Location9IV = Location9IV;
    this.Location10IV = Location10IV;
    this.Location11IV = Location11IV;
    this.Location12IV = Location12IV;
    this.Location13IV = Location13IV;
    this.Location14IV = Location14IV;
    this.Location15IV = Location15IV;
    this.Location16IV = Location16IV;
    this.Location1Lbl = Location1Lbl;
    this.Location2Lbl = Location2Lbl;
    this.Location3Lbl = Location3Lbl;
    this.Location4Lbl = Location4Lbl;
    this.Location5Lbl = Location5Lbl;
    this.Location6Lbl = Location6Lbl;
    this.Location7Lbl = Location7Lbl;
    this.Location8Lbl = Location8Lbl;
    this.Location9Lbl = Location9Lbl;
    this.Location10Lbl = Location10Lbl;
    this.Location11Lbl = Location11Lbl;
    this.Location12Lbl = Location12Lbl;
    this.Location13Lbl = Location13Lbl;
    this.Location14Lbl = Location14Lbl;
    this.Location15Lbl = Location15Lbl;
    this.Location16Lbl = Location16Lbl;
    this.moviePosterController = new DBController();
    moviePosterController.connectToDB();
    this.IVList = new ArrayList<>();
    IVList.add(Location1IV);
    IVList.add(Location2IV);
    IVList.add(Location3IV);
    IVList.add(Location4IV);
    IVList.add(Location5IV);
    IVList.add(Location6IV);
    IVList.add(Location7IV);
    IVList.add(Location8IV);
    IVList.add(Location9IV);
    IVList.add(Location10IV);
    IVList.add(Location11IV);
    IVList.add(Location12IV);
    IVList.add(Location13IV);
    IVList.add(Location14IV);
    IVList.add(Location15IV);
    IVList.add(Location16IV);
    this.LblList = new ArrayList<Label>();
    LblList.add(Location1Lbl);
    LblList.add(Location2Lbl);
    LblList.add(Location3Lbl);
    LblList.add(Location4Lbl);
    LblList.add(Location5Lbl);
    LblList.add(Location6Lbl);
    LblList.add(Location7Lbl);
    LblList.add(Location8Lbl);
    LblList.add(Location9Lbl);
    LblList.add(Location10Lbl);
    LblList.add(Location11Lbl);
    LblList.add(Location12Lbl);
    LblList.add(Location13Lbl);
    LblList.add(Location14Lbl);
    LblList.add(Location15Lbl);
    LblList.add(Location16Lbl);
  }

  /**
   * Populates movie row based on mood.
   *
   * @param recomendedList the list to be based from.
   */
  public MovieRowMood(ArrayList<Node> recomendedList) {
    this.Location1IV = (ImageView) recomendedList.get(0);
    this.Location2IV = (ImageView) recomendedList.get(1);
    this.Location3IV = (ImageView) recomendedList.get(2);
    this.Location4IV = (ImageView) recomendedList.get(3);
    this.Location5IV = (ImageView) recomendedList.get(4);
    this.Location6IV = (ImageView) recomendedList.get(5);
    this.Location7IV = (ImageView) recomendedList.get(6);
    this.Location8IV = (ImageView) recomendedList.get(7);
    this.Location9IV = (ImageView) recomendedList.get(8);
    this.Location10IV = (ImageView) recomendedList.get(9);
    this.Location11IV = (ImageView) recomendedList.get(10);
    this.Location12IV = (ImageView) recomendedList.get(11);
    this.Location13IV = (ImageView) recomendedList.get(12);
    this.Location14IV = (ImageView) recomendedList.get(13);
    this.Location15IV = (ImageView) recomendedList.get(14);
    this.Location16IV = (ImageView) recomendedList.get(15);
    this.Location1Lbl = (Label) recomendedList.get(16);
    this.Location2Lbl = (Label) recomendedList.get(17);
    this.Location3Lbl = (Label) recomendedList.get(18);
    this.Location4Lbl = (Label) recomendedList.get(19);
    this.Location5Lbl = (Label) recomendedList.get(20);
    this.Location6Lbl = (Label) recomendedList.get(21);
    this.Location7Lbl = (Label) recomendedList.get(22);
    this.Location8Lbl = (Label) recomendedList.get(23);
    this.Location9Lbl = (Label) recomendedList.get(24);
    this.Location10Lbl = (Label) recomendedList.get(25);
    this.Location11Lbl = (Label) recomendedList.get(26);
    this.Location12Lbl = (Label) recomendedList.get(27);
    this.Location13Lbl = (Label) recomendedList.get(28);
    this.Location14Lbl = (Label) recomendedList.get(29);
    this.Location15Lbl = (Label) recomendedList.get(30);
    this.Location16Lbl = (Label) recomendedList.get(31);

    this.moviePosterController = new DBController();
    moviePosterController.connectToDB();

    this.IVList = new ArrayList<>();
    IVList.add(Location1IV);
    IVList.add(Location2IV);
    IVList.add(Location3IV);
    IVList.add(Location4IV);
    IVList.add(Location5IV);
    IVList.add(Location6IV);
    IVList.add(Location7IV);
    IVList.add(Location8IV);
    IVList.add(Location9IV);
    IVList.add(Location10IV);
    IVList.add(Location11IV);
    IVList.add(Location12IV);
    IVList.add(Location13IV);
    IVList.add(Location14IV);
    IVList.add(Location15IV);
    IVList.add(Location16IV);
    this.LblList = new ArrayList<Label>();
    LblList.add(Location1Lbl);
    LblList.add(Location2Lbl);
    LblList.add(Location3Lbl);
    LblList.add(Location4Lbl);
    LblList.add(Location5Lbl);
    LblList.add(Location6Lbl);
    LblList.add(Location7Lbl);
    LblList.add(Location8Lbl);
    LblList.add(Location9Lbl);
    LblList.add(Location10Lbl);
    LblList.add(Location11Lbl);
    LblList.add(Location12Lbl);
    LblList.add(Location13Lbl);
    LblList.add(Location14Lbl);
    LblList.add(Location15Lbl);
    LblList.add(Location16Lbl);
  }

  /**
   * Sets each poster based on movie Ids.
   *
   * @param Movie_ID1 movie id.
   * @param Movie_ID2 movie id.
   * @param Movie_ID3 movie id.
   * @param Movie_ID4 movie id.
   * @param Movie_ID5 movie id.
   * @param Movie_ID6 movie id.
   * @param Movie_ID7 movie id.
   * @param Movie_ID8 movie id.
   * @param Movie_ID9 movie id.
   * @param Movie_ID10 movie id.
   * @param Movie_ID11 movie id.
   * @param Movie_ID12 movie id.
   * @param Movie_ID13 movie id.
   * @param Movie_ID14 movie id.
   * @param Movie_ID15 movie id.
   * @param Movie_ID16 movie id.
   * @return the array list of movies.
   */
  public ArrayList<Movie> setPostersWithMovieIDs(
      int Movie_ID1,
      int Movie_ID2,
      int Movie_ID3,
      int Movie_ID4,
      int Movie_ID5,
      int Movie_ID6,
      int Movie_ID7,
      int Movie_ID8,
      int Movie_ID9,
      int Movie_ID10,
      int Movie_ID11,
      int Movie_ID12,
      int Movie_ID13,
      int Movie_ID14,
      int Movie_ID15,
      int Movie_ID16) {
    ArrayList<Integer> movieIdList = new ArrayList<>();
    movieIdList.add(Movie_ID1);
    movieIdList.add(Movie_ID2);
    movieIdList.add(Movie_ID3);
    movieIdList.add(Movie_ID4);
    movieIdList.add(Movie_ID5);
    movieIdList.add(Movie_ID6);
    movieIdList.add(Movie_ID7);
    movieIdList.add(Movie_ID8);
    movieIdList.add(Movie_ID9);
    movieIdList.add(Movie_ID10);
    movieIdList.add(Movie_ID11);
    movieIdList.add(Movie_ID12);
    movieIdList.add(Movie_ID13);
    movieIdList.add(Movie_ID14);
    movieIdList.add(Movie_ID15);
    movieIdList.add(Movie_ID16);

    final String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";
    ArrayList<Movie> Movies = new ArrayList<>();
    // Load Images 1-16
    for (int i = 0; i < 16; i++) {
      Movie tempMovie =
          moviePosterController.selectMovieFromMoviesWhereMovieIDis(movieIdList.get(i));
      Movies.add(tempMovie);
      Image img = new Image(MOVIE_PREFIX + tempMovie.getPoster());
      (this.IVList.get(i)).setImage(img);
      (LblList.get(i)).setText(tempMovie.getTitle());
    }

    return Movies;
  }

  /**
   * Automatically sets the row based on the tag parameter passed.
   *
   * @param Tag parameter passed that the search is based on.
   * @return the ArrayList of movies that was created.
   * @throws IllegalMovieArgumentException thrown if any illegal arguments are found.
   */
  public ArrayList<Movie> autoSetRowWithTag(String Tag) throws IllegalMovieArgumentException {
    final String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";
    ArrayList<Movie> posterArray =
        moviePosterController.selectRANDOMMoviePostersFromMoviesWhereTagIs(Tag, 16);

    // Load Image loop 1-16
    for (int i = 0; i < posterArray.size(); i++) {
      Image tempImg = new Image(MOVIE_PREFIX + posterArray.get(i).getPoster());
      (IVList.get(i)).setImage(tempImg);
      (LblList.get(i)).setText(posterArray.get(i).getTitle());
      posterArray.get(i).setImageView(IVList.get(i).getId());
    }

    return posterArray;
  }
}
