package org.mukesh.main.configuration;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {
	@SuppressWarnings("unchecked")
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis((Predicate<RequestHandler>) RequestHandlerSelectors.basePackage("org.mukesh.main.controller"))
				.paths((Predicate<String>) PathSelectors.any()).build();

		/*
		 * groupName("Java Logic Lerning Center").apiInfo(apiInfo())
		 * .select().paths((Predicate<String>) regex("/product.*")).build();
		 * 
		 * }
		 * 
		 * private ApiInfo apiInfo() { return new ApiInfoBuilder().title("Produc API").
		 * description("JavaInUse API reference for developers")
		 * .termsOfServiceUrl("http://javainuse.com").license("JavaInUse License")
		 * .licenseUrl("javainuse@gmail.com").version("1.0").build();
		 */
	}
}
