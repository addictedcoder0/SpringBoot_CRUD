package com.example.controller;

import com.example.service.StudentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by abhishek.
 */
@RestController
public class WelcomeController {

    @Autowired
    StudentManager studentManager;

    @RequestMapping("/")
    public String sayHello(){
        System.out.println("hello world i am learning spring boot");
        System.out.println("==== student detail =====");
        System.out.println(studentManager.createStudent());
        ModelAndView andView = new ModelAndView();
        andView.setViewName("index");
        return "Hello master";
    }
}
