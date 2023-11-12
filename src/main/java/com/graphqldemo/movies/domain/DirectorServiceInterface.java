package com.graphqldemo.movies.domain;

import com.graphqldemo.movies.graphql.DirectorInput;

import java.util.List;

public interface DirectorServiceInterface {
    List<DirectorEntity> getAllDirectors();
    DirectorEntity getDirectorById(String id);
    DirectorEntity createOrGetDirector(DirectorInput actorInput);
}
