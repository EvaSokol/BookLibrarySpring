package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LibraryController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello my world!");
        return "library";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String storeBook(ModelMap model,
                            @RequestParam(value="bookName", required=true) String bookName,
                            @RequestParam(value="authorName", required=true) String authorName,
                            @RequestParam(value="productionYear", required=true) int productionYear){
        bookService.saveBook(new Book(bookName, authorName, productionYear));
        model.addAttribute("bookSet", bookService.getAllBooks());

        return "library";
    }
}
