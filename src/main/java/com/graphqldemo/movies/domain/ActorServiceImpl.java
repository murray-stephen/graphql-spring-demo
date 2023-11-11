package com.graphqldemo.movies.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorServiceInterface {
    private final ActorRepository actorRepository;

    public ActorServiceImpl(MovieRepository movieRepository, ActorRepository actorRepository, DirectorRepository directorRepository) {
        this.actorRepository = actorRepository;
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
}
