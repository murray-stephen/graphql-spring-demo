

```javascript
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
    movies {
      title
    }
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
    movies {
      title
    }
  }
}

query getDirectorById {
  directorById(id: "david-fincher") {
    id
    name
    age
  }
}

mutation saveNewMovie($movieToSave: MovieInput) {
  addMovie(movieInput: $movieToSave) {
    id
    title
    rating
    yearReleased
    description
    actors {
      id
      name
      age
      country
    }
    directors {
      id
      name
      age
      country
    }
  }

    {
        "movieToSave": {
        "id": "inception",
            "title": "Inception",
            "rating": 8.8,
            "yearReleased": "2010",
            "description": "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.",
            "actors": [
            {
                "id": "leonardo-dicaprio",
                "name": "Leonardo DiCaprio",
                "age": "45",
                "country": "USA"
            },
            {
                "id": "joseph-gordon-levitt",
                "name": "Joseph Gordon-Levitt",
                "age": "39",
                "country": "USA"
            }
        ],
            "directors": [
            {
                "id": "christopher-nolan",
                "name": "Christopher Nolan",
                "age": "50",
                "country": "UK"
            }
        ]
    }
    }
}
```
