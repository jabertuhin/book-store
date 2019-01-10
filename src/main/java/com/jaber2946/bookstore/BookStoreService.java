package com.jaber2946.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Optional<Book> getBook(String bookName){
        return bookRepository.findById(bookName);
    }


    public void deleteBook(String bookName) {
        bookRepository.deleteById(bookName);
    }

    public Optional<Book> getBookByAuthor(String authorName) {

        return bookRepository.findByAuthor(authorName);
    }
}
