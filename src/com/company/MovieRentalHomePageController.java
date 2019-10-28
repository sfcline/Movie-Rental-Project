package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MovieRentalHomePageController {

    final String orange = "#fc9e4f";
    final String darkGray = "#474448";
    final String lightGray = "#6b6d76";
    final String white = "#f6f6f6";

    ///////////inserting Objects to be displayed on Survey Scene//////////////////////
@FXML
    Button accountBtn = new Button();
    Button homeBtn = new Button();
    Button moodBtn = new Button();

    public void accountButtonPressed(ActionEvent event) throws Exception {
        openAccountPage();
    }//end pressButton

    public void homeButtonPressed(ActionEvent event) throws Exception {
        openMovieRentalHome();
    }//end pressButton

    public void moodButtonPressed(ActionEvent event) throws Exception {
        openMoodPage();
    }

    //Opens the Account Page
    public void openAccountPage() throws Exception {
        AccountPage.display("Account Page");
    }

    //Opens the Home Page
    public void openMovieRentalHome() throws Exception {
        MovieRentalHomePage.display("Movie Rental Homepage");
    }

    //Opens the Mood Page
    public void openMoodPage() throws Exception {
        InAMoodPage.display("In A Mood Page");
    }

    public void handleButtonMouseEntered(MouseEvent e){
        Button tmp = (Button)e.getSource();
        tmp.setTextFill(Color.valueOf(white));
    }
    public void handleButtonMouseExit(MouseEvent e){
        Button tmp = (Button)e.getSource();
        tmp.setTextFill(Color.valueOf(orange));
    }

    public ArrayList<Movie> getTestArrayList(){

        ArrayList<Movie> movieList = new ArrayList<>();

        try {

            Movie test1 =
                    new Movie(
                            1,
                            "Pulp Fiction",
                            "R",
                            "Crime",
                            154,
                            8.9,
                            "John Travolta",
                            "Quentin Tarintino",
                            "Quentin Tarintino",
                            "A burger-loving "
                                    + "hit man; his philosophical partner; a drug-addled gangster's moll and a washed-up boxer "
                                    + "converge in "
                                    + "this sprawling; comedic crime caper. Their adventures unfurl in three stories that"
                                    + " ingeniously "
                                    + "trip back and forth in time.",
                            140.950236,
                            "/dM2w364MScsjFf8pfMbaWUcWrR.jpg",
                            "9/10/1994",
                            "Just because you are a character doesn't mean you have character.");
            Movie test2 =
                    new Movie(
                            2,
                            "Forest Gump",
                            "PG-13",
                            "Comedy",
                            142,
                            8.8,
                            "Tom Hanks",
                            "Robert Zemeckis",
                            "Winston Groom",
                            "A man with a low IQ has accomplished great things in his life and been present "
                                    + "during significant historic events - in each case; far exceeding what anyone"
                                    + " imagined he could do. Yet; despite all the things he has attained; his one true "
                                    + "love eludes him. 'Forrest Gump' is the story of a man who rose above his challenges;"
                                    + " and who proved that determination; courage; and love are more important than ability.",
                            48.307194,
                            "/yE5d3BUhE8hCnkMUJOo1QDoOGNz.jpg",
                            "7/6/1994",
                            "The world will never be the same; once you've seen it through the eyes of Forrest Gump.");
            movieList.add(test1);
            movieList.add(test2);

        } catch (IllegalMovieArgumentException e) {
            e.printStackTrace();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return movieList;
    }
}//end controller

