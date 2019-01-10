package com.jaber2946.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreController {

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

}
