package com.company;

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
