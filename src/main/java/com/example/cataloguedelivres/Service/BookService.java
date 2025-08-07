package com.example.cataloguedelivres.Service;

import com.example.cataloguedelivres.Entity.Book;
import com.example.cataloguedelivres.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> get() {
        return bookRepository.findAll();
    }

    public Book getById(Long id) {
        return bookRepository.getReferenceById(id);
    }

    public Book Add(Book book) {
        return bookRepository.save(book);
    }

    public void  delete(Long id) {
        bookRepository.deleteById(id);
    }

}
