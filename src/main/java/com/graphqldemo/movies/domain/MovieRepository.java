package com.graphqldemo.movies.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, String> {
    // Here you can define custom query methods if needed, for example:
    // List<Movie> findByTitleContaining(String title);
}
