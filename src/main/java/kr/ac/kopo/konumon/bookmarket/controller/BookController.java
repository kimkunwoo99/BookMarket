package kr.ac.kopo.konumon.bookmarket.controller;


import kr.ac.kopo.konumon.bookmarket.domain.Book;
import kr.ac.kopo.konumon.bookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/books")
public class BookController {
    @Autowired
    private BookService bookService;


    @GetMapping
    public String requestBookList(Model model) {
        List<Book> bookList = bookService.getAllBookList();
        System.out.println("bookList:" + bookList);
        model.addAttribute("bookList", bookList);
        return "books";
    }



    @GetMapping("/all")
    public ModelAndView requestAllBookList() {
        ModelAndView modelV = new ModelAndView();
        modelV.setViewName("books");
        List<Book> bookList = bookService.getAllBookList();
        modelV.addObject("bookList", bookList);
        return modelV;
    }
    @GetMapping("/book")
    public String requestBookById(@RequestParam("id") String bookId, Model model) {
        Book book = bookService.getBookById(bookId);
        model.addAttribute("book", book);
        return "book";
    }

    @GetMapping("/{category}")
    public String requestBookByCategory(@PathVariable("category")String category, Model model) {
        List<Book> booksByCategory = bookService.getBookListByCategory(category);
        model.addAttribute("bookList", booksByCategory);
        return "books";
    }
}