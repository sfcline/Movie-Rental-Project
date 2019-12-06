/**
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */
package com.company;

/**
 * Illegal Movie Argument Exception. Thrown when a parameter doesn't meet the requirements in Movie
 * and its children.
 */
public class IllegalMovieArgumentException extends Exception {

  private static final long serialVersionUID = 1L;

  /** Default Illegal Movie Argument Exception. */
  public IllegalMovieArgumentException() {
    super("Invalid argument for the Stock class method");
  }

  /**
   * Custom Messae Illegal Movie Argument Exception.
   *
   * @param message The message that the Exception will display.
   */
  public IllegalMovieArgumentException(String message) {
    super(message);
  }
}
