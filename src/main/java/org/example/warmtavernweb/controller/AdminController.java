package org.example.warmtavernweb.controller;

import org.example.warmtavernweb.Converters.ConvertBook;
import org.example.warmtavernweb.DAO.*;
import org.example.warmtavernweb.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/AdminPage")
public class AdminController {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private GenreRepository genreRepository;
    @Autowired
    private VoicesRepository voicesRepository;
    @Autowired
    private BooksRepository booksRepository;
    @Autowired
    private Voice_bookRepository voice_bookRepository;
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AdminController.class);
    @ModelAttribute(name = "genres")
    public List<Genre> genre(){
        final List<Genre> genres = genreRepository.findAll();
        return genres;
    }
    @ModelAttribute(name = "authors")
    public List<Author> authors(){
        List<Author> authors = authorRepository.findAll();
        log.info("check repository" + authors.get(0));
        return authors;
    }
    @ModelAttribute(name = "voices")
    public List<Voice> voices(){
        List<Voice> voices = voicesRepository.findAll();
        return voices;
    }
    @GetMapping()
    public String adminPage(){
        return "AuthPages/AdminPage";
    }
    @PostMapping
    public String addBook(@RequestParam Map<String, String> params,
                          @Autowired ConvertBook convertBook){
        log.info(params.toString());
        booksRepository.save(
                new Book(
                        params.get("input-title"),
                        params.get("input-caption"),
                        "path",
                        "path/avatar"
                )
        );


        return "AuthPages/AdminPage";
    }
}

