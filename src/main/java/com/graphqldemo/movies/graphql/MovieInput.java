package com.graphqldemo.movies.graphql;

import java.util.List;

public class MovieInput {
    private String title;
    private Double rating;
    private String yearReleased;
    private String description;
    private List<ActorInput> actors;
    private List<DirectorInput> directors;

    public MovieInput(String title, Double rating, String yearReleased, String description, List<ActorInput> actors, List<DirectorInput> directors) {
        this.title = title;
        this.rating = rating;
        this.yearReleased = yearReleased;
        this.description = description;
        this.actors = actors;
        this.directors = directors;
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

    public List<ActorInput> getActors() {
        return actors;
    }

    public void setActors(List<ActorInput> actors) {
        this.actors = actors;
    }

    public List<DirectorInput> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorInput> directors) {
        this.directors = directors;
    }
}

