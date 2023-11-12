package com.graphqldemo.movies.domain;

import com.graphqldemo.movies.graphql.ActorInput;
import com.graphqldemo.movies.graphql.DirectorInput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorServiceImpl implements DirectorServiceInterface {
    private final DirectorRepository directorRepository;

    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<DirectorEntity> getAllDirectors() {
        return directorRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DirectorEntity getDirectorById(String id) {
        return directorRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DirectorEntity createOrGetDirector(DirectorInput actorInput) {
        // Check if the actor already exists
        Optional<DirectorEntity> existingDirector = directorRepository.findByName(actorInput.getName());

        if (existingDirector.isPresent()) {
            // Return the existing actor
            return existingDirector.get();
        } else {
            // Create a new actor entity from the input and save it
            DirectorEntity newDirector = new DirectorEntity();
            newDirector.setId(actorInput.getId());
            newDirector.setName(actorInput.getName());
            newDirector.setAge(actorInput.getAge());
            newDirector.setCountry(actorInput.getCountry());
            // Save the new actor to the database
            return directorRepository.save(newDirector);
        }
    }
}
