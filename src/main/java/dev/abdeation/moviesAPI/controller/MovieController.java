package dev.abdeation.moviesAPI.controller;

import dev.abdeation.moviesAPI.documents.Movie;
import dev.abdeation.moviesAPI.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;
//    @GetMapping
//    public String allMovies(){
//        return "All movies...";
//    }

    @GetMapping
    public ResponseEntity<List<Movie>> allMovies(){
        List<Movie> allMovies=movieService.getAllMovies();
        return new ResponseEntity<List<Movie>>(allMovies, HttpStatus.OK);
    }


}
