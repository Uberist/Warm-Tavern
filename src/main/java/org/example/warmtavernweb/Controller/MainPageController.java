package org.example.warmtavernweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @GetMapping("/WarmTavernMain")
    public String WarmTavernMain(){

        return "MainPage";
    }
}
