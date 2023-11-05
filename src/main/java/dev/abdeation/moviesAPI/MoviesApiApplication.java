package dev.abdeation.moviesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApiApplication.class, args);
	}

	@GetMapping("/")
	public String apiPath(){
		return "Movies API listening on <a href=`http://localhost:8080/`>localhost:8080</a>";
	}


}
