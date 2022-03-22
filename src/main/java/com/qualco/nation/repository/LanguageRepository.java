package com.qualco.nation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.qualco.nation.model.Language;

@Component
public interface LanguageRepository extends JpaRepository<Language, Long> {
	
	@Query(value = "SELECT language_id, language FROM languages "
			+ "WHERE language_id IN"
			+ "(SELECT language_id FROM country_languages WHERE country_id = (?1))", nativeQuery = true)
	List<Language> findLanguageByCountry(Long countryId);
}
