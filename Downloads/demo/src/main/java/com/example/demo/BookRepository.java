package com.example.demo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import com.example.demo.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b INNER JOIN b.author a WHERE a.name = :name")
    List<Book> findBooksByAuthorName(@Param("name") String name);
}



