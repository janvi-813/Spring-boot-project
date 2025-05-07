
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;          
import org.springframework.stereotype.Controller;                 
import org.springframework.ui.Model;                             
import org.springframework.web.bind.annotation.GetMapping;      
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PostMapping;       
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestParam;      

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
        return "authorsList"; 


    @PostMapping("/add")
    public String addAuthor(@ModelAttribute Author author) {
        authorService.saveAuthor(author);
        return "redirect:/authors";
    }
}

