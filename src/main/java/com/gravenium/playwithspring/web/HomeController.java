package com.gravenium.playwithspring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("t", "Spring MVC demo");
        model.addAttribute("h", "Hello from Spring MVC controller!");
        return "index";
    }
}
