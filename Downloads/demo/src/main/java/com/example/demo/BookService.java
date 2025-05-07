package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Book;
import com.example.demo.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooksByAuthor(String name) {
        return bookRepository.findBooksByAuthorName(name);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}


