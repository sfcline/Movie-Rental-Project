package com.company;


import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;


public class MovieRentalHomePageController implements Initializable {

    ///////////inserting Objects to be displayed on Survey Scene//////////////////////

    //////////////////////////////////////////////////////////////////////////////////

  static final String JDBC_DRIVER = "org.h2.Driver";
  static final String DB_URL = "jdbc:h2:./libs/movieDB";
  static final String USER = "";
  static final String PASS = "";
  private Connection conn = null;
  private Statement statement;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    connectToDB();
    //testDB();

  }

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
  public void testDB(){
    try {
      String sql =
          "INSERT INTO Users(USER_NAME, PASSWORD, PREF_ID, HIST_ID) "
              + "VALUES " + "( 'Bob The Builder', 'password', 1, 52 );";
      // String sql = "SELECT * FROM USERS";
      statement.execute(sql);

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}//end controller

