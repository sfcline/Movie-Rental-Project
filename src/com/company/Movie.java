package com.company;

import java.util.ArrayList;

public class Movie {

  private int movieID;

  private String title;

  private Ratings rating;

  private String genre;

  private double runTime;

  private double score;

  private String star;

  private String director;

  private String writer;

  private String overview;

  private double popularity;

  private String poster;

  private String releaseDate;

  private String tagLine;

  /**
   * Movie Constructor.
   *
   * @param movieID Column A.
   * @param title Column B.
   * @param rating Column C.
   * @param genre Column D.
   * @param runTime Column E.
   * @param score Column F.
   * @param star Column G.
   * @param director Column H.
   * @param writer Column I.
   * @param overview Column K.
   * @param popularity Column L.
   * @param poster Column M.
   * @param releaseDate Column N.
   * @param tagLine Column O.
   * @throws IllegalMovieArgumentException throws exception.
   */
  public Movie(
      int movieID,
      String title,
      String rating,
      String genre,
      double runTime,
      double score,
      String star,
      String director,
      String writer,
      String overview,
      double popularity,
      String poster,
      String releaseDate,
      String tagLine)
      throws IllegalMovieArgumentException {
    setMovieID(movieID);
    setTitle(title);
    setRating(rating);
    setGenre(genre);
    setRunTime(runTime);
    setScore(score);
    setStar(star);
    setDirector(director);
    setWriter(writer);
    setOverview(overview);
    setPopularity(popularity);
    setPoster(poster);
    setReleaseDate(releaseDate);
    setTagLine(tagLine);
  }

  public int getMovieID() {
    return movieID;
  }

