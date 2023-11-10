package com.graphqldemo.movies.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movie_entity")
public class MovieEntity {

    public MovieEntity() {
    }

    public MovieEntity(String id, String title, Double rating, String yearReleased, String description, Set<ActorEntity> actors, Set<DirectorEntity> directors) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.yearReleased = yearReleased;
        this.description = description;
        this.actors = actors;
        this.directors = directors;
    }

    @Id
    private String id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Double rating;

    @Column(name = "year_released", nullable = false)
    private String yearReleased;

    @Column(nullable = false, length = 1000)
    private String description;

    @ManyToMany
    @JoinTable(
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private Set<ActorEntity> actors = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "movie_director",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id")
    )
    private Set<DirectorEntity> directors = new HashSet<>();

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

    public Set<ActorEntity> getActors() {
        return actors;
    }

    public void setActors(Set<ActorEntity> actors) {
        this.actors = actors;
    }

    public Set<DirectorEntity> getDirectors() {
        return directors;
    }

    public void setDirectors(Set<DirectorEntity> directors) {
        this.directors = directors;
    }
}
