package com.github.RenanBandeira.citiesapi.countries.repository;

import com.github.RenanBandeira.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
