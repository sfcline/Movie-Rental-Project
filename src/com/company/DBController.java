/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/** DBController class. Used to control the Data Base. All Data Base functions are kept here. */
public class DBController {

  static final String JDBC_DRIVER = "org.h2.Driver";
  static final String DB_URL = "jdbc:h2:./libs/movieDB";
  static final String USER = "";

  static final String PASS = "";
  private Connection conn = null;
  private Statement statement;


  /** Connectss to Data Base. */
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
   * Selects all from Users Table, and Prints with formatting.
   *
   * */
  public void selectAllFromUsers() {
    ResultSet rs = null;
    try {
      Statement stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT * FROM ;");

      while (rs.next()) {
        System.out.printf("Username = %s%n", rs.getString("username"));
        System.out.printf("Password = %s%n", rs.getString("password"));
        System.out.printf("Sports Survey ID = %d%n", rs.getInt("sports_ID"));
        System.out.printf("Food Survey ID   = %d%n", rs.getInt("food_ID"));
      }

    } catch (SQLException e) {
      System.out.println("ERROR: selectAllFromUsers FAILED!");
      System.out.println(e);
    }
  }
}
