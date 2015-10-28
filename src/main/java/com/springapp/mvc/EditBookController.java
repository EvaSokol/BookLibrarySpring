package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/editBook.jsp")
public class EditBookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/editBook.html", method = RequestMethod.GET)
    public String printWelcome(ModelMap model,
                               @RequestParam(value="id", required=true) String bookName) {
        model.addAttribute("message", "Hello my world!");
        return "library";
    }

    @RequestMapping(value = "/editBook.html", method = RequestMethod.POST)
    public String editBook(ModelMap model,
                           @RequestParam(value="id", required=true) String bookName)      {
        model.addAttribute("bookSet", bookService.getBookByName(bookName));

        return "editBook";
    }
}
