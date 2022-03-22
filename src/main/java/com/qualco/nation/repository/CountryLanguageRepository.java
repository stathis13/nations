package com.qualco.nation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qualco.nation.model.CountryLanguage;
import com.qualco.nation.model.CountryLanguageId;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId> {

}
