package com.company;

public enum Genres {
    Romance("Romance"),
            Action("Action"),
            History("History"),
            Horror("Horror"),
            ScienceFiction("Science Fiction"),
            Drama("Drama"),
            Family("Family"),
            War("War"),
            Western("Western"),
            Comedy("Comedy"),
            Animation("Animation"),
            Thriller("Thriller"),
            Music("Music"),
            Crime("Crime"),
            Fantasy("Fantasy"),
            Mystery("Mystery"),
            Adventure("Adventure");

    public final String name;

    Genres(String name){
        this.name = name;
    }
}
