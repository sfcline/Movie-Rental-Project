/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

/** DBController class. Used to control the Database. All Database functions are kept here. */
public class DBController {

  static final String JDBC_DRIVER = "org.h2.Driver";
  static final String DB_URL = "jdbc:h2:./libs/movieDB";
  static final String USER = "";

  static final String PASS = "";
  private Connection conn = null;
  private Statement statement;


  /**
   * Connects to Data Base.
   */
  public void connectToDB() {
    try {
      Class.forName(JDBC_DRIVER);

      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      statement = conn.createStatement();

    } catch (ClassNotFoundException e) {
      e.printStackTrace();

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }//end connectToDB

  /**
   * Selects all from Movies Table, and Prints with formatting.
   */
  public void selectAllFromMovies() {
    ResultSet rs = null;
    try {
      Statement stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT * FROM MOVIES;");

      while (rs.next()) {
        System.out.printf("Movie ID = %d%n", rs.getInt("MOVIE_ID"));
        System.out.printf("Title = %s%n", rs.getString("TITLE"));
        System.out.printf("Rating = %s%n", rs.getString("RATING"));
        System.out.printf("Genre = %s%n", rs.getString("GENRE"));
        System.out.printf("Runtime = %f%n", rs.getDouble("RUNTIME"));
        System.out.printf("Score   = %f%n", rs.getDouble("SCORE"));
        System.out.printf("Star = %s%n", rs.getString("STAR"));
        System.out.printf("Director = %s%n", rs.getString("DIRECTOR"));
        System.out.printf("Writer = %s%n", rs.getString("WRITER"));
        System.out.printf("Overview = %s%n", rs.getString("OVERVIEW"));
        System.out.printf("Popularity = %d%n", rs.getInt("POPULARITY"));
        System.out.printf("Overview = %s%n", rs.getString("OVERVIEW"));
        System.out.printf("Poster = %s%n", rs.getString("POSTER"));
        System.out.printf("Release Date = %s%n", rs.getString("RELEASE_DATE"));
        System.out.printf("Tagline = %s%n", rs.getString("TAGLINE"));
      }
    } catch (SQLException e) {
      System.out.println("ERROR: Selecting all from Movies Failed.");
      System.out.println("Reason:" + e);
    }
  }//end selectAllFromMovies

  /**
   * Selects Poster Suffix where a Movie ID is equal to the Parameter
   *
   * @param Movie_ID - Movie Id of the requested Poster
   * @return Poster - Poster Suffix of movie requested
   */
  public Movie selectMovieFromMoviesWhereMovieIDis(int Movie_ID) {
    ResultSet rs = null;
    Movie movie = null;
    try {
      String insertQuery = "SELECT * FROM MOVIES WHERE MOVIE_ID=?;";
      PreparedStatement pstmt = conn.prepareStatement(insertQuery);
      pstmt.setInt(1, Movie_ID);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        movie = new Movie(rs.getInt("movie_id"),
                rs.getString("title"),
                rs.getString("rating"),
                rs.getString("genre"),
                rs.getDouble("runtime"),
                rs.getDouble("score"),
                rs.getString("star"),
                rs.getString("director"),
                rs.getString("writer"),
                rs.getString("overview"),
                rs.getInt("popularity"),
                rs.getString("poster"),
                rs.getString("release_date"),
                rs.getString("tagline"));
      }
    } catch (SQLException | IllegalMovieArgumentException e) {
      System.out.println("ERROR: Selecting Poster from Movies Failed.");
      System.out.println("Reason:" + e);
    }
    return movie;
  }//end selectMoviePosterFromMoviesWhereMovieIDis



