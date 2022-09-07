package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.bean.Product;

//business logic class

/*
 * 
 * Spring @Configuration annotation helps in Spring annotation based configuration.
 *  @Configuration annotation indicates that a class declares one or more @Bean methods
 *   and may be processed by the Spring container to generate bean definitions and
 *    service requests for those beans at runtime.
 */

/**
 * Spring @Bean Annotation is applied on a method to specify that it returns a
 * bean to be managed by Spring context. Spring Bean annotation is usually
 * declared in Configuration classes methods
 * 
 */
@Configuration
@ComponentScan(basePackages = "com.demo")
public class AppConfig {

	@Bean
	Product product() {
		return new Product();

	}

}
