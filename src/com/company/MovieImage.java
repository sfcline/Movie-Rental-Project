package com.company;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MovieImage {

    private ImageView image;

    MovieImage(String image) {
        setImage(image);
    }

    public void setImage(String newImage) {
        image = new ImageView(new Image(newImage));
    }

    public ImageView getImage() {
        return image;
    }
}