package com.example.cataloguedelivres.Service;

import com.example.cataloguedelivres.Entity.Author;
import com.example.cataloguedelivres.Repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }



    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> listAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.getReferenceById(id);
    }
}
