package com.github.RenanBandeira.citiesapi.states.repository;


import com.github.RenanBandeira.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
