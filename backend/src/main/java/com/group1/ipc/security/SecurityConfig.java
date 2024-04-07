package com.group1.ipc.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;
import org.springframework.web.cors.CorsConfigurationSource;

import com.group1.ipc.repositories.IClientRepository;
import com.group1.ipc.repositories.IEmployeeRepository;

@Configuration
public class SecurityConfig {
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	EmailPasswordAuthenticationProvider authenticationProvider(PasswordEncoder passwordEncoder, IClientRepository clientRepository, IEmployeeRepository employeeRepository) {
		return new EmailPasswordAuthenticationProvider(passwordEncoder, clientRepository, employeeRepository);
	}
	
	@Bean
	AuthenticationManager authenticationManager(HttpSecurity http, AuthenticationProvider authenticationProvider) throws Exception {
		AuthenticationManagerBuilder builder = http.getSharedObject(AuthenticationManagerBuilder.class);
		builder.authenticationProvider(authenticationProvider);
		return builder.build();
	}

	@Bean
	SecurityFilterChain httpSecurity(HttpSecurity http, CorsConfigurationSource corsConfigurationSource) throws Exception {
		return http.httpBasic((customizer) -> {
			customizer.disable();
		}).cors((customizer) -> {
			customizer.disable();
		}).csrf((customizer) -> {
			customizer.disable();
		}).authorizeHttpRequests((customizer) -> {
			customizer.requestMatchers(RegexRequestMatcher.regexMatcher("/user[a-zA-Z-]+")).hasRole("CLIENT")
					  .requestMatchers("/employee").hasRole("EMPLOYEE")
					  .anyRequest().permitAll();
		}).formLogin((customizer) -> {
			customizer.loginPage("/login");
			customizer.usernameParameter("email");
		}).build();
	}
	
}
