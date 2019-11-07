/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/** DBController class. Used to control the Data Base. All Data Base functions are kept here. */
public class DBController implements Initializable {

  static final String JDBC_DRIVER = "org.h2.Driver";
  static final String DB_URL = "jdbc:h2:./libs/movieDB";
  static final String USER = "";

  static final String PASS = "";
  private Connection conn = null;
  private Statement statement;

  /**
   * Called when controller first run.
   *
   * @param location location.
   * @param resources resources.
   */
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    connectToDB();
  }

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
  }
}
