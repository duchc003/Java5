package com.example.demo.lab2.bai1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaiOneController {
    @RequestMapping("/bai-one")
    public String baiOne(){
        return "lab2/bai1/bai1";
    }

    public String m1(){
        return "lab2/bai1/bai1";
    }

    public String m2(){
        return "lab2/bai1/bai1";
    }

    public String m3(){
        return "lab2/bai1/bai1";
    }
}
