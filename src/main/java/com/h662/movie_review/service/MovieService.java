package com.h662.movie_review.service;

import com.h662.movie_review.model.Movie;
import com.h662.movie_review.repository.MovieRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class MovieService {
    private final MovieRepository movieRepository;

    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }
}
