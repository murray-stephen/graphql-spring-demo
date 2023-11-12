package com.graphqldemo.movies.domain;

import java.util.List;

public class Movie {
    private String id;
    private String title;
    private Double rating;
    private String yearReleased;
    private String description;
    private List<Actor> actors;
    private List<Director> directors;

    public Movie() {}

    public Movie(String id, String title, Double rating, String yearReleased, String description, List<Actor> actors, List<Director> directors) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.yearReleased = yearReleased;
        this.description = description;
        this.actors = actors;
        this.directors = directors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(String yearReleased) {
        this.yearReleased = yearReleased;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }
}

