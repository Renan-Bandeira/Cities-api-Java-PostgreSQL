package com.github.RenanBandeira.citiesapi.repository;

import com.github.RenanBandeira.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
