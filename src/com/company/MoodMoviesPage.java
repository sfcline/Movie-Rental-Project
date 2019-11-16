package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MoodMoviesPage {
    public static Stage MoodMoviesPage = new Stage();

    /**
     * Sets up Mood Movies Page Window.
     *
     * @param title title.
     * @throws Exception exception.
     */
    public static void display(String title) throws Exception {
        Parent root =
                FXMLLoader.load(MovieRentalHomePage.class.getResource("MoodMoviesPage.fxml"));
        MoodMoviesPage.setTitle("Mood Movies Page");
        MoodMoviesPage.setScene(new Scene(root, 1142, 658));
        MoodMoviesPage.setResizable(false);
        MoodMoviesPage.show();
    }

    public static void close(){
        MoodMoviesPage.close();
    }
}
