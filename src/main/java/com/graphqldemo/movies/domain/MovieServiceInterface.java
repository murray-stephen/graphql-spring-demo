package com.graphqldemo.movies.domain;

import java.util.List;

public interface MovieServiceInterface {
    List<MovieEntity> getAllMovies();
    MovieEntity getMovieById(String id);
//    List<ActorEntity> getActorsByMovieId(String movieId);
//    List<DirectorEntity> getDirectorsByMovieId(String movieId);
//    MovieEntity addMovie(String title, Double rating, String yearReleased, String description);
}
