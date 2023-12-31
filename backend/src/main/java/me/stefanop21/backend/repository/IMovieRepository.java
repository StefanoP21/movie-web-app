package me.stefanop21.backend.repository;

import me.stefanop21.backend.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IMovieRepository extends MongoRepository<Movie, ObjectId> {
	Optional<Movie> findByImdbId(String imdbId);
}
