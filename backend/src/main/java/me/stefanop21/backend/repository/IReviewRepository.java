package me.stefanop21.backend.repository;

import me.stefanop21.backend.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReviewRepository extends MongoRepository<Review, ObjectId> {
}
