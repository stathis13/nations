package com.qualco.nation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(CountryLanguageId.class)
@Table(name = "country_languages")
public class CountryLanguage  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	
	@Column(name = "official")
	private Integer official;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Integer getOfficial() {
		return official;
	}

	public void setOfficial(Integer official) {
		this.official = official;
	}

}

