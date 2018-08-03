package com.gravenium.playwithspring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("t", "Spring MVC demo");
        model.addAttribute("h", "Hello from Spring MVC controller!");
        return "index";
    }

    @GetMapping("/contact-form")
    public String showForm() {
        return "contact-form";
    }

    @GetMapping("/handle-form")
    public String handleForm(Model model, @RequestParam(required = false) String name,
                             @RequestParam(required = false) String email,
                             @RequestParam(required = false) String message ) {
        model.addAttribute("name", name.toUpperCase());
        model.addAttribute("email", email);
        model.addAttribute("message", message);

        return "handle-form";
    }
}
