CREATE TABLE actor_entity (
                              id VARCHAR(128) NOT NULL,
                              name VARCHAR(128) NOT NULL,
                              age CHAR(2) NOT NULL,
                              country VARCHAR(128) NOT NULL,
                              PRIMARY KEY (id)
);


CREATE TABLE director_entity (
                              id VARCHAR(128) NOT NULL,
                              name VARCHAR(128) NOT NULL,
                              age CHAR(2) NOT NULL,
                              country VARCHAR(128) NOT NULL,
                              PRIMARY KEY (id)
);


CREATE TABLE movie_entity (
                       id VARCHAR(128) NOT NULL,
                       title VARCHAR(128) NOT NULL,
                       rating DECIMAL(3, 1) NOT NULL,
                       year_released VARCHAR(128) NOT NULL,
                       description TEXT NOT NULL,
                       PRIMARY KEY (id)
);

CREATE TABLE movie_actor (
                             movie_id VARCHAR(128) NOT NULL,
                             actor_id VARCHAR(128) NOT NULL,
                             PRIMARY KEY (movie_id, actor_id),
                             FOREIGN KEY (movie_id) REFERENCES movie_entity(id) ON DELETE CASCADE,
                             FOREIGN KEY (actor_id) REFERENCES actor_entity(id) ON DELETE CASCADE
);

CREATE TABLE movie_director (
                                movie_id VARCHAR(128) NOT NULL,
                                director_id VARCHAR(128) NOT NULL,
                                PRIMARY KEY (movie_id, director_id),
                                FOREIGN KEY (movie_id) REFERENCES movie_entity(id) ON DELETE CASCADE,
                                FOREIGN KEY (director_id) REFERENCES director_entity(id) ON DELETE CASCADE
);
