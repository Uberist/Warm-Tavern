package org.example.warmtavernweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/WarmTavernMain")
public class MainPageController {
    @GetMapping
    public String WarmTavernMain(){
        return "MainPage";
    }
}
