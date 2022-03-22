package com.qualco.nation.service.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "CountryDTO", description = "The country model object")
public class CountryDTO  {
 
	@ApiModelProperty(value = "The country id")
	private Long countryId;

	@ApiModelProperty(value = "The country name")
	private String name;

	@ApiModelProperty(value = "The country geo location")
	private Double area;
	
	@ApiModelProperty(value = "The country national day")
	private Date nationalDay;
	
	@ApiModelProperty(value = "The country  code2")
	private String countryCode2;
	
	@ApiModelProperty(value = "The country code3")
	private String countryCode3;

	@ApiModelProperty(value = "The country region")
	private RegionDTO region;
	
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

	public RegionDTO getRegion() {
		return region;
	}

	public void setRegion(RegionDTO region) {
		this.region = region;
	}
}

