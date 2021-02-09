package com.github.RenanBandeira.citiesapi.cities.repository;

import com.github.RenanBandeira.citiesapi.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository <City,Long> {
}
