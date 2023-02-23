package com.mparaske.movies.service;

import com.mparaske.movies.model.Movie;
import com.mparaske.movies.repository.MovieRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MovieServiceTest {

    private MovieService movieService;

    @Mock
    private MovieRepository movieRepository;

    @BeforeEach
    void setUp() {
        movieRepository = Mockito.mock(MovieRepository.class);
        movieService = new MovieService(movieRepository);
    }

    @Test
    void getAllMovies() {
        //when
        movieService.allMovies();
        //then
        verify(movieRepository).findAll();

    }

    @Test
    void getSingleMovie() {
        //given
        String imdbId = "3";
        Movie movie = new Movie();

        when(movieRepository.findMovieByImdbId(imdbId)).thenReturn(movie);

        Movie result = movieService.singleMovie(imdbId);

        //then
        Mockito.verify(movieRepository).findMovieByImdbId(imdbId);
        assertEquals(movie, result);
    }
}