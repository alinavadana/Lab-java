package com.example.demo.model;

public class Anime {
    private String title;
    private String releaseDate;
    private String length;
    private String genre;
    private double rating;

    public Anime() {
    }

    public Anime(String title, String releaseDate, String length, String genre, double rating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.length = length;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
