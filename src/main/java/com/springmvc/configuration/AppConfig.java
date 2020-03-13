package com.springmvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com.springmvc.*")
public class AppConfig {
	
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolverObj = new InternalResourceViewResolver();
		
		resolverObj.setViewClass(JstlView.class);
		resolverObj.setPrefix("/WEB-INF/views/");
		resolverObj.setSuffix(".jsp");
		
		return resolverObj;
	}

}
