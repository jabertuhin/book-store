package com.jaber2946.bookstore;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends CrudRepository<Book,String> {

    public Optional<Book> findByAuthor(String author);

}
