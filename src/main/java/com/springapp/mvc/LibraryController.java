package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Eva Sokolyanskaya on 25/10/2015.
 * My first Controller class.
 */
public class LibraryController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String storeUser(ModelMap model, @RequestParam(value="bookName", required=true) String bookName) {
        bookService.saveBook(new Book(bookName));
        model.addAttribute("bookSet", bookService.getAllBooks());


        return "hello";
    }
}
