package com.mparaske.movies.service;

import com.mparaske.movies.model.Movie;
import com.mparaske.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Movie singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
