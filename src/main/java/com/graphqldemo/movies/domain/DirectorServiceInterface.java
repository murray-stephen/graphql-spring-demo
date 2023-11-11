package com.graphqldemo.movies.domain;

import java.util.List;

public interface DirectorServiceInterface {
    List<DirectorEntity> getAllDirectors();
    DirectorEntity getDirectorById(String id);
}
