package dev.abdeation.moviesAPI.service;

import dev.abdeation.moviesAPI.documents.Movie;
import dev.abdeation.moviesAPI.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

/*    public Optional<Movie> getMovieById(ObjectId id) { // this is for Collection object Id
        return movieRepository.findById(id);
    }*/
    public Optional<Movie> getMovieById(String id) {
        return movieRepository.findByImdbId(id);
    }

}
