package com.qualco.nation.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qualco.nation.manager.NationManager;
import com.qualco.nation.mapper.NationMapper;
import com.qualco.nation.service.model.ContinentDTO;
import com.qualco.nation.service.model.CountryDTO;
import com.qualco.nation.service.model.CountryStatDTO;
import com.qualco.nation.service.model.LanguageDTO;
import com.qualco.nation.service.model.RegionDTO;

import io.swagger.annotations.*;

@Api(value = "QUALCO nation Rest Api")
@RestController
@RequestMapping("/api/v1.0/nation")
@Validated
public class NationService {

@Autowired 
NationManager nationManager;

	@GetMapping("/continents")
	@ApiOperation(value = "get Continents", notes = "Get All Continents")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = ContinentDTO.class),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not found"),
			@ApiResponse(code = 405, message = "Method Not Allowed"),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 502, message = "Bad Gateway"),
			@ApiResponse(code = 503, message = "Service Unavailable")})
	public List<ContinentDTO> getContinents() {
		return NationMapper.INSTANCE.toContinentsDTO(nationManager.getContinents());
	}
	
	@GetMapping("/countries")
	@ApiOperation(value = "get Countries", notes = "Get All Countries")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = CountryDTO.class),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not found"),
			@ApiResponse(code = 405, message = "Method Not Allowed"),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 502, message = "Bad Gateway"),
			@ApiResponse(code = 503, message = "Service Unavailable")})
	public List<CountryDTO> getCountries() {
		return NationMapper.INSTANCE.toCountriesDTO(nationManager.getCountries());
	}
	
	@GetMapping("/languages")
	@ApiOperation(value = "get Languages", notes = "Get All Languages")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = LanguageDTO.class),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not found"),
			@ApiResponse(code = 405, message = "Method Not Allowed"),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 502, message = "Bad Gateway"),
			@ApiResponse(code = 503, message = "Service Unavailable")})
	public List<LanguageDTO> getLanguages() {
		return NationMapper.INSTANCE.toLanguagesDTO(nationManager.getLanguages());
	}
	
	@GetMapping("/country_stats")
	@ApiOperation(value = "get Country Stats", notes = "Get All Country Stats")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = CountryStatDTO.class),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not found"),
			@ApiResponse(code = 405, message = "Method Not Allowed"),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 502, message = "Bad Gateway"),
			@ApiResponse(code = 503, message = "Service Unavailable")})
	public List<CountryStatDTO> getCountryStats() {
		return NationMapper.INSTANCE.toCountryStatsDTO(nationManager.getCountryStats());
	}
	
	@GetMapping("/regions")
	@ApiOperation(value = "get Regions ", notes = "Get All Regions")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = RegionDTO.class),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not found"),
			@ApiResponse(code = 405, message = "Method Not Allowed"),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 502, message = "Bad Gateway"),
			@ApiResponse(code = 503, message = "Service Unavailable")})
	public List<RegionDTO> getRegions() {
		return NationMapper.INSTANCE.toRegionsDTO(nationManager.getRegions());
	}
	
	@GetMapping("/countries_name_code")
	@ApiOperation(value = "get Country Name and Code", notes = "Get Country Name and Code")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = CountryDTO.class),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not found"),
			@ApiResponse(code = 405, message = "Method Not Allowed"),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 502, message = "Bad Gateway"),
			@ApiResponse(code = 503, message = "Service Unavailable")})
	public List<CountryDTO> getCountriesNames() {
		return nationManager.getCountriesNames()
			.stream()
			.map( s -> {
				CountryDTO country = new CountryDTO();
				country.setName(s.getName());
				country.setCountryCode2(s.getCountryCode2());
				return country;
			})
			.collect(Collectors.toList());
	}
	
	@GetMapping("/country_languages")
	@ApiOperation(value = "get Country Languages ", notes = "Get Country Languages")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = RegionDTO.class),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not found"),
			@ApiResponse(code = 405, message = "Method Not Allowed"),
			@ApiResponse(code = 500, message = "Internal server error"),
			@ApiResponse(code = 502, message = "Bad Gateway"),
			@ApiResponse(code = 503, message = "Service Unavailable")})
	public List<LanguageDTO> getCountryLanguages(
			@ApiParam(value = "The country id", required = true) 
			@RequestParam(required = true) String countryId) {
		
		return NationMapper.INSTANCE.toLanguagesDTO(nationManager.getCountryLanguages(Long.parseLong(countryId)));
		
	}
	
}
