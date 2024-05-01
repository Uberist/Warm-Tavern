package org.example.warmtavernweb.Controller;

import org.example.warmtavernweb.Entity.Author;
import org.example.warmtavernweb.Entity.Book;
import org.example.warmtavernweb.Entity.Genre;
import org.example.warmtavernweb.Entity.Voice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/AdminPage")
public class AdminPageController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AdminPageController.class);
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
    @ModelAttribute(name = "book")
    final Book book(){
        return new Book();
    }
    final List<Book> books = new ArrayList<>();
    @GetMapping()
    public String adminPage(){
        return "AuthPages/AdminPage";
    }
    @PostMapping
    public String addBook(Book book){
        String author_name = "";
        String voice_name = "";
        String genre_name = "";
        for (Author el : book.getBook_authors())
            author_name = author_name + (el.getAuthor_first_name() + " " + el.getAuthor_last_name() + " " + el.getAuthor_middle_name() + ", ");
        for (Voice el : book.getBook_voices())
            voice_name = voice_name + (el.getVoice_first_name() + " " + el.getVoice_last_name() + " " + el.getVoice_middle_name() + ", ");
        for (Genre el : book.getBook_genres())
            genre_name = genre_name + el.getGenre_name() + ", ";
        books.add(book);
        log.info("book added: ", book.getBook_name(), author_name, voice_name, genre_name);
        return "AuthPages/AdminPage";
    }
}

