package com.qualco.nation.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(CountryStatId.class)
@Table(name = "country_stats")
public class CountryStat  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
	@Id
	@Column(name = "year")
	private Integer year;
	
	@Column(name = "gdp")
	private BigDecimal gdp;

	@Column(name = "population")
	private Integer population;
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
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

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}
}

