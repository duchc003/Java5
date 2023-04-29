package com.example.demo.buoi2.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping(
    )
    public String index() {
        return "buoi2/user";
    }

    @GetMapping(
            value = "/show/{id}"
    )
    public String show(@PathVariable(name = "id") Integer id) {
        System.out.println("ID:" +id);
        this.request.getParameter("id");
        return "buoi2/user-show";
    }

    @GetMapping(
        value = "/create"
    )
    public String create() {
        return "buoi2/user-create";
    }

    @PostMapping(value = "/store")
    public String store() {
        return "";
    }

    @GetMapping(
            value = "/edit",params = "id"
    )
    public String edit() {
        return "buoi2/user-edit";
    }

    @PostMapping(
            value = "/update",params = "id"
    )
    public String update() {
        return "";
    }

    @PostMapping(
            value = "/delete",params = "id"
    )
    public String delete() {
        return "";
    }

}
