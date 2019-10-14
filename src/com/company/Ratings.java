package com.company;

public enum Ratings {
    G("G"),
    PG("PG"),
    PG13("PG-13"),
    R("R");

    public final String rating;

    Ratings(String rating) {this.rating = rating;}
}