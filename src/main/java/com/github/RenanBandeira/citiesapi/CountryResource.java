package com.github.RenanBandeira.citiesapi;

import com.github.RenanBandeira.citiesapi.countries.Country;
import com.github.RenanBandeira.citiesapi.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


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

    @GetMapping("/{id}")
    public ResponseEntity<Country> getOne(@PathVariable Long id){
        Optional<Country> optional = Repository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }else
            return ResponseEntity.notFound().build();

    }
}
