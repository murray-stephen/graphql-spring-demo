package com.graphqldemo.movies.domain;

import java.util.List;

public interface MovieServiceInterface {
    List<MovieEntity> getAllMovies();
    MovieEntity getMovieById(String id);
    MovieEntity saveMovie(MovieEntity movie);
}
