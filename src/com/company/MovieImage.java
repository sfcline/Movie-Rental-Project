/*
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */
package com.company;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MovieImage {

    private ImageView image;

    MovieImage(String image) {
        setImage(image);
    }

    /**
     * Formats the image up to be displayed in the scroll pane.
     *
     * @param newImage the image to be formatted.
     */
    public void setImage(String newImage) {
        ImageView tempImage;
        String MOVIE_PREFIX = "https://image.tmdb.org/t/p/original";
        tempImage = new ImageView(new Image(MOVIE_PREFIX + newImage));
        tempImage.setPreserveRatio(true);
        tempImage.setFitWidth(100);
        image = tempImage;
    }

    public ImageView getImage() {
        return image;
    }
}
