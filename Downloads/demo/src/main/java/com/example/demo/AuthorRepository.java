package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> { }




