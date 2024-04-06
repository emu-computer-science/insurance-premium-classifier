package com.group1.ipc.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class SecurityConfig {
	
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		config.addAllowedOrigin("http://localhost:5173");
		source.registerCorsConfiguration("/**", config);
		return source;
	}

	@Bean
	SecurityFilterChain httpSecurity(HttpSecurity http, CorsConfigurationSource corsConfigurationSource) throws Exception {
		return http.httpBasic((customizer) -> {
			customizer.disable();
		}).authorizeHttpRequests((customizer) -> {
			customizer.anyRequest().permitAll();
		}).cors((customizer) -> {
			customizer.configurationSource(corsConfigurationSource);
		}).csrf((customizer) -> {
			customizer.disable();
		}).build();
	}
	
}
