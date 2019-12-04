/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */
package com.company;

/** Ratings Enum used to limit and assign ratings on movies. */
public enum Ratings {
  G("G"),
  PG("PG"),
  PG13("PG-13"),
  R("R"),
  NR("Not Rated");

  public final String rating;

  Ratings(String rating) {
    this.rating = rating;
  }

  /**
   * Returns appropriate readable String for Enum.
   *
   * @return String, readable description fo Rating.
   */
  public String toString() {
    switch (this) {
      case G:
        return "G";
      case PG:
        return "PG";
      case PG13:
        return "PG-13";
      case R:
        return "R";
      case NR:
        return "NR";
    }
    return "No Rating";
  }
}
