package com.mparaske.movies.repository;

import com.mparaske.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    Movie findMovieByImdbId(String imdbId);
}
