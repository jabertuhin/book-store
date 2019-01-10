package com.jaber2946.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookStoreController {

    @Autowired
    private BookStoreService bookStoreService;

    @RequestMapping("/")
    public String helloWorld(){
        return "<h1>Hello World<h2>";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/books")
    public List<Book> getAllBooks(){
        return bookStoreService.getAllbooks();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book){
        bookStoreService.addBook(book);
    }

}
