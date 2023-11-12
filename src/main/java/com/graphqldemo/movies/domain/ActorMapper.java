package com.graphqldemo.movies.domain;

import java.util.stream.Collectors;

public class ActorMapper {

    public static Actor mapToActorData(ActorEntity actorEntity) {
        Actor actor = new Actor();
        actor.setId(actorEntity.getId());
        actor.setName(actorEntity.getName());
        actor.setAge(actorEntity.getAge());
        actor.setCountry(actorEntity.getCountry());
        actor.setMovies(actorEntity.getMovies().stream().map(MovieMapper::mapToMovieData).collect(Collectors.toList()));
        return actor;
    }
}

