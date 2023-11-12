package com.graphqldemo.movies.domain;

import com.graphqldemo.movies.graphql.DirectorInput;

import java.util.List;

public interface DirectorServiceInterface {
    List<Director> getAllDirectors();
    Director
    getDirectorById(String id);
    DirectorEntity createOrGetDirector(DirectorInput actorInput);
}
