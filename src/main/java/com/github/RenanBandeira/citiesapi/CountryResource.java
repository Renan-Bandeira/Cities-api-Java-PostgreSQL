package com.github.RenanBandeira.citiesapi;

import com.github.RenanBandeira.citiesapi.countries.Country;
import com.github.RenanBandeira.citiesapi.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository Repository;

    public CountryResource(CountryRepository repository) {
        this.Repository = repository;
    }

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return Repository.findAll(page);
    }
}
