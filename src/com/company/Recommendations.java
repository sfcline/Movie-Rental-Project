package com.company;

import java.util.ArrayList;

public class Recommendations {

    private Users owner;

    private int[] tagID;

    private int[] movieID;

    private int[] rentalID;

    private ArrayList<Movie> recommendationsList;

    Recommendations(Users owner, int[] tagID, int[] movieID, int[] rentalID, ArrayList<Movie> recommendationsList){

        this.owner = owner;

        this.tagID = tagID;

        this.movieID = movieID;

        this.rentalID = rentalID;

        this.recommendationsList = recommendationsList;

    }
}
