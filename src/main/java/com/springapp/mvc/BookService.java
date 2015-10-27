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

    public Set<Book> getBooksThisYear() {
        Set<Book> yearSet = new HashSet<>();
        for(Book book : bookSet)
            if (book.getProductionYear() == 2015) yearSet.add(book);
        return yearSet;
    }

    public Set<Book> getBooksOfYear(int year) {
        Set<Book> yearSet = new HashSet<>();
        for(Book book : bookSet)
            if (book.getProductionYear() == year) yearSet.add(book);
        return yearSet;
    }

    public Book getBookByName(String bookName) {
        for (Book book : bookSet) {
            if (bookName.equals(bookName))
                return book;
        }
        return null;
    }

    public void editBook(String bookName, String author, int year) {
        Book book  = getBookByName(bookName);
        book.setAuthorName(author);
        book.setProductionYear(year);
    }
}
