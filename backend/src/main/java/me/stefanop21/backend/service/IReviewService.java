package me.stefanop21.backend.service;

import me.stefanop21.backend.model.Review;

public interface IReviewService {
	Review createReview(String reviewBody, String imdbId);
}
