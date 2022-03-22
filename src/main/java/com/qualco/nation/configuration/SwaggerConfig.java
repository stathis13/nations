package com.qualco.nation.configuration;

import com.google.common.base.Predicate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import static springfox.documentation.builders.PathSelectors.regex;
 
@Configuration
public class SwaggerConfig {
	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
					.apiInfo(getApiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.qualco.nation"))
	                .paths(getPaths())
	                .build();
	    }
	
	private Predicate<String> getPaths() {
		return regex("/api/v1.0/nation.*");
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfoBuilder()
				.title("QUALCO nation API")
				.description("QUALCO nation API")
				.version("1.0")
				.build();
	}
}