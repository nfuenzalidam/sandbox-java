package com.nfuenzalidam.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String index1(){
        return "indexRequestMapping";
    }
    @GetMapping({"/index1", "/"})
    public String index2(){
        return "indexGetMapping";
    }
}
