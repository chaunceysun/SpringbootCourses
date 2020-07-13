package com.abc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SomeController {
    @GetMapping("/some")
    public String someHandler() {
        return "Hello spring boot world";
    }

    @GetMapping("/mav")
    public ModelAndView testMAVHandler() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/some");
//        mav.addObject("message", new String("Hello Kitty!"));
        return mav;
    }
}
