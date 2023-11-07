package dev.abdeation.moviesAPI.service;

import dev.abdeation.moviesAPI.documents.Movie;
import dev.abdeation.moviesAPI.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

}
