/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont
 */
package com.company;

import java.util.ArrayList;

public class MovieDriver {
  /**
   * Test class for Movie class.
   *
   * @param args Main method.
   * @throws IllegalMovieArgumentException thrown if invalid input is entered.
   */
  public static void main(String[] args) throws IllegalMovieArgumentException {

    ArrayList<Movie> movieList = new ArrayList<>();

    Movie test1 =
        new Movie(
            1,
            "Pulp Fiction",
            "R",
            "Crime",
            154,
            8.9,
            "John Travolta",
            "Quentin Tarintino",
            "Quentin Tarintino",
            "A burger-loving "
                + "hit man; his philosophical partner; a drug-addled gangster's moll and a washed-up boxer "
                + "converge in "
                + "this sprawling; comedic crime caper. Their adventures unfurl in three stories that"
                + " ingeniously "
                + "trip back and forth in time.",
            140.950236,
            "/dM2w364MScsjFf8pfMbaWUcWrR.jpg",
            "9/10/1994",
            "Just because you are a character doesn't mean you have character.");
    Movie test2 =
        new Movie(
            2,
            "Forest Gump",
            "PG-13",
            "Comedy",
            142,
            8.8,
            "Tom Hanks",
            "Robert Zemeckis",
            "Winston Groom",
            "A man with a low IQ has accomplished great things in his life and been present "
                + "during significant historic events - in each case; far exceeding what anyone"
                + " imagined he could do. Yet; despite all the things he has attained; his one true "
                + "love eludes him. 'Forrest Gump' is the story of a man who rose above his challenges;"
                + " and who proved that determination; courage; and love are more important than ability.",
            48.307194,
            "/yE5d3BUhE8hCnkMUJOo1QDoOGNz.jpg",
            "7/6/1994",
            "The world will never be the same; once you've seen it through the eyes of Forrest Gump.");

    movieList.add(test1);
    movieList.add(test2);

    System.out.println(movieList.toString());
  }
}
