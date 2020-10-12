package com.etc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHi(){
        return "helloworld";
    }

    @RequestMapping("/hello1")
    @ResponseBody
    public String sayHi1(){
        return "helloworld1";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public String sayHi2(){
        return "helloworld2";
    }

}
