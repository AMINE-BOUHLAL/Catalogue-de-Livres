package com.example.cataloguedelivres.Repository;

import com.example.cataloguedelivres.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
