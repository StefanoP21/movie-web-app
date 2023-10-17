package me.stefanop21.backend.service;

import me.stefanop21.backend.model.Movie;
import me.stefanop21.backend.model.Review;
import me.stefanop21.backend.repository.IReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements IReviewService {
	@Autowired
	private IReviewRepository repo;
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Review createReview(String reviewBody, String imdbId) {
		Review review = repo.insert(new Review(reviewBody));

		mongoTemplate.update(Movie.class)
				.matching(Criteria.where("imdbId").is(imdbId))
				.apply(new Update().push("reviewIds").value(review))
				.first();

		return review;
	}
}
