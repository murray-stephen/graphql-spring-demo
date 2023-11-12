package com.graphqldemo.movies.domain;

import java.util.stream.Collectors;

public class MovieMapper {

    public static Movie mapToMovieData(MovieEntity movieEntity) {
        Movie movie = new Movie();
        movie.setId(movieEntity.getId());
        movie.setTitle(movieEntity.getTitle());
        movie.setRating(movieEntity.getRating());
        movie.setYearReleased(movieEntity.getYearReleased());
        movie.setDescription(movieEntity.getDescription());
        movie.setActors(movieEntity.getActors().stream()
                .map(actorEntity -> {
                    Actor actor = new Actor();
                    actor.setId(actorEntity.getId());
                    actor.setName(actorEntity.getName());
                    actor.setAge(actorEntity.getAge());
                    actor.setCountry(actorEntity.getCountry());
                    // Do not map actor's movies to avoid recursion
                    return actor;
                }).collect(Collectors.toList()));
        movie.setDirectors(movieEntity.getDirectors().stream()
                .map(directorEntity -> {
                    Director director = new Director();
                    director.setId(directorEntity.getId());
                    director.setName(directorEntity.getName());
                    director.setAge(directorEntity.getAge());
                    director.setCountry(directorEntity.getCountry());
                    return director;
                }).collect(Collectors.toList()));
        return movie;

//        Movie movie = new Movie();
//        movie.setId(movieEntity.getId());
//        movie.setTitle(movieEntity.getTitle());
//        movie.setRating(movieEntity.getRating());
//        movie.setYearReleased(movieEntity.getYearReleased());
//        movie.setDescription(movieEntity.getDescription());
//        movie.setActors(movieEntity.getActors().stream().map(ActorMapper::mapToActorData).collect(Collectors.toList()));
//        movie.setDirectors(movieEntity.getDirectors().stream().map(DirectorMapper::mapToDirectorData).collect(Collectors.toList()));
//        return movie;
    }
}
