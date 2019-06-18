package com.example.spring_boot_templete.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value ={"/hi","hello"}, method = RequestMethod.GET)
    public String say() {
        return "good morning";
    }
}
