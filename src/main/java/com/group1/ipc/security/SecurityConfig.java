package com.group1.ipc.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain httpSecurity(HttpSecurity http) throws Exception {
		return http.httpBasic((customizer) -> {
			customizer.disable();
		}).authorizeHttpRequests((customizer) -> {
			customizer.anyRequest().permitAll();
		}).build();
	}
	
}
