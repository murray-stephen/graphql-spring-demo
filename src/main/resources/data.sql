-- Insert movie data

-- Movie 1
INSERT INTO movie_entity (id, title, rating, year_released, description)
VALUES ('shawshank_remdemption', 'Shawshank Remdemption', 9.5, '2000', 'Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion.');

-- Movie 2
INSERT INTO movie_entity (id, title, rating, year_released, description)
VALUES ('se7en', 'Se7en', 8.6, '1995', 'Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his motives.');

-- Movie 3
INSERT INTO movie_entity (id, title, rating, year_released, description)
VALUES ('fight-club', 'Fight Club', 8.8, '1999', 'An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.');

-- Movie 4
INSERT INTO movie_entity (id, title, rating, year_released, description)
VALUES ('the-godfather', 'The Godfather', 9.2, '1999', 'Don Vito Corleone, head of a mafia family, decides to hand over his empire to his youngest son Michael. However, his decision unintentionally puts the lives of his loved ones in grave danger.');

-- Movie 5
INSERT INTO movie_entity (id, title, rating, year_released, description)
VALUES ('forrest-gump', 'Forrest Gump', 8.8, '1994', 'The history of the United States from the 1950s to the 70s unfolds from the perspective of an Alabama man with an IQ of 75, who yearns to be reunited with his childhood sweetheart.');

-- Insert actor data
-- Insert actor data for Tim Robbins
INSERT INTO actor_entity (id, name, age, country)
VALUES ('tim-robbins', 'Tim Robbins', '65', 'America');

-- Insert actor data for Morgan Freeman
INSERT INTO actor_entity (id, name, age, country)
VALUES ('morgan-freeman', 'Morgan Freeman', '86', 'America');

-- Insert actor data for Brad Pitt
INSERT INTO actor_entity (id, name, age, country)
VALUES ('brad-pitt', 'Brad Pitt', '60', 'America');

-- Insert actor data for Al Pacino
INSERT INTO actor_entity (id, name, age, country)
VALUES ('al-pacino', 'Al Pacino', '83', 'America');

-- Insert actor data for Robert Duvall
INSERT INTO actor_entity (id, name, age, country)
VALUES ('robert-duvall', 'Robert Duvall', '84', 'America');

-- Insert actor data for Tom Hanks
INSERT INTO actor_entity (id, name, age, country)
VALUES ('tom-hanks', 'Tom Hanks', '67', 'America');

-- Insert actor data for Robin Wright
INSERT INTO actor_entity (id, name, age, country)
VALUES ('robin-wright', 'Robin Wright', '57', 'America');


-- Insert director data
INSERT INTO director_entity (id, name, age, country)
VALUES ('frank-darabont', 'Frank Darabont', '64', 'France');

INSERT INTO director_entity (id, name, age, country)
VALUES ('david-fincher', 'David Fincher', '61', 'America');

INSERT INTO director_entity (id, name, age, country)
VALUES ('francis-ford-coppola', 'Francis Ford Coppola', '84', 'America');

INSERT INTO director_entity (id, name, age, country)
VALUES ('robert-zemeckis', 'Robert Zemeckis', '71', 'America');


-- Insert relationship data into movie_actor table
INSERT INTO movie_actor (movie_id, actor_id)
VALUES ('shawshank_remdemption', 'tim-robbins');

INSERT INTO movie_actor (movie_id, actor_id)
VALUES ('shawshank_remdemption', 'morgan-freeman');

INSERT INTO movie_actor (movie_id, actor_id)
VALUES ('se7en', 'morgan-freeman');

INSERT INTO movie_actor (movie_id, actor_id)
VALUES ('se7en', 'brad-pitt');

INSERT INTO movie_actor (movie_id, actor_id)
VALUES ('fight-club', 'brad-pitt');

INSERT INTO movie_actor (movie_id, actor_id)
VALUES ('the-godfather', 'al-pacino');

INSERT INTO movie_actor (movie_id, actor_id)
VALUES ('the-godfather', 'robert-duvall');

INSERT INTO movie_actor (movie_id, actor_id)
VALUES ('forrest-gump', 'tom-hanks');

INSERT INTO movie_actor (movie_id, actor_id)
VALUES ('forrest-gump', 'robin-wright');

-- Insert relationship data into movie_director table
INSERT INTO movie_director (movie_id, director_id)
VALUES ('shawshank_remdemption', 'frank-darabont');

INSERT INTO movie_director (movie_id, director_id)
VALUES ('se7en', 'david-fincher');

INSERT INTO movie_director (movie_id, director_id)
VALUES ('fight-club', 'david-fincher');

INSERT INTO movie_director (movie_id, director_id)
VALUES ('the-godfather', 'francis-ford-coppola');

INSERT INTO movie_director (movie_id, director_id)
VALUES ('forrest-gump', 'robert-zemeckis');
