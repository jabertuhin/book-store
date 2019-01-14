package com.jaber2946.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookStoreController {

    @Autowired
    private BookStoreService bookStoreService;

    @RequestMapping(method = RequestMethod.GET, value = "/books")
    public List<Book> getAllBooks(){
        return bookStoreService.getAllbooks();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book){
        bookStoreService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/books/{bookName}")
    public Optional<Book> getBook(@PathVariable String bookName){
        return bookStoreService.getBook(bookName);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{bookName}")
    public void deleteBook(@PathVariable String bookName){
        bookStoreService.deleteBook(bookName);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/books/author/{authorName}")
    public Optional<Book> getBookByAuthor(@PathVariable String authorName){
        return bookStoreService.getBookByAuthor(authorName);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void updateBook(@RequestBody Book book,@PathVariable String id){
        bookStoreService.updateBook(book);
    }

}
