package com.graphqldemo.movies.domain;

import java.util.List;

public interface ActorServiceInterface {
    List<ActorEntity> getAllActors();
    ActorEntity getActorById(String id);
}
