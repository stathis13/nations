package com.qualco.nation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.qualco.nation.model.Country;

@Component
public interface CountryRepository extends JpaRepository<Country, Long> {
	
	@Query(value = "SELECT name, country_code2 as countryCode2 FROM countries ORDER BY name, country_code2", nativeQuery = true)
	List<CountryNameCodeView> getCountryNameCode();
}
