package com.ljs.chapter02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/26 17:13
 **/
@RestController
public class BookController {

    @Autowired
    Book book;

    @Autowired
    Users users;

    @GetMapping("/book")
    public String Book(){
        return book.toString();
    }

    @GetMapping("/my")
    public String Users(){
        return users.toString();
    }


}
