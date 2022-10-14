package com.example.ExercicesWithSolution.ExercicesWithSolution.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Login {
    @GetMapping("/login")
    public String Login() {

        return "login";
    }
}
