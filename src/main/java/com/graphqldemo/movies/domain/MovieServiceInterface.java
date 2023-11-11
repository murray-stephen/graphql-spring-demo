package com.graphqldemo.movies.domain;

import java.util.List;

public interface MovieServiceInterface {
    List<MovieEntity> getAllMovies();
    MovieEntity getMovieById(String id);
    List<ActorEntity> getAllActors();
    ActorEntity getActorById(String id);
    List<DirectorEntity> getAllDirectors();
    DirectorEntity getDirectorById(String id);
}
