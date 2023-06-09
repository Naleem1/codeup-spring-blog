package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody()
    public String hello() {
        return "Hello from spring Boot!";
    }

    @GetMapping("/hello/{name}")
    @ResponseBody()
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(path="/hello/{name1}/and/{name2}",method= RequestMethod.POST)
    @ResponseBody()
    public String sayHelloTwo(@PathVariable String name1, @PathVariable String name2) {
        return name1 + " says hello to " + name2;
    }

}
