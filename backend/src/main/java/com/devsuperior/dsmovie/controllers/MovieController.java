package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.dtos.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping(value = "/api/v1/movies")
public class MovieController {
    
    private MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping
    public Page<MovieDTO> findAllMovies(Pageable pageable){
        return movieService.findAllMovies(pageable);
    }

    @GetMapping(value = "/{id}")
    public MovieDTO findMovieById(@PathVariable Long id){
        return movieService.findMovieById(id);
    }

}