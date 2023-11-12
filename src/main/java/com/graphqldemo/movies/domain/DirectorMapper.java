package com.graphqldemo.movies.domain;

import java.util.stream.Collectors;

public class DirectorMapper {

    public static Director mapToDirectorData(DirectorEntity directorEntity) {
        Director director = new Director();
        director.setId(directorEntity.getId());
        director.setName(directorEntity.getName());
        director.setAge(directorEntity.getAge());
        director.setCountry(directorEntity.getCountry());
        director.setMovies(directorEntity.getMovies().stream().map(MovieMapper::mapToMovieData).collect(Collectors.toList()));
        return director;
    }
}
