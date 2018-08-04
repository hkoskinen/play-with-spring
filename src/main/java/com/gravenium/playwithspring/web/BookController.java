package com.gravenium.playwithspring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    @GetMapping("/show-book-form")
    public String showBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "book-form";
    }

    @PostMapping("/process-form")
    public String processBookForm(@ModelAttribute Book book) {
        System.out.println("Book title: " + book.getTitle()
                + "\nBook author: " + book.getAuthor()
                + "\nBook genre: " + book.getGenre());
        return "book-confirmation";
    }

}
