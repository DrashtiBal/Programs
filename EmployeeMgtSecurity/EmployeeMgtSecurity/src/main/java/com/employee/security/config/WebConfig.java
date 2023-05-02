package com.employee.security.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.employee.security.filter.DisplayUpperCaseFilter;

@Configuration
public class WebConfig {

	@Bean
	 public FilterRegistrationBean<DisplayUpperCaseFilter> uppercaseQueryParamFilter() {
		FilterRegistrationBean<DisplayUpperCaseFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new DisplayUpperCaseFilter());
        registrationBean.addUrlPatterns("/api/deskbook"); // You can adjust the URL pattern as needed
        return registrationBean;
		
	}
}