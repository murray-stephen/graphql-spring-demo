package com.graphqldemo.movies.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieServiceInterface {

    private final MovieRepository movieRepository;
    private final ActorRepository actorRepository;
    private final DirectorRepository directorRepository;

    public MovieServiceImpl(MovieRepository movieRepository, ActorRepository actorRepository, DirectorRepository directorRepository) {
        this.movieRepository = movieRepository;
        this.actorRepository = actorRepository;
        this.directorRepository = directorRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<MovieEntity> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public MovieEntity getMovieById(String id) {
        return movieRepository.findById(id).orElse(null);
    }

//    @Override
//    @Transactional(readOnly = true)
//    public List<ActorEntity> getActorsByMovieId(String movieId) {
//        // This would typically involve a custom query method in your repository to find actors by movie ID
////        return actorRepository.findActorsByMovieId(movieId);
//    }

//    @Override
//    @Transactional(readOnly = true)
//    public List<DirectorEntity> getDirectorsByMovieId(String movieId) {
//        // Similarly, this would involve a custom query method to find directors by movie ID
////        return directorRepository.findDirectorsByMovieId(movieId);
//    }

//    @Override
//    public MovieEntity addMovie(String title, Double rating, String yearReleased, String description) {
//        MovieEntity movie = new MovieEntity(title, rating, yearReleased, description);
//        return movieRepository.save(movie);
//    }
}
