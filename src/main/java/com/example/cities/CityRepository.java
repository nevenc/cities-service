package com.example.cities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Long> {
    List<City> findAllByNameContaining(@Param("nameContains") String query);
}
