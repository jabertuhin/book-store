package com.jaber2946.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookStoreService {

    @Autowired
    private BookRepository bookRepository;

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public List<Book> getAllbooks(){

        List<Book> bookList = new ArrayList<>();

        bookRepository.findAll().forEach(bookList::add);

        return bookList;
    }

}
