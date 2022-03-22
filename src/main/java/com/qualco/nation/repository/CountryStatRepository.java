package com.qualco.nation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qualco.nation.model.CountryStat;
import com.qualco.nation.model.CountryStatId;

@Repository
public interface CountryStatRepository extends JpaRepository<CountryStat, CountryStatId> {
	
}
