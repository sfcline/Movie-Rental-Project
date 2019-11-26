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
    public static void display(String title, String mood) throws Exception {
        FXMLLoader loader = new FXMLLoader(MoodMoviesPage.class.getResource("MoodMoviesPage.fxml"));
        Parent root = loader.load();
        MoodMoviesPage.setTitle(title);
        MoodMoviesPage.setScene(new Scene(root, 1142, 658));
        MoodMoviesPage.setResizable(false);
        loader.<MoodMoviesPageController>getController().loadMovies(mood);
        MoodMoviesPage.show();
    }

    public static void close(){
        MoodMoviesPage.close();
    }
}
