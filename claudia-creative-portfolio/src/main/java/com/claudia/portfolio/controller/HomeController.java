package com.claudia.portfolio.controller;

import com.claudia.portfolio.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        List<Project> projects = List.of(
                new Project(
                        "Dough House Donuts",
                        "Web Design + Development",
                        "A playful, community-centered website concept for a vegan donut shop, inspired by nostalgic neighborhood bakeries and bold neon branding.",
                        "/images/donut-project.png",
                        "#contact",
                        "Java · Spring Boot · HTML · CSS",
                        true
                ),
                new Project(
                        "QA Experience Hub",
                        "Quality Engineering",
                        "A polished case-study concept showcasing test strategy, backend validation, automation, cross-team planning, and product launch support.",
                        "/images/qa-project.svg",
                        "#contact",
                        "Playwright · Java · API Testing",
                        true
                ),
                new Project(
                        "Plant-Based Supper Club",
                        "Brand + Experience Design",
                        "A whimsical luxury dining concept combining plant-based cuisine, immersive tablescapes, pastel color, and editorial storytelling.",
                        "/images/supper-club-project.svg",
                        "#contact",
                        "Creative Direction · Branding · UX",
                        true
                )
        );

        model.addAttribute("projects", projects);
        return "index";
    }
}
