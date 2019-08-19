package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar1", "Passing first variable to template.");
        model.addAttribute("myvar2", "Passing second variable to template.");
        return "hometemplate";
    }
}
