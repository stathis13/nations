package com.qualco.nation.service.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "LanguageDTO", description = "The language model object")
public class LanguageDTO {

	@ApiModelProperty(value = "The language id")
	private Long languageId;
	
	@ApiModelProperty(value = "The language description")
	private String language;

	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}

