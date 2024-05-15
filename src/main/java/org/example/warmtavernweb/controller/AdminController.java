package org.example.warmtavernweb.controller;

import org.example.warmtavernweb.Converters.ConvertBook;
import org.example.warmtavernweb.DAO.AuthorRepository;
import org.example.warmtavernweb.Entity.Author;
import org.example.warmtavernweb.Entity.Book;
import org.example.warmtavernweb.Entity.Genre;
import org.example.warmtavernweb.Entity.Voice;
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
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AdminController.class);
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
        List<Author> authors = authorRepository.findAll();
        log.info("check repository" + authors.get(0));
        return authors;
    }
    @ModelAttribute(name = "voices")
    public List<Voice> voices(){
        return voices;
    }
    final List<Voice> voices = Arrays.asList(
        new Voice(1, "Igor Knizev hs"),
        new Voice(2, "oleg bulgacov hs")
    );
    @ModelAttribute(name = "book")
    final Book book() {
        return new Book();
    }
    final List<Book> books = new ArrayList<>();
    @ModelAttribute(name = "books")
    public List<Book> books (){
        return books;
    }
    @GetMapping()
    public String adminPage(){
        return "AuthPages/AdminPage";
    }
    @PostMapping
    public String addBook(@RequestParam Map<String, String> params,
                          @Autowired ConvertBook convertBook){
        Book book = convertBook.convertFromMap(params);
        books.add(book);
        log.info(
                                "book added:" + " " +
                                "book name: " + book.getBook_name() + " " +
                                "book caption: " + book.getBook_caption() + " " +
                                "book author: " + book.getBook_authors().get(0).getAuthor_first_name() + " " +
                                "book voice: " + book.getBook_voices().get(0).getVoice_name() + " " +
                                "book genre: " + book.getBook_genres().get(0).getGenre_name() + book.getBook_genres().get(1).getGenre_name());
        return "AuthPages/AdminPage";
    }
}

