package com.qualco.nation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.qualco.nation.model.Region;

@Component
public interface RegionRepository extends JpaRepository<Region, Long> {
	
}
