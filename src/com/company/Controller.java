package com.company;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class Controller implements Initializable {

  static final String JDBC_DRIVER = "org.h2.Driver";
  static final String DB_URL = "jdbc:h2:./lib/movieDB";
  static final String USER = "";
  static final String PASS = "";
  private Connection conn = null;
  private Statement statement;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    connectToDB();
  }

  public void connectToDB() {
    try {
      Class.forName(JDBC_DRIVER);

      /*For this following line of code I receive a empty database password flag on FindBugs
       * this issue will be addressed in later versions if a password is to be implemented
       */
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      statement = conn.createStatement();

    } catch (ClassNotFoundException e) {
      e.printStackTrace();

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
