package com.graphqldemo.movies.graphql;

import com.graphqldemo.movies.domain.MovieEntity;
import com.graphqldemo.movies.domain.MovieServiceInterface;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

import java.util.List;

@DgsComponent
public class MovieDataResolver {

    private final MovieServiceInterface movieService; // Assume this service handles business logic

    public MovieDataResolver(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    @DgsQuery
    public List<MovieEntity> movies() {
        return movieService.getAllMovies();
    }
}

//    @DgsData(parentType = "Movie", field = "actors")
//    public List<ActorEntity> actors(DgsDataFetchingEnvironment dfe) {
//        MovieEntity movie = dfe.getSource();
//        return movieService.getActorsByMovieId(movie.getId());
//    }
//}
