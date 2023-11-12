package com.graphqldemo.movies.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieServiceInterface {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Movie> getAllMovies() {
        List<MovieEntity> movieEntities = movieRepository.findAll();
        return movieEntities.stream().map(MovieMapper::mapToMovieData).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Movie getMovieById(String id) {
        MovieEntity movieEntity = movieRepository.findById(id).orElse(null);
        return MovieMapper.mapToMovieData(movieEntity);
    }

    @Override
    @Transactional
    public Movie saveMovie(MovieEntity movie) {
        // Save the movie entity to the database
        MovieEntity movieEntity = movieRepository.save(movie);
        return MovieMapper.mapToMovieData(movieEntity);
    }
}
