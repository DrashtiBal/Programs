package com.employee.security.security;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.util.pattern.PatternParseException.PatternMessage;

import com.employee.security.password.PasswordEncoderSecurity;

@Configuration
@EnableWebSecurity
public class BasicAuth extends WebSecurityConfigurerAdapter{

	@Autowired
	private PasswordEncoderSecurity passwordencoder;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/api/**").hasAnyRole("EMPLOYEE")
		//.antMatchers("/", "index").permitAll()
		.anyRequest()
		.authenticated()
		.and().httpBasic();
	}
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		
		UserDetails builder = User.builder()
				//.username("drashti")
				.username("drashti")
				.password(passwordencoder.password().encode("drashti@123"))
				.roles("EMPLOYEE")
				.build();
		return new InMemoryUserDetailsManager(
			
				builder);
	}	
}
