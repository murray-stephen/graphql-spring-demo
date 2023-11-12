package com.graphqldemo.movies.domain;

import java.util.List;

public class Director {
    private String id;
    private String name;
    private String age;
    private String country;
    private List<Movie> movies;

    public Director() {}

    public Director(String id, String name, String age, String country, List<Movie> movies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
        this.movies = movies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
