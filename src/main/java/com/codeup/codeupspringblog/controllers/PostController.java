package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String allPosts() {
        return "post index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String individualPost(@PathVariable String id) {
        return "view individual post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewPost() {
        return "view the form for creating a post";
    }

    @RequestMapping(path="/posts/create", method= RequestMethod.POST)
    @ResponseBody
    public String createPost() {
        return "create a new post";
    }



}
