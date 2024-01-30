package com.basicSpringBootProject.basicSpringBootProject.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.basicSpringBootProject.basicSpringBootProject.Interceptors.SessionInterceptor;
import com.basicSpringBootProject.basicSpringBootProject.Interceptors.TestInterceptors;


@EnableWebMvc
@Configuration
public class IncepterHandlerConfiguration implements WebMvcConfigurer  {

	public void addInterceptors(InterceptorRegistry registry) {
	    registry.addInterceptor(new TestInterceptors());
	    registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/checkLogin");
		
	}

	    
}
