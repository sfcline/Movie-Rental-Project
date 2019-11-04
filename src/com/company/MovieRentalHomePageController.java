package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MovieRentalHomePageController {

    final String orange = "#fc9e4f";
    final String darkGray = "#474448";
    final String lightGray = "#6b6d76";
    final String white = "#f6f6f6";

    ///////////inserting Objects to be displayed on Survey Scene//////////////////////
@FXML
    Button accountBtn = new Button();
    @FXML
    Button load_movies_btn = new Button();
@FXML
    ImageView banner_rec_0,
        banner_rec_1,
        banner_rec_2,
        banner_rec_3,
        banner_rec_4,
        banner_rec_5,
        banner_rec_6,
        banner_rec_7 = new ImageView();

@FXML
    Label banner_rec_lbl_0,
        banner_rec_lbl_1,
        banner_rec_lbl_2,
        banner_rec_lbl_3,
        banner_rec_lbl_4,
        banner_rec_lbl_5,
        banner_rec_lbl_6,
        banner_rec_lbl_7 = new Label();

    //////////////////////////////////////////////////////////////////////////////////
    final public String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";

    //Opens the Account Page
    public void openAccountPage() throws Exception {
        AccountPage.display("Account Page");
    }

    public void handleButtonMouseEntered(ActionEvent e){
        accountBtn.setTextFill(Color.valueOf(white));
    }

    public void handleButtonMouseExit(){
        accountBtn.setTextFill(Color.valueOf(orange));
    }

    public void loadMovies() {
        //Load Image 0
        Image img0 = new Image(MOVIE_PREFIX+"/dM2w364MScsjFf8pfMbaWUcWrR.jpg");
        banner_rec_0.setImage(img0);
        banner_rec_lbl_0.setText("Pulp Fiction");

        //Load Image 1
        Image img1 = new Image(MOVIE_PREFIX+"/yE5d3BUhE8hCnkMUJOo1QDoOGNz.jpg");
        banner_rec_1.setImage(img1);
        banner_rec_lbl_1.setText("Forrest Gump");

        //Load Image 2
        Image img2 = new Image(MOVIE_PREFIX+"/yPisjyLweCl1tbgwgtzBCNCBle.jpg");
        banner_rec_2.setImage(img2);
        banner_rec_lbl_2.setText("Schindlers List");

        //Load Image 3
        Image img3 = new Image(MOVIE_PREFIX+"/5bqI54aIyPDzPKkScwJprzbAsIi.jpg");
        banner_rec_3.setImage(img3);
        banner_rec_lbl_3.setText("DragonHeart");

        //Load Image 4
        Image img4 = new Image(MOVIE_PREFIX+"/b9QJr2oblOu1grgOMUZF1xkUJdh.jpg");
        banner_rec_4.setImage(img4);
        banner_rec_lbl_4.setText("Beauty and the Beast");

        //Load Image 5
        Image img5 = new Image(MOVIE_PREFIX+"/2y4dmgWYRMYXdD1UyJVcn2HSd1D.jpg");
        banner_rec_5.setImage(img5);
        banner_rec_lbl_5.setText("Terminator 2: Judgment Day");

        //Load Image 6
        Image img6 = new Image(MOVIE_PREFIX+"/rhIRbceoE9lR4veEXuwCC2wARtG.jpg");
        banner_rec_6.setImage(img6);
        banner_rec_lbl_6.setText("Toy Story");

        //Load Image 7
        Image img7 = new Image(MOVIE_PREFIX+"/bKPtXn9n4M4s8vvZrbw40mYsefB.jpg");
        banner_rec_7.setImage(img7);
        banner_rec_lbl_7.setText("The Lion King");
    }
    public void growBanner() {
        scaleImg(banner_rec_0,1.01);
    }

    public void shrinkBanner() {
        scaleImg(banner_rec_0,.99);
    }

    public void scaleImg(Node img,double amount) {
        img.setScaleX(amount);
        img.setScaleY(amount);
    }
}//end

/*
* No Piracy.
* No sharing licenses.
* No underaged children watching rated R.
* */

