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

    @Override
    @Transactional(readOnly = true)
    public List<ActorEntity> getAllActors() {
        return actorRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ActorEntity getActorById(String id) {
        return actorRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DirectorEntity> getAllDirectors() {
        return directorRepository.findAll();
    }
}
