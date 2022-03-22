package com.qualco.nation.service.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "CountryLanguageDTO", description = "The country language model object")
public class CountryLanguageDTO {

	@ApiModelProperty(value = "The country of the language")
	private CountryDTO country;
	
	@ApiModelProperty(value = "The language")
	private LanguageDTO language;
	
	@ApiModelProperty(value = "The flag indicating if it an official language of the country")
	private Integer official;

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public LanguageDTO getLanguage() {
		return language;
	}

	public void setLanguage(LanguageDTO language) {
		this.language = language;
	}

	public Integer getOfficial() {
		return official;
	}

	public void setOfficial(Integer official) {
		this.official = official;
	}

}

