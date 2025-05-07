package com.example.demo;

import jakarta.persistence.*;  // ✅ JPA imports for entity and annotations
import java.util.List;  // ✅ Import for List type

@Entity  // Marks this class as a database table
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String bio;
    private Integer birthYear;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;
}

