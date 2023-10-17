package me.stefanop21.backend.controller;

import me.stefanop21.backend.model.Movie;
import me.stefanop21.backend.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {
	@Autowired
	IMovieService service;

	@GetMapping
	public ResponseEntity<List<Movie>> getAllMovies() {
		return new ResponseEntity<>(service.getAllMovies(), HttpStatus.OK);
	}

	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable("imdbId") String imdbId) {
		return new ResponseEntity<>(service.getMovieById(imdbId), HttpStatus.OK);
	}
}
