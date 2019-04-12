package com.ljs.controller;

import com.ljs.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/4/12 16:23
 **/
@Controller
public class BookController {

    @GetMapping("/books")
    public ModelAndView Books(){

        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(1);
        book1.setName("springboot");
        book1.setAuthor("王松");

        Book book2 = new Book();
        book2.setId(2);
        book2.setName("vue");
        book2.setAuthor("王松");

        books.add(book1);
        books.add(book2);

        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }
}
