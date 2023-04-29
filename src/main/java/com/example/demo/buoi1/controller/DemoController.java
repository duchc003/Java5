package com.example.demo.buoi1.controller;

import com.example.demo.buoi1.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        User user = new User();
        user.setName("alo");
        return "index";
    }
}
