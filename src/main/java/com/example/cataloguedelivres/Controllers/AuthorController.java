package com.example.cataloguedelivres.Controllers;

import com.example.cataloguedelivres.Entity.Author;
import com.example.cataloguedelivres.Service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Author")
@Controller
public class AuthorController {
    private final AuthorService authorService;


    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public Author add(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }

    @GetMapping
    public List<Author> get() {
        return authorService.listAuthors();
    }

    @GetMapping("/{id}")
    public Author getID(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

}
