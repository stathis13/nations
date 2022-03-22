package com.qualco.nation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "country_id")
	private Long countryId;

	@Column(name = "name")
	private String name;

	@Column(name = "area")
	private Double area;
	
	@Column(name = "national_day")
	private Date nationalDay;
	
	@Column(name = "country_code2")
	private String countryCode2;
	
	@Column(name = "country_code3")
	private String countryCode3;
	
	@ManyToOne
	@JoinColumn(name = "region_id")
	private Region region;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Date getNationalDay() {
		return nationalDay;
	}

	public void setNationalDay(Date nationalDay) {
		this.nationalDay = nationalDay;
	}

	public String getCountryCode2() {
		return countryCode2;
	}

	public void setCountryCode2(String countryCode2) {
		this.countryCode2 = countryCode2;
	}

	public String getCountryCode3() {
		return countryCode3;
	}

	public void setCountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

