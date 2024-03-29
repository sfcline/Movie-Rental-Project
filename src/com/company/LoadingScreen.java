/*
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */
package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoadingScreen {
    private static Stage LoadingScreenPage = new Stage();

    /**
     * Sets up Loading Screen Page Window.
     *
     * @param title title.
     * @throws Exception exception.
     */
    public static void display(String title) throws Exception {
        Parent root = FXMLLoader.load(LoadingScreen.class.getResource("LoadingScreen.fxml"));
        LoadingScreenPage.setTitle(title);
        LoadingScreenPage.setScene(new Scene(root, 1142, 658));
        LoadingScreenPage.setResizable(false);
        LoadingScreenPage.show();
    }

    public static void close() {
        LoadingScreenPage.close();
    }
}
