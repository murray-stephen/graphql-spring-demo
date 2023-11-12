package com.graphqldemo.movies.domain;

import com.graphqldemo.movies.graphql.ActorInput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ActorServiceImpl implements ActorServiceInterface {
    private final ActorRepository actorRepository;

    public ActorServiceImpl(MovieRepository movieRepository, ActorRepository actorRepository, DirectorRepository directorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Actor> getAllActors() {
        List<ActorEntity> actorEntities = actorRepository.findAll();
        return actorEntities.stream().map(ActorMapper::mapToActorData).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Actor getActorById(String id) {
        ActorEntity actorEntity = actorRepository.findById(id).orElse(null);
        return ActorMapper.mapToActorData(actorEntity);
    }

    @Override
    @Transactional
    public ActorEntity createOrGetActor(ActorInput actorInput) {
        // Check if the actor already exists
        Optional<ActorEntity> existingActor = actorRepository.findByName(actorInput.getName());

        if (existingActor.isPresent()) {
            // Return the existing actor
            return existingActor.get();
        } else {
            // Create a new actor entity from the input and save it
            ActorEntity newActor = new ActorEntity();
            newActor.setId(actorInput.getId());
            newActor.setName(actorInput.getName());
            newActor.setAge(actorInput.getAge());
            newActor.setCountry(actorInput.getCountry());
            // Save the new actor to the database
            return actorRepository.save(newActor);
        }
    }
}
