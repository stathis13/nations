package com.qualco.nation.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "region_areas")
public class RegionArea {

	@Id
	@Basic(optional = false)
	@Column(name = "region_area")
	private Long regionArea;
	
	@Column(name = "region_name")
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

