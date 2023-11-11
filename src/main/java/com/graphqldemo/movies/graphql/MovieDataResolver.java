package com.graphqldemo.movies.graphql;

import com.graphqldemo.movies.domain.ActorEntity;
import com.graphqldemo.movies.domain.DirectorEntity;
import com.graphqldemo.movies.domain.MovieEntity;
import com.graphqldemo.movies.domain.MovieServiceInterface;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@DgsComponent
public class MovieDataResolver {

    private final MovieServiceInterface movieService;

    public MovieDataResolver(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    @DgsQuery
    public List<MovieEntity> movies() {
        return movieService.getAllMovies();
    }

    @DgsQuery
    public MovieEntity movieById(@InputArgument String id) {
        return movieService.getMovieById(id);
    }

    @DgsQuery
    public List<ActorEntity> actors() {
        return movieService.getAllActors();
    }

    @DgsQuery
    public ActorEntity actorById(@InputArgument String id) {
        return movieService.getActorById(id);
    }

    @DgsQuery
    public List<DirectorEntity> directors() {
        return movieService.getAllDirectors();
    }

//    @DgsMutation
//    public MovieEntity addMovie(@InputArgument("movieInput") MovieInput movieInput) {
//        // Create and save the new movie entity
//        MovieEntity movieEntity = new MovieEntity();
//        movieEntity.setTitle(movieInput.getTitle());
//        movieEntity.setRating(movieInput.getRating());
//        movieEntity.setYearReleased(movieInput.getYearReleased());
//        movieEntity.setDescription(movieInput.getDescription());
//
//        // Process and save actors
//        Set<ActorEntity> actorEntities = movieInput.getActors().stream()
//                .map(actorInput -> actorService.createOrGetActor(actorInput))
//                .collect(Collectors.toSet());
//        movieEntity.setActors(actorEntities);
//
//        // Process and save directors
//        Set<DirectorEntity> directorEntities = movieInput.getDirectors().stream()
//                .map(directorInput -> directorService.createOrGetDirector(directorInput))
//                .collect(Collectors.toSet());
//        movieEntity.setDirectors(directorEntities);
//
//        return movieService.saveMovie(movieEntity);
//    }
}

