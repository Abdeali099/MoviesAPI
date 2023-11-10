package dev.abdeation.moviesAPI.controller;

import dev.abdeation.moviesAPI.documents.Movie;
import dev.abdeation.moviesAPI.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> allMovies(){
        List<Movie> allMovies=movieService.getAllMovies();
        return new ResponseEntity<List<Movie>>(allMovies, HttpStatus.OK);
    }

  /*  @GetMapping("/{id}") // this  is with collection ObjectId
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Movie>>(movieService.getMovieById(id),HttpStatus.OK);
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String id){
        return new ResponseEntity<Optional<Movie>>(movieService.getMovieById(id),HttpStatus.OK);
    }

}
