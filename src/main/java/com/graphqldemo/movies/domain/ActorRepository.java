package com.graphqldemo.movies.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActorRepository extends JpaRepository<ActorEntity, String> {
    Optional<ActorEntity> findByName(String name);
}
