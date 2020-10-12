package com.etc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

   @RequestMapping("/index")
   public ModelAndView test(){
      ModelAndView mv = new ModelAndView("index2");
       mv.addObject("uname","xmetc");
        return mv;
    }
}
