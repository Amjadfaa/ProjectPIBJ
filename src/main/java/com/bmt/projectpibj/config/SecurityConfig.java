package com.bmt.projectpibj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests( auth -> auth
                		.requestMatchers("/").permitAll()
                		.requestMatchers("/contact").permitAll()
	                    .requestMatchers("/store/**").permitAll()
	                    .requestMatchers("/register").permitAll()
	                    .requestMatchers("/login").permitAll()
	                    .requestMatchers("/logout").permitAll()
	                    .requestMatchers("/client/**").hasRole("client")
	                    .requestMatchers("/admin/**").hasRole("admin")
	                    .anyRequest().authenticated()
                )
                .formLogin(form -> form
                		.loginPage("/login")
                		.usernameParameter("email")
                		.passwordParameter("password")
                		.defaultSuccessUrl("/", true)
                )
                .logout(config -> config.logoutSuccessUrl("/"))
        		.build();
    }
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
}