  /**
   * Sets unique movie ID.
   *
   * @param movieID Unique Movie ID.
   * @throws IllegalMovieArgumentException thrown if <=0;
   */
  public void setMovieID(int movieID) throws IllegalMovieArgumentException {
    if (movieID > 0) {
      this.movieID = movieID;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Movie ID "
              + movieID
              + " Movie ID must be greater than 0 "
              + "and must be unique.");
    }
  }

  public String getTitle() {
    return title;
  }

  /**
   * Sets Movie Title.
   *
   * @param title movie title.
   * @throws IllegalMovieArgumentException thrown if title is null or zero length.
   */
  public void setTitle(String title) throws IllegalMovieArgumentException {
    if (title != null && title.length() > 0) {
      this.title = title;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Title " + title + " Title must be " + "greater than zero characters long.");
    }
  }

  public Ratings getRating() {
    return rating;
  }

  /**
   * Takes in String and sets the rating to the appropriate Ratings Enum.
   *
   * @param rating Enum Rating.
   */
  public void setRating(String rating) {
    if (rating.equals(Ratings.R.toString())) {
      this.rating = Ratings.R;
    } else if (rating.equals(Ratings.PG13.toString())) {
      this.rating = Ratings.PG13;
    } else if (rating.equals(Ratings.PG.toString())) {
      this.rating = Ratings.PG;
    } else if (rating.equals(Ratings.G.toString())) {
      this.rating = Ratings.G;
    } else {
      this.rating = Ratings.NR;
    }
  }

  public String getGenre() {
    return genre;
  }

  /**
   * Sets genre of movie.
   *
   * @param genre horror, comedy etc.
   * @throws IllegalMovieArgumentException thrown if invalid string.
   */
  public void setGenre(String genre) throws IllegalMovieArgumentException {
    if (genre != null && genre.length() > 0) {
      this.genre = genre;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Genre " + genre + " Genre must be " + "greater than zero characters long.");
    }
  }

  public double getRunTime() {
    return runTime;
  }

  /**
   * Sets movie runtime.
   *
   * @param runTime how long the movie is.
   * @throws IllegalMovieArgumentException thrown if invalid runtime <0.
   */
  public void setRunTime(double runTime) throws IllegalMovieArgumentException {
    if (runTime > 0) {
      this.runTime = runTime;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Run Time " + runTime + " Run Time must be greater " + "than 0.");
    }
  }

  public double getScore() {
    return score;
  }

  /**
   * Sets movie score.
   *
   * @param score Critic's rating.
   * @throws IllegalMovieArgumentException thrown if invalid double ie <0.
   */
  public void setScore(double score) throws IllegalMovieArgumentException {
    if (score > 0) {
      this.score = score;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Score " + score + " Score must be greater than 0.");
    }
  }

  public String getStar() {
    return star;
  }

  /**
   * Sets lead star in the movie.
   *
   * @param star Leading actor.
   * @throws IllegalMovieArgumentException thrown if invalid String.
   */
  public void setStar(String star) throws IllegalMovieArgumentException {
    if (star != null && star.length() > 0) {
      this.star = star;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Star " + star + " Star must be " + "greater than zero characters long.");
    }
  }

  public String getDirector() {
    return director;
  }

  /**
   * Sets movie's Director.
   *
   * @param director Name of Director.
   * @throws IllegalMovieArgumentException thrown if invalid String.
   */
  public void setDirector(String director) throws IllegalMovieArgumentException {
    if (director != null && director.length() > 0) {
      this.director = director;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Director "
              + director
              + " Director must be "
              + "greater than zero characters long.");
    }
  }

  public String getWriter() {
    return writer;
  }

  /**
   * Sets movie's Writer.
   *
   * @param writer Movie's Writer.
   * @throws IllegalMovieArgumentException thrown if invalid String.
   */
  public void setWriter(String writer) throws IllegalMovieArgumentException {
    if (writer != null && writer.length() > 0) {
      this.writer = writer;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Writer " + writer + " Writer must be " + "greater than zero characters long.");
    }
  }

  public String getOverview() {
    return overview;
  }

  /**
   * Sets Movie's Overview.
   *
   * @param overview Movie description.
   * @throws IllegalMovieArgumentException Thrown if invalid String.
   */
  public void setOverview(String overview) throws IllegalMovieArgumentException {
    if (overview != null && overview.length() > 0) {
      this.overview = overview;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Overview "
              + overview
              + " Overview must be "
              + "greater than zero characters long.");
    }
  }

  public double getPopularity() {
    return popularity;
  }

  /**
   * Sets movie's popularity.
   *
   * @param popularity Movie's popularity in a double.
   * @throws IllegalMovieArgumentException Thrown if invalid double <0.
   */
  public void setPopularity(double popularity) throws IllegalMovieArgumentException {
    if (popularity > 0) {
      this.popularity = popularity;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Movie Popularity "
              + popularity
              + " Movie Popularity"
              + " must be greater than 0.");
    }
  }

  public String getPoster() {
    return poster;
  }

  /**
   * Sets link to movie's poster for GUI.
   *
   * @param poster address of .jpeg.
   * @throws IllegalMovieArgumentException thrown if invalid String.
   */
  public void setPoster(String poster) throws IllegalMovieArgumentException {
    if (poster != null && poster.length() > 0) {
      this.poster = poster;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Poster " + poster + " Poster must be " + "greater than zero characters long.");
    }
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  /**
   * Sets Movie's release date.
   *
   * @param releaseDate String release date.
   * @throws IllegalMovieArgumentException thrown if invalid String.
   */
  public void setReleaseDate(String releaseDate) throws IllegalMovieArgumentException {
    if (releaseDate != null && releaseDate.length() > 0) {
      this.releaseDate = releaseDate;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Release Date "
              + releaseDate
              + " Release Date must be "
              + "greater than zero characters long.");
    }
  }

  public String getTagLine() {
    return tagLine;
  }

  /**
   * Sets's Movie's tagline.
   *
   * @param tagLine Most popular line from movie.
   * @throws IllegalMovieArgumentException thrown if invalid String.
   */
  public void setTagLine(String tagLine) throws IllegalMovieArgumentException {
    if (tagLine != null && tagLine.length() > 0) {
      this.tagLine = tagLine;
    } else {
      throw new IllegalMovieArgumentException(
          "Invalid Tag Line "
              + tagLine
              + " Tag Line must be "
              + "greater than zero characters long.");
    }
  }

  /**
   * Movie class's toString.
   *
   * @return Returns important info from movie.
   */
  public String toString() {
    return "\nTitle: "
        + title
        + "\nMovie ID: "
        + movieID
        + "\nDirector: "
        + director
        + "\nStarring: "
        + star
        + "\nRated: "
        + rating
        + "\nReleased: "
        + releaseDate
        + "\n";
  }

  /**
   * Compares movieId of object to all movieId's of contents of ArrayList passed in.
   *
   * @param list Must be an ArrayList of Type Movie.
   * @return returns true if unique id and false if not unique.
   */
  public boolean isUniqueId(ArrayList<Movie> list) {
    boolean isUnique = true;
    for (Movie movie : list) {
      if (this.getMovieID() == movie.getMovieID()) {
        isUnique = false;
      }
    }
    return isUnique;
  }
}