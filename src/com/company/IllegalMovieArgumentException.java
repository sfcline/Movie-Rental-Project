package com.company;

public class IllegalMovieArgumentException extends Exception {

  private static final long serialVersionUID = 1L;

  public IllegalMovieArgumentException() {
    super("Invalid argument for the Stock class method");
  }

  public IllegalMovieArgumentException(String message) {
    super(message);
  }
}
