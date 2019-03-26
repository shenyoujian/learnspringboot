package com.ljs.chapter02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/22 23:54
 **/
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "ssss";
    }
}
