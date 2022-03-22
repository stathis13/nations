package com.qualco.nation.service.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "RegionAreaDTO", description = "The region area model object")
public class RegionAreaDTO {

	@ApiModelProperty(value = "The region area id")
	private Long regionArea;
	
	@ApiModelProperty(value = "The region area name")
	private String regionName;

	public Long getRegionArea() {
		return regionArea;
	}

	public void setRegionArea(Long regionArea) {
		this.regionArea = regionArea;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}

