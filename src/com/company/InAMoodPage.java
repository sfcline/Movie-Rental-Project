package com.company;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InAMoodPage {
    public static Stage InAMoodPage = new Stage();

    /**
     * Sets up Mood Page Window.
     *
     * @param title title.
     * @throws Exception exception.
     */
    public static void display(String title) throws Exception {
        Parent root =
                FXMLLoader.load(MovieRentalHomePage.class.getResource("InAMood.fxml"));
        InAMoodPage.setTitle(title);
        InAMoodPage.setScene(new Scene(root, 1142, 658));
        InAMoodPage.setResizable(false);
        InAMoodPage.show();
    }

    public static void close(){
        InAMoodPage.close();
    }
}
