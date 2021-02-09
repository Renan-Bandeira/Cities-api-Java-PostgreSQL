package com.github.RenanBandeira.citiesapi.cities.resource;


import com.github.RenanBandeira.citiesapi.cities.repository.StateRepository;
import com.github.RenanBandeira.citiesapi.staties.entities.State;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<State> states(final Pageable page) {
        return repository.findAll(page);
    }
}