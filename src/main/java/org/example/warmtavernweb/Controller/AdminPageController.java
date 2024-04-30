package org.example.warmtavernweb.Controller;

import org.example.warmtavernweb.Entity.Author;
import org.example.warmtavernweb.Entity.Genre;
import org.example.warmtavernweb.Entity.Voice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/AdminPage")
public class AdminPageController {
    @ModelAttribute(name = "genres")
    public List<Genre> genre(){
        return genres;
    }
    final List<Genre> genres = Arrays.asList(
            new Genre(1, "Romantic"),
            new Genre(2, "Detectiv"),
            new Genre(3, "Action"),
            new Genre(4, "Document"),
            new Genre(5, "Fantastic")
    );
    @ModelAttribute(name = "authors")
    public List<Author> authors(){
        return authors;
    }
    final List<Author> authors = Arrays.asList(
            new Author(1, "Striven", "Kink", "hs"),
            new Author(2, "Alecsandr" ,"Sergeevic", "Pushckin"),
            new Author(3, "alecandr", "noname", "hs")
    );
    @ModelAttribute(name = "voices")
    public List<Voice> voices(){
        return voices;
    }
    final List<Voice> voices = Arrays.asList(
        new Voice(1, "Igor", "Knizev", "hs"),
        new Voice(2, "oleg", "bulgacov", "hs")
    );
    @GetMapping()
    public String adminPage(){
        return "AuthPages/AdminPage";
    }
}

