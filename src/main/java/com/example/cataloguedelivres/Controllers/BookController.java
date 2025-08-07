package com.example.cataloguedelivres.Controllers;

import com.example.cataloguedelivres.Entity.Author;
import com.example.cataloguedelivres.Entity.Book;
import com.example.cataloguedelivres.Service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
        return bookService.Add(book);
    }

    @GetMapping
    public List<Book> get() {
        return bookService.get();
    }

    @GetMapping("/{id}")
    public Book getID(@PathVariable Long id) {
        return bookService.getById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }

}
