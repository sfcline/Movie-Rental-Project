package com.company;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MovieImage {

    private ImageView image;

    final String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";

    MovieImage(String image) {
        setImage(image);
    }

    public void setImage(String newImage) {
        ImageView tempImage;
        tempImage = new ImageView(new Image(MOVIE_PREFIX + newImage));
        tempImage.setPreserveRatio(true);
        tempImage.setFitWidth(100);
        image = tempImage;
    }

    public ImageView getImage() {
        return image;
    }
}