package com.example.cataloguedelivres.Repository;

import com.example.cataloguedelivres.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

//2
    @Query("SELECT A FROM Author A WHERE A.name  LIKE 'A%' ")
    public List<Author> findByAuthorLike();
}
