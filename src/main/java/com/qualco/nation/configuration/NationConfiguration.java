package com.qualco.nation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import com.qualco.nation.manager.NationManager;
import com.qualco.nation.service.NationService;

@Configuration
@Validated
public class NationConfiguration {

	@Bean
	public NationManager nationManager() {
		return new NationManager();
	}
	
	@Bean
	public NationService nationService() {
		return new NationService();
	}
}

