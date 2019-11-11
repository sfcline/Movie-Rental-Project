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
  public String selectMoviePosterFromMoviesWhereMovieIDis(int Movie_ID) {
    String Poster = "";
    ResultSet rs = null;
    try {
      String insertQuery = "SELECT POSTER FROM MOVIES WHERE MOVIE_ID=?;";
      PreparedStatement pstmt = conn.prepareStatement(insertQuery);
      pstmt.setInt(1, Movie_ID);
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
   * Selects Title where a Movie ID is equal to the Parameter
   *
   * @param Movie_ID - Movie Id of the requested Title
   * @return Title - Title of movie requested
   */
  public String selectMovieTitleFromMoviesWhereMovieIDis(int Movie_ID) {
    String Title = "";
    ResultSet rs = null;
    try {
      String insertQuery = "SELECT TITLE FROM MOVIES WHERE MOVIE_ID=?;";
      PreparedStatement pstmt = conn.prepareStatement(insertQuery);
      pstmt.setInt(1, Movie_ID);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        Title = rs.getString("TITLE");
      }
    } catch (SQLException e) {
      System.out.println("ERROR: Selecting Title from Movies Failed.");
      System.out.println("Reason:" + e);
    }
    return Title;
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
  public String selectRANDOMMoviePosterFromMoviesWhereTagIs(String Tag) {
    ArrayList<String> MovieNames = new ArrayList<>();
    String Poster = "";
    ResultSet rs = null;
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
    String movieChoice = MovieNames.get(rdm.nextInt(MovieNames.size()));
    try {
      String insertQuery = "SELECT POSTER FROM MOVIES WHERE TITLE=?;";
      PreparedStatement pstmt = conn.prepareStatement(insertQuery);
      pstmt.setString(1, movieChoice);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        Poster = (rs.getString("POSTER"));
      }
    } catch (SQLException e) {
      System.out.println("ERROR: Selecting Poster from MovieNames Failed.");
      System.out.println("Reason2:" + e);
    }

    return Poster;
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
}
