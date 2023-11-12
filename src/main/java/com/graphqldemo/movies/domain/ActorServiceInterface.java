package com.graphqldemo.movies.domain;

import com.graphqldemo.movies.graphql.ActorInput;

import java.util.List;

public interface ActorServiceInterface {
    List<Actor> getAllActors();
    Actor getActorById(String id);
    ActorEntity createOrGetActor(ActorInput actorInput);
}
