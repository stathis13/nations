package com.qualco.nation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qualco.nation.model.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Long> {
	
}
