package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @GetMapping
    public Book getBook(){
        return new Book("Calculus", 23.50, 22);
    }
    @GetMapping("/students")
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java", 23.50, 23));
        return books;
    }
}
