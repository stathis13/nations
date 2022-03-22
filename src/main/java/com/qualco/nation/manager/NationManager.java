package com.qualco.nation.manager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.qualco.nation.model.Continent;
import com.qualco.nation.model.Country;
import com.qualco.nation.model.CountryStat;
import com.qualco.nation.model.Language;
import com.qualco.nation.model.Region;
import com.qualco.nation.repository.ContinentRepository;
import com.qualco.nation.repository.CountryNameCodeView;
import com.qualco.nation.repository.CountryRepository;
import com.qualco.nation.repository.CountryStatRepository;
import com.qualco.nation.repository.LanguageRepository;
import com.qualco.nation.repository.RegionRepository;

public class NationManager {

	@Autowired
	ContinentRepository continentRepo;
	
	@Autowired
	CountryRepository countryRepo;
	
	@Autowired
	LanguageRepository languageRepo;
	
	@Autowired
	CountryStatRepository countryStatRepo;
	
	@Autowired
	RegionRepository regionRepo;
	
	public List<Continent> getContinents() {
		return continentRepo.findAll(Sort.by(Sort.Direction.ASC, "name"));
	}

	public List<Country> getCountries() {
		return countryRepo.findAll(Sort.by(Sort.Direction.ASC, "name"));
	}
	
	public List<Language> getLanguages() {
		return languageRepo.findAll(Sort.by(Sort.Direction.ASC, "language"));
	}
	
	public List<CountryStat> getCountryStats() {
		return countryStatRepo.findAll(Sort.by(Sort.Direction.ASC, "country.name"));
	}
	
	public List<Region> getRegions() {
		return regionRepo.findAll(Sort.by(Sort.Direction.ASC, "name"));
	}
	
	public List<CountryNameCodeView> getCountriesNames() {
		return countryRepo.getCountryNameCode();
	}
	
	public List<Language> getCountryLanguages(Long countryId) {
		return languageRepo.findLanguageByCountry(countryId);
	}
}
