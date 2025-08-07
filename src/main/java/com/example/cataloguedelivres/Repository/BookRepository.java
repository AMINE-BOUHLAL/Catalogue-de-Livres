package com.example.cataloguedelivres.Repository;

import com.example.cataloguedelivres.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Long> {

//    5
    @Query("SELECT count(*)AS total FROM Book ")
     int getTotalBooks();



}