  /**
   * Selects Poster Suffix where a Title is equal to the Parameter
   *
   * @param Title- Movie Id of the requested Poster
   * @return Poster - Poster Suffix of movie requested
   */
  public String selectMoviePosterFromMoviesWhereTitleis(String Title) {
    String Poster = "";
    ResultSet rs = null;
    try {
      String insertQuery = "SELECT POSTER FROM MOVIES WHERE TITLE=?;";
      PreparedStatement pstmt = conn.prepareStatement(insertQuery);
      pstmt.setString(1, Title);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        Poster = rs.getString("POSTER");
      }
    } catch (SQLException e) {
      System.out.println("ERROR: Selecting Poster from Movies Failed.");
      System.out.println("Reason:" + e);
    }
    return Poster;
  }//end selectMoviePosterFromMoviesWhereMovieIDis


  /**
   * Selects Poster Suffix where a Title is equal to the Parameter
   *
   * @param Tag- Movie Id of the requested Poster
   * @return Poster - Poster Suffix of movie requested
   */
  public ArrayList<Movie> selectRANDOMMoviePostersFromMoviesWhereTagIs(String Tag, int amountofPosters) {
    ArrayList<String> MovieNames = new ArrayList<>();
    String[] Posters = new String[amountofPosters];
    ResultSet rs = null;
    Movie movie = null;
    ArrayList<Movie> Movies = new ArrayList<>();
    try {
      String insertQuery = "SELECT MOVIE_NAME FROM TAGFORMOVIES WHERE TAG_NAME=?;";
      PreparedStatement pstmt = conn.prepareStatement(insertQuery);
      pstmt.setString(1, Tag);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        MovieNames.add(rs.getString("MOVIE_NAME"));
      }
    } catch (SQLException e) {
      System.out.println("ERROR: Selecting Poster from MovieNames Failed.");
      System.out.println("Reason1:" + e);
    }
    Random rdm = new Random();
    for (int i = 0; i < amountofPosters; i++) {
      String movieChoice = MovieNames.get(rdm.nextInt((MovieNames.size()-i)));
      Posters[i] = movieChoice;
      MovieNames.remove(movieChoice);
      try {
        String insertQuery = "SELECT * FROM MOVIES WHERE TITLE=?;";
        PreparedStatement pstmt = conn.prepareStatement(insertQuery);
        pstmt.setString(1, Posters[i]);
        rs = pstmt.executeQuery();

        while (rs.next()) {
          movie = new Movie(rs.getInt("movie_id"),
                  rs.getString("title"),
                  rs.getString("rating"),
                  rs.getString("genre"),
                  rs.getDouble("runtime"),
                  rs.getDouble("score"),
                  rs.getString("star"),
                  rs.getString("director"),
                  rs.getString("writer"),
                  rs.getString("overview"),
                  rs.getInt("popularity"),
                  rs.getString("poster"),
                  rs.getString("release_date"),
                  rs.getString("tagline"));
          Posters[i] = (movie.getPoster());
          Movies.add(movie);
        }
      } catch (SQLException | IllegalMovieArgumentException e) {
        System.out.println("ERROR: Selecting Poster from MovieNames Failed.");
        System.out.println("Reason2:" + e);
      }
    }
    return Movies;
  }//end selectMoviePosterFromMoviesWhereMovieIDis

  /**
   * Selects Title where a Movie ID is equal to the Parameter
   *
   * @param Poster - Movie Id of the requested Title
   * @return Title - Title of movie requested
   */
  public String selectMovieTitleFromMoviesWherePosterIs(String Poster) {
    String Title = "";
    ResultSet rs = null;
    try {
      String insertQuery = "SELECT TITLE FROM MOVIES WHERE POSTER=?;";
      PreparedStatement pstmt = conn.prepareStatement(insertQuery);
      pstmt.setString(1, Poster);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        Title = rs.getString("TITLE");
      }
    } catch (SQLException e) {
      System.out.println("ERROR: Selecting Title from Movies Failed.");
      System.out.println("Reason:" + e);
    }
    return Title;
  }

  public void insertIntoUsers(String val1, String val2) throws SQLException {
    if (!selectFromUsersWhereUsernameIs(val1)) {
      String[] insertValues = {val1, val2};
      try {
        String insertQuery = "INSERT INTO USERS"
                + "(USER_NAME, PASSWORD)" + " VALUES (?, ?);";
        PreparedStatement pstmt = conn.prepareStatement(insertQuery);
        pstmt.setString(1, insertValues[0]);
        pstmt.setString(2, insertValues[1]);
        pstmt.executeUpdate();
      } catch (SQLException e) {
        System.out.println("ERROR: insertIntoUsers Failed!");
        System.out.println(e);
      }
    }else {
      System.out.println("User Already Exists!");
    }
  }//end insert into users

  /**
   * Used to find if a user exist's with the chosen Username
   *
   * @param value - value of Username that you are searching for
   * @return userExists - true or false depending
   * */
  public boolean selectFromUsersWhereUsernameIs(String value) {
    boolean userExists = true;
    ResultSet rs = null;
    try {
      String insertQuery = "SELECT * FROM USERS WHERE USER_NAME IS ?;";
      PreparedStatement pstmt = conn.prepareStatement(insertQuery);
      pstmt.setString(1, value);
      rs = pstmt.executeQuery(insertQuery);
    } catch (SQLException e) {
      userExists = false;
    }
    return userExists;
  }

  /**
   * Selects Poster Suffix where a Title is equal to the Parameter
   *
   * @param Keyword- Movie Id of the requested Poster
   * @return Poster - Poster Suffix of movie requested
   */
  public ArrayList<Movie> selectMovieFromMoviesWhereKeywordIs(String Keyword) {
    ResultSet rs = null;
    Movie movie = null;
    ArrayList<Movie> Movies = new ArrayList<>();
    try {
      String insertQuery = "SELECT * FROM MOVIES WHERE " +
              "TITLE LIKE ? " +
              "OR RATING LIKE ? " +
              "OR GENRE LIKE ? " +
              "OR STAR LIKE ? " +
              "OR DIRECTOR LIKE ? " +
              "OR WRITER LIKE ? " +
              "OR OVERVIEW LIKE ? " +
              "OR TAGLINE LIKE ?;";
      PreparedStatement pstmt = conn.prepareStatement(insertQuery);
      pstmt.setString(1, ("%"+Keyword+"%"));
      pstmt.setString(2, ("%"+Keyword+"%"));
      pstmt.setString(3, ("%"+Keyword+"%"));
      pstmt.setString(4, ("%"+Keyword+"%"));
      pstmt.setString(5, ("%"+Keyword+"%"));
      pstmt.setString(6, ("%"+Keyword+"%"));
      pstmt.setString(7, ("%"+Keyword+"%"));
      pstmt.setString(8, ("%"+Keyword+"%"));
      rs = pstmt.executeQuery();
      while (rs.next()) {
        movie = new Movie(rs.getInt("movie_id"),
                rs.getString("title"),
                rs.getString("rating"),
                rs.getString("genre"),
                rs.getDouble("runtime"),
                rs.getDouble("score"),
                rs.getString("star"),
                rs.getString("director"),
                rs.getString("writer"),
                rs.getString("overview"),
                rs.getInt("popularity"),
                rs.getString("poster"),
                rs.getString("release_date"),
                rs.getString("tagline"));
        Movies.add(movie);
      }
    } catch (SQLException | IllegalMovieArgumentException e) {
      System.out.println("ERROR: Select Movie From Movies Where Keyword Is Failed.");
      System.out.println("Reason:" + e);
    }
    return Movies;
  }//end selectMoviePosterFromMoviesWhereMovieIDis

}
