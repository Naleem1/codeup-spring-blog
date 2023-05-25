package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.repository.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdController {
    private final AdRepository adsDao;

    public AdController(AdRepository adsDao) {
        this.adsDao = adsDao;
    }
    public String AdIndex(Model model){
        model.addAttribute("ads", adsDao.findAll());
        return "ads/index";
    }
    @GetMapping("/ads/create")
    public String createAdForm(){
        return "ads/index";
    }
}
