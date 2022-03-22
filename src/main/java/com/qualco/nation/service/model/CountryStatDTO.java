package com.qualco.nation.service.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "CountryStatDTO", description = "The country stats model object")
public class CountryStatDTO {

	@ApiModelProperty(value = "The country")
	private CountryDTO country;
	
	@ApiModelProperty(value = "The year of the stats")
	private Integer year;
	
	@ApiModelProperty(value = "The country gdp")
	private BigDecimal gdp;

	@ApiModelProperty(value = "The country population")
	private Integer population;
	
	public CountryDTO getCountryDTO() {
		return country;
	}

	public void setCountryDTO(CountryDTO country) {
		this.country = country;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public BigDecimal getGdp() {
		return gdp;
	}

	public void setGdp(BigDecimal gdp) {
		this.gdp = gdp;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}
}

