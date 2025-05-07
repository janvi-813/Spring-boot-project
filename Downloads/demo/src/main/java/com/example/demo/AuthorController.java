
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;          // For @Autowired
import org.springframework.stereotype.Controller;                 // For @Controller
import org.springframework.ui.Model;                             // For Model
import org.springframework.web.bind.annotation.GetMapping;      // For @GetMapping
import org.springframework.web.bind.annotation.ModelAttribute;    // For @ModelAttribute
import org.springframework.web.bind.annotation.PostMapping;       // For @PostMapping
import org.springframework.web.bind.annotation.RequestMapping;    // For @RequestMapping
import org.springframework.web.bind.annotation.RequestParam;      // For @RequestParam (if needed)

import com.example.demo.Author;
import com.example.demo.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public String getAllAuthors(Model model) {
        model.addAttribute("authors", authorService.getAllAuthors());
        return "authorsList"; // View name (JSP, Thymeleaf, etc.)
    }

    @PostMapping("/add")
    public String addAuthor(@ModelAttribute Author author) {
        authorService.saveAuthor(author);
        return "redirect:/authors";
    }
}

