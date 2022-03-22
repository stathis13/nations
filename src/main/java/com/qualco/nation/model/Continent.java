package com.qualco.nation.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "continents")
public class Continent implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "continent_id")
	private Long continentId;

	@Column(name = "name")
	private String name;

	public Long getContinentId() {
		return continentId;
	}

	public void setContinentId(Long continentId) {
		this.continentId = continentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

