package com.graphqldemo.movies.graphql;

import com.graphqldemo.movies.domain.Actor;
import com.graphqldemo.movies.domain.ActorEntity;
import com.graphqldemo.movies.domain.ActorServiceInterface;
import com.graphqldemo.movies.domain.Director;
import com.graphqldemo.movies.domain.DirectorEntity;
import com.graphqldemo.movies.domain.DirectorServiceInterface;
import com.graphqldemo.movies.domain.Movie;
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
    private final ActorServiceInterface actorService;
    private final DirectorServiceInterface directorService;
    public MovieDataResolver(MovieServiceInterface movieService, ActorServiceInterface actorService, DirectorServiceInterface directorService) {
        this.movieService = movieService;
        this.actorService = actorService;
        this.directorService = directorService;
    }

    @DgsQuery
    public List<Movie> movies() {
        return movieService.getAllMovies();
    }

    @DgsQuery
    public Movie movieById(@InputArgument String id) {
        return movieService.getMovieById(id);
    }

    @DgsQuery
    public List<Actor> actors() {
        return actorService.getAllActors();
    }

    @DgsQuery
    public Actor actorById(@InputArgument String id) {
        return actorService.getActorById(id);
    }

    @DgsQuery
    public List<Director> directors() {
        return directorService.getAllDirectors();
    }

    @DgsQuery
    public Director directorById(@InputArgument String id) {
        return directorService.getDirectorById(id);
    }

    // Add a new movie actor and director as part of single mutation
    @DgsMutation
    public Movie addMovie(@InputArgument("movieInput") MovieInput movieInput) {
        // Create and save the new movie entity
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setId(movieInput.getId());
        movieEntity.setTitle(movieInput.getTitle());
        movieEntity.setRating(movieInput.getRating());
        movieEntity.setYearReleased(movieInput.getYearReleased());
        movieEntity.setDescription(movieInput.getDescription());

        // Process and save actors
        Set<ActorEntity> actorEntities = movieInput.getActors().stream()
                .map(actorService::createOrGetActor)
                .collect(Collectors.toSet());
        movieEntity.setActors(actorEntities);

        // Process and save directors
        Set<DirectorEntity> directorEntities = movieInput.getDirectors().stream()
                .map(directorService::createOrGetDirector)
                .collect(Collectors.toSet());
        movieEntity.setDirectors(directorEntities);

        return movieService.saveMovie(movieEntity);
    }
}

