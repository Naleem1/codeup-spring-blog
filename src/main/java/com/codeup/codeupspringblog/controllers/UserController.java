package com.codeup.codeupspringblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @GetMapping("/register")
    public String registration(){
        return "/register";
    }
}
