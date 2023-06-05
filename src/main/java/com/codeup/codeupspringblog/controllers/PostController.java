package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import com.codeup.codeupspringblog.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    private PostRepository postDao;


    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }
    @GetMapping("/posts")
    public String allPosts(Model model) {
        model.addAttribute("posts", postDao.findAll());
        postDao.findAll();
        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String individualPost(@PathVariable int id) {
        return "/posts/index";
    }

    @GetMapping("/posts/create")
    public String viewPost() {
        return "/posts/create";
    }

    @RequestMapping(path="/posts/create", method= RequestMethod.POST)
    public String createPost(@RequestParam(name="title") String title, @RequestParam(name="body") String body) {
        Post post = new Post(title,body);
        postDao.save(post);
        return "/posts/index";
    }



}
