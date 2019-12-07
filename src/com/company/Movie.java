/*
 * Movie Rental Project Software Engineering Fundamentals Fall 2019 Jeremy Martin, Liana Madden,
 * Stephen Cline, Sean Lamont.
 */
package com.company;

import java.util.ArrayList;

import javafx.scene.image.ImageView;

public class Movie {

    private int movieID;

    private String title;

    private Ratings rating;

    private String genre;

    private double runTime;

    private double score;

    private String star;

    private String director;

    private String writer;

    private String overview;

    private double popularity;

    private String poster;

    private String releaseDate;

    private String tagLine;

    private String imageView;

    private MovieImage movieImage;

    /**
     * Movie Constructor.
     *
     * @param movieID     Column A.
     * @param title       Column B.
     * @param rating      Column C.
     * @param genre       Column D.
     * @param runTime     Column E.
     * @param score       Column F.
     * @param star        Column G.
     * @param director    Column H.
     * @param writer      Column I.
     * @param overview    Column K.
     * @param popularity  Column L.
     * @param poster      Column M.
     * @param releaseDate Column N.
     * @param tagLine     Column O.
     * @throws IllegalMovieArgumentException throws exception.
     */
    public Movie(
            int movieID,
            String title,
            String rating,
            String genre,
            double runTime,
            double score,
            String star,
            String director,
            String writer,
            String overview,
            double popularity,
            String poster,
            String releaseDate,
            String tagLine)
            throws IllegalMovieArgumentException {
        setMovieID(movieID);
        setTitle(title);
        setRating(rating);
        setGenre(genre);
        setRunTime(runTime);
        setScore(score);
        setStar(star);
        setDirector(director);
        setWriter(writer);
        setOverview(overview);
        setPopularity(popularity);
        setPoster(poster);
        setReleaseDate(releaseDate);
        setTagLine(tagLine);
    }

    /**
     * Returns Movie Id.
     *
     * @return int movieID of Movie.
     */
    private int getMovieID() {
        return movieID;
    }

