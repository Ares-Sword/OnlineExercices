package com.example.ExercicesWithSolution.ExercicesWithSolution.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Security  {
    @Bean
    public SecurityFilterChain securityMehtod(HttpSecurity security) throws Exception {
        security
                .authorizeHttpRequests((requests) -> requests
                        .antMatchers("/login").permitAll()
                        .antMatchers("/exercices").hasRole("USER"))

                .formLogin((form) -> form
                        .loginPage("/login").permitAll()
                        .defaultSuccessUrl("/exercices",true )
                        .permitAll())
                .logout((logout) -> logout.permitAll());
        return security.build();
    }
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user= User.withDefaultPasswordEncoder()
                .username("username")
                .password("password")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);


    }



}
