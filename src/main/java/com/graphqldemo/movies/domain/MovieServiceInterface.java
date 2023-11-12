package com.graphqldemo.movies.domain;

import java.util.List;

public interface MovieServiceInterface {
    List<Movie> getAllMovies();
    Movie getMovieById(String id);
    Movie saveMovie(MovieEntity movie);
}
