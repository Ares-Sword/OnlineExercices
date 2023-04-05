package com.example.ExercicesWithSolution.ExercicesWithSolution.Security;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Security
{
    @Autowired
UserService userService;



    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
    {

        auth.inMemoryAuthentication().passwordEncoder(passwordEncoder).withUser("user").password(("{noop}password")).authorities("USER");
        auth.userDetailsService(userService).passwordEncoder(NoOpPasswordEncoder.getInstance());


    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.formLogin().loginPage("/login").defaultSuccessUrl("/exercices");
        return http.build();
    }

    PasswordEncoder passwordEncoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();



    }



