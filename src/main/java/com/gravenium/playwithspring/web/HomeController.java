package com.gravenium.playwithspring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

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
    public String handleForm(Model model, HttpServletRequest request) {
        String name = request.getParameter("name");
        model.addAttribute("name", name.toUpperCase());
        model.addAttribute("email", request.getParameter("email"));
        model.addAttribute("message", request.getParameter("message"));

        return "handle-form";
    }
}
