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
//        model.addAttribute("bookSet", bookService.getBooksThisYear());
//        model.addAttribute("bookThisYearSet", bookService.getBooksThisYear());

        return "library";
    }

//    @RequestMapping(value = "/editBook.jsp", method = RequestMethod.POST)
//    public String editBook(ModelMap model,
//                           @RequestParam("id") String bookName)      {
//        model.addAttribute("bookSet", bookService.getBookByName(bookName));
//
//        return "editBook";
//    }

    @RequestMapping(value = "/ThisYearBooks", method = RequestMethod.POST)
    public String getBooksOfYear(ModelMap model,
                            @RequestParam(value="filterYear", required=true) int filterYear){
        model.addAttribute("booksOfYearSet", bookService.getBooksOfYear(filterYear));

        return "library";
    }

    @RequestMapping(value = "/ThisYearBooks", method = RequestMethod.POST)
    public String getBooksThisYear(ModelMap model){
        model.addAttribute("bookThisYearSet", bookService.getBooksThisYear());

        return "library";
    }
}
