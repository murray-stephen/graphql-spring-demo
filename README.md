## Graphqlql Spring Boot demo

Working queriers

```json
query getAllMovies {
  movies {
  id
  title
  rating
  yearReleased
  description
  actors {
  id
  name
  age
}
directors {
  id
  name
  age
}
}
}

query getMovieById {
movieById(id: "se7en") {
id
title
rating
yearReleased
description
}
}

query getAllActors {
actors {
id
name
age
country
}
}

query getActorById {
actorById(id: "brad-pitt") {
id
name
age
}
}

query getAllDirectors {
directors {
id
name
age
country
}
}
```







































































































































