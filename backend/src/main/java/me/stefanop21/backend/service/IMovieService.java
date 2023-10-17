package me.stefanop21.backend.service;

import me.stefanop21.backend.model.Movie;

import java.util.List;
import java.util.Optional;

public interface IMovieService {
	List<Movie> getAllMovies();
	Optional <Movie> getMovieById(String imdbId);
}
