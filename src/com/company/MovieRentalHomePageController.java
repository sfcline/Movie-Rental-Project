/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

/** MovieRentalHomePageController, controls everything on the main page of the program. */
public class MovieRentalHomePageController {

  final String orange = "#fc9e4f";
  final String darkGray = "#474448";
  final String lightGray = "#6b6d76";
  final String white = "#f6f6f6";

  /////////// inserting Objects to be displayed on Survey Scene//////////////////////
  @FXML Button accountBtn = new Button();
  @FXML Button load_movies_btn = new Button();
  @FXML Button moodBtn = new Button();
  @FXML
  ImageView RecBanner1, RecBanner2, RecBanner3, RecBanner4, RecBanner5, RecBanner6, RecBanner7, RecBanner8,
          RomBanner1, RomBanner2, RomBanner3, RomBanner4, RomBanner5, RomBanner6, RomBanner7, RomBanner8,
          ComBanner1, ComBanner2, ComBanner3, ComBanner4, ComBanner5, ComBanner6, ComBanner7, ComBanner8,
          FamBanner1, FamBanner2, FamBanner3, FamBanner4, FamBanner5, FamBanner6, FamBanner7, FamBanner8,
          HorBanner1, HorBanner2, HorBanner3, HorBanner4, HorBanner5, HorBanner6, HorBanner7, HorBanner8
  
          = new ImageView();
  @FXML
  Label RecLabel1, RecLabel2, RecLabel3, RecLabel4, RecLabel5, RecLabel6, RecLabel7, RecLabel8, 
          RomLabel1, RomLabel2, RomLabel3, RomLabel4, RomLabel5, RomLabel6, RomLabel7, RomLabel8,
          ComLabel1, ComLabel2, ComLabel3, ComLabel4, ComLabel5, ComLabel6, ComLabel7, ComLabel8,
          FamLabel1, FamLabel2, FamLabel3, FamLabel4, FamLabel5, FamLabel6, FamLabel7, FamLabel8,
          HorLabel1, HorLabel2, HorLabel3, HorLabel4, HorLabel5, HorLabel6, HorLabel7, HorLabel8
          = new Label();

  //////////////////////////////////////////////////////////////////////////////////

  /**
   * Opens the Account Page
   *
   * @throws Exception exception.
   */
  public void openAccountPage() throws Exception {
    AccountPage.display("Account Page");
    MovieRentalHomePage.close();
  }
  public void openMoodPage() throws Exception {
    InAMoodPage.display("In A Mood Page");
    MovieRentalHomePage.close();
  }

  /**
   * Modifies color of object when moused over.
   *
   * @param e object to be modified.
   */
  public void handleButtonMouseEntered(ActionEvent e) {
    accountBtn.setTextFill(Color.valueOf(white));
  }

  /** Modifies color of object when moused over. */
  public void handleButtonMouseExit() {
    accountBtn.setTextFill(Color.valueOf(orange));
  }

  /**
   * Test Class for GUI to load movies in. Will be removed later.
   *
   * @throws IllegalMovieArgumentException thrown if parameter to make Movie is rejected.
   */
  public void loadMovies() throws IllegalMovieArgumentException {
    MovieRow Recommended = new MovieRow(RecBanner1, RecBanner2, RecBanner3, RecBanner4,
            RecBanner5, RecBanner6, RecBanner7, RecBanner8,
            RecLabel1, RecLabel2, RecLabel3, RecLabel4,
            RecLabel5, RecLabel6, RecLabel7, RecLabel8);
    Recommended.setPostersWithMovieIDs(1,2,3,4,5,6,7,8);
    Recommended.setLabelsWithMovieIDs(1,2,3,4,5,6,7,8);
    MovieRow Romance = new MovieRow(RomBanner1, RomBanner2, RomBanner3, RomBanner4,
            RomBanner5, RomBanner6, RomBanner7, RomBanner8,
            RomLabel1, RomLabel2, RomLabel3, RomLabel4,
            RomLabel5, RomLabel6, RomLabel7, RomLabel8);
    Romance.autoSetRowWithTag("Romance");
    MovieRow Comedy = new MovieRow(ComBanner1, ComBanner2, ComBanner3, ComBanner4,
            ComBanner5, ComBanner6, ComBanner7, ComBanner8,
            ComLabel1, ComLabel2, ComLabel3, ComLabel4,
            ComLabel5, ComLabel6, ComLabel7, ComLabel8);
    Comedy.autoSetRowWithTag("Comedy");
    MovieRow Family = new MovieRow(FamBanner1, FamBanner2, FamBanner3, FamBanner4,
            FamBanner5, FamBanner6, FamBanner7, FamBanner8,
            FamLabel1, FamLabel2, FamLabel3, FamLabel4,
            FamLabel5, FamLabel6, FamLabel7, FamLabel8);
    Family.autoSetRowWithTag("Family");
    MovieRow Horror = new MovieRow(HorBanner1, HorBanner2, HorBanner3, HorBanner4,
            HorBanner5, HorBanner6, HorBanner7, HorBanner8,
            HorLabel1, HorLabel2, HorLabel3, HorLabel4,
            HorLabel5, HorLabel6, HorLabel7, HorLabel8);
    Horror.autoSetRowWithTag("Horror");
    

  }

  /** Increases size of banner when called. */
  public void growBanner() {
    scaleImg(RecBanner1, 1.01);
  }

  /** Decreases size of banner when called. */
  public void shrinkBanner() {
    scaleImg(RecBanner1, .99);
  }

  /**
   * Modifies scale of image to passed in parameters.
   *
   * @param img the image to be modified.
   * @param amount The amount to modify the image by.
   */
  public void scaleImg(Node img, double amount) {
    img.setScaleX(amount);
    img.setScaleY(amount);
  }
} // end

/*
 * No Piracy.
 * No sharing licenses.
 * No underaged children watching rated R.
 * */