    /**
     * Sets unique movie ID.
     *
     * @param movieID Unique Movie ID.
     * @throws IllegalMovieArgumentException thrown if less than or equal to 0;
     */
    private void setMovieID(int movieID) throws IllegalMovieArgumentException {
        if (movieID > 0) {
            this.movieID = movieID;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Movie ID "
                            + movieID
                            + " Movie ID must be greater than 0 "
                            + "and must be unique.");
        }
    }

    void setMovieImage(String newImage) {
        this.movieImage = new MovieImage(newImage);
    }

    ImageView getMovieImage() {
        return movieImage.getImage();
    }

    /**
     * Returns Movie Title.
     *
     * @return String title of Movie.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets Movie Title.
     *
     * @param title movie title.
     * @throws IllegalMovieArgumentException thrown if title is null or zero length.
     */
    public void setTitle(String title) throws IllegalMovieArgumentException {
        if (title != null && title.length() > 0) {
            this.title = title;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Title " + title + " Title must be " + "greater than zero characters long.");
        }
    }

    /**
     * Returns Movie Rating.
     *
     * @return Rating Enum of Movie.
     */
    public Ratings getRating() {
        return rating;
    }

    /**
     * Takes in String and sets the rating to the appropriate Ratings Enum.
     *
     * @param rating Enum Rating.
     */
    public void setRating(String rating) {
        if (rating.equals(Ratings.R.toString())) {
            this.rating = Ratings.R;
        } else if (rating.equals(Ratings.PG13.toString())) {
            this.rating = Ratings.PG13;
        } else if (rating.equals(Ratings.PG.toString())) {
            this.rating = Ratings.PG;
        } else if (rating.equals(Ratings.G.toString())) {
            this.rating = Ratings.G;
        } else {
            this.rating = Ratings.NR;
        }
    }

    /**
     * Returns Movie Genre.
     *
     * @return Genre Enum of Movie.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets genre of movie.
     *
     * @param genre horror, comedy etc.
     * @throws IllegalMovieArgumentException thrown if invalid string.
     */
    private void setGenre(String genre) throws IllegalMovieArgumentException {
        if (genre != null && genre.length() > 0) {
            this.genre = genre;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Genre " + genre + " Genre must be " + "greater than zero characters long.");
        }
    }

    /**
     * Returns Movie Run Time.
     *
     * @return double, runTime of Movie.
     */
    double getRunTime() {
        return runTime;
    }

    /**
     * Sets movie runtime.
     *
     * @param runTime how long the movie is.
     * @throws IllegalMovieArgumentException thrown if invalid runtime less than  0.
     */
    private void setRunTime(double runTime) throws IllegalMovieArgumentException {
        if (runTime > 0) {
            this.runTime = runTime;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Run Time " + runTime + " Run Time must be greater " + "than 0.");
        }
    }

    /**
     * Returns Movie Score.
     *
     * @return double score of Movie.
     */
    public double getScore() {
        return score;
    }

    /**
     * Sets movie score.
     *
     * @param score Critic's rating.
     * @throws IllegalMovieArgumentException thrown if invalid double ie  less than 0.
     */
    private void setScore(double score) throws IllegalMovieArgumentException {
        if (score > 0) {
            this.score = score;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Score " + score + " Score must be greater than 0.");
        }
    }

    /**
     * Returns Movie Star.
     *
     * @return String star of Movie.
     */
    String getStar() {
        return star;
    }

    /**
     * Sets lead star in the movie.
     *
     * @param star Leading actor.
     * @throws IllegalMovieArgumentException thrown if invalid String.
     */
    private void setStar(String star) throws IllegalMovieArgumentException {
        if (star != null && star.length() > 0) {
            this.star = star;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Star " + star + " Star must be " + "greater than zero characters long.");
        }
    }

    /**
     * Returns Movie Director.
     *
     * @return String director of Movie.
     */
    String getDirector() {
        return director;
    }

    /**
     * Sets movie's Director.
     *
     * @param director Name of Director.
     * @throws IllegalMovieArgumentException thrown if invalid String.
     */
    private void setDirector(String director) throws IllegalMovieArgumentException {
        if (director != null && director.length() > 0) {
            this.director = director;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Director "
                            + director
                            + " Director must be "
                            + "greater than zero characters long.");
        }
    }

    /**
     * Returns Movie Writer.
     *
     * @return String writer of Movie.
     */
    public String getWriter() {
        return writer;
    }

    /**
     * Sets movie's Writer.
     *
     * @param writer Movie's Writer.
     * @throws IllegalMovieArgumentException thrown if invalid String.
     */
    private void setWriter(String writer) throws IllegalMovieArgumentException {
        if (writer != null && writer.length() > 0) {
            this.writer = writer;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Writer " + writer + " Writer must be " + "greater than zero characters long.");
        }
    }

    /**
     * Returns Movie Overview.
     *
     * @return String overview of Movie.
     */
    public String getOverview() {
        return overview;
    }

    /**
     * Sets Movie's Overview.
     *
     * @param overview Movie description.
     * @throws IllegalMovieArgumentException Thrown if invalid String.
     */
    public void setOverview(String overview) throws IllegalMovieArgumentException {
        if (overview != null && overview.length() > 0) {
            this.overview = overview;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Overview "
                            + overview
                            + " Overview must be "
                            + "greater than zero characters long.");
        }
    }

    /**
     * Returns Movie Popularity.
     *
     * @return String popularity of Movie.
     */
    public double getPopularity() {
        return popularity;
    }

    /**
     * Sets movie's popularity.
     *
     * @param popularity Movie's popularity in a double.
     * @throws IllegalMovieArgumentException Thrown if invalid double lee than 0.
     */
    private void setPopularity(double popularity) throws IllegalMovieArgumentException {
        if (popularity > 0) {
            this.popularity = popularity;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Movie Popularity "
                            + popularity
                            + " Movie Popularity"
                            + " must be greater than 0.");
        }
    }

    /**
     * Returns Movie Poster URL.
     *
     * @return String poster of Movie.
     */
    String getPoster() {
        return poster;
    }

    /**
     * Sets link to movie's poster for GUI.
     *
     * @param poster address of .jpeg.
     * @throws IllegalMovieArgumentException thrown if invalid String.
     */
    private void setPoster(String poster) throws IllegalMovieArgumentException {
        if (poster != null && poster.length() > 0) {
            this.poster = poster;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Poster " + poster + " Poster must be " + "greater than zero characters long.");
        }
    }

    /**
     * Returns Movie Release Date.
     *
     * @return String releaseDate of Movie.
     */
    String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets Movie's release date.
     *
     * @param releaseDate String release date.
     * @throws IllegalMovieArgumentException thrown if invalid String.
     */
    private void setReleaseDate(String releaseDate) throws IllegalMovieArgumentException {
        if (releaseDate != null && releaseDate.length() > 0) {
            this.releaseDate = releaseDate;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Release Date "
                            + releaseDate
                            + " Release Date must be "
                            + "greater than zero characters long.");
        }
    }

    /**
     * Returns Movie Tag Line.
     *
     * @return String tagLine of Movie.
     */
    String getTagLine() {
        return tagLine;
    }

    /**
     * Sets's Movie's tagline.
     *
     * @param tagLine Most popular line from movie.
     */
    private void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    /**
     * Sets Movie's PosterID.
     *
     * @param imageView String release date.
     * @throws IllegalMovieArgumentException thrown if invalid String.
     */
    void setImageView(String imageView) throws IllegalMovieArgumentException {
        if (imageView != null && imageView.length() > 0) {
            this.imageView = imageView;
        } else {
            throw new IllegalMovieArgumentException(
                    "Invalid Image View ID "
                            + imageView
                            + " Image View ID must be "
                            + "greater than zero characters long.");
        }
    }

    /**
     * Movie class's toString.
     *
     * @return Returns important info from movie.
     */
    public String toString() {
        return "\nTitle: "
                + title
                + "\nMovie ID: "
                + movieID
                + "\nDirector: "
                + director
                + "\nStarring: "
                + star
                + "\nRated: "
                + rating
                + "\nReleased: "
                + releaseDate
                + "\n";
    }

    /**
     * Compares movieId of object to all movieId's of contents of ArrayList passed in.
     *
     * @param list Must be an ArrayList of Type Movie.
     * @return returns true if unique id and false if not unique.
     */
    public boolean isUniqueId(ArrayList<Movie> list) {
        boolean isUnique = true;
        for (Movie movie : list) {
            if (this.getMovieID() == movie.getMovieID()) {
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }
}
