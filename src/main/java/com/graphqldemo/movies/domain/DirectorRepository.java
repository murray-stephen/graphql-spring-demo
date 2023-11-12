package com.graphqldemo.movies.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface  DirectorRepository extends JpaRepository<DirectorEntity, String> {
    Optional<DirectorEntity> findByName(String name);
}
