package com.springapp.mvc;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eva Sokolyanskaya on 25/10/2015.
 * My first Service class.
 */

@Service
public class BookService {

    private Set<Book> bookSet = new HashSet<>();

    public void saveBook(Book book) {
        bookSet.add(book);
    }

    public Set<Book> getAllBooks() {
        return bookSet;
    }
}
