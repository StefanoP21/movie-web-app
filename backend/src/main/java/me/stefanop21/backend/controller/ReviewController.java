package me.stefanop21.backend.controller;

import me.stefanop21.backend.model.Review;
import me.stefanop21.backend.service.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin(origins = "http://localhost:3000")
public class ReviewController {
	@Autowired
	IReviewService service;

	@PostMapping
	public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
		return new ResponseEntity<>(service.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
	}
}
