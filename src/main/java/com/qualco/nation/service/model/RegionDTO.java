package com.qualco.nation.service.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "RegionDTO", description = "The region model object")
public class RegionDTO {

	@ApiModelProperty(value = "The region id")
	private Long regionId;

	@ApiModelProperty(value = "The region name")
	private String name;

	private ContinentDTO continent;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public ContinentDTO getContinent() {
		return continent;
	}

	public void setContinent(ContinentDTO continent) {
		this.continent = continent;
	}
}

