package com.ljs.chapter01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/22 20:45
 **/
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "xxxxhello spring boot";
    }
}
