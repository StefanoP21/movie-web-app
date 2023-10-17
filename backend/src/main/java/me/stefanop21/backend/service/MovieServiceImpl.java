package me.stefanop21.backend.service;

import me.stefanop21.backend.model.Movie;
import me.stefanop21.backend.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements IMovieService{
	@Autowired
	private IMovieRepository repo;

	@Override
	public List<Movie> getAllMovies() {
		return repo.findAll();
	}

	@Override
	public Optional<Movie> getMovieById(String imdbId) {
		return repo.findByImdbId(imdbId);
	}
}
