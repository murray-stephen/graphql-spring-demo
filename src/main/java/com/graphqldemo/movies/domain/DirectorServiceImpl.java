package com.graphqldemo.movies.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
}
