package com.example.ExercicesWithSolution.ExercicesWithSolution.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ExercicesController {


    @GetMapping("/exercices")
    public String showAll(Model model) {

        return "exercices";
    }
}
