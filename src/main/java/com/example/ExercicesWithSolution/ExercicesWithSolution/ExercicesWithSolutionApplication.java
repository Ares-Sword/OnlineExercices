package com.example.ExercicesWithSolution.ExercicesWithSolution;


import com.example.ExercicesWithSolution.ExercicesWithSolution.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication()
public class ExercicesWithSolutionApplication {
	@Autowired
	private static UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExercicesWithSolutionApplication.class, args);



	}




}
