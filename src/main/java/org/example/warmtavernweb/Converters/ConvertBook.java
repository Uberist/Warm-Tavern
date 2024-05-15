package org.example.warmtavernweb.Converters;

import org.example.warmtavernweb.controller.AdminController;
import org.example.warmtavernweb.Entity.Author;
import org.example.warmtavernweb.Entity.Book;
import org.example.warmtavernweb.Entity.Genre;
import org.example.warmtavernweb.Entity.Voice;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ConvertBook {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AdminController.class);
    public Book convertFromMap(Map<String, String> field){
        List<Author> authors_list = new ArrayList<>();
        authors_list.add((new Author(0, field.get("input-author"), field.get("input-author"), field.get("input-author"))));

        List <Genre> genre_list = new ArrayList<>();
        int counter = 0;
        for(Map.Entry<String, String> entry : field.entrySet())
            if(entry.getKey().indexOf("input-genre") > -1){
                genre_list.add(new Genre(0, entry.getValue()));
                counter++;
                log.info("covert book: " + counter);
            }

        List <Voice> voice_list  = new ArrayList<>();
        voice_list.add(new Voice(0, field.get("input-reader")));

        Book book = new Book(
                0,
                field.get("input-title"),
                field.get("input-caption"),
                " ",
                " ",
                authors_list,
                genre_list,
                voice_list);
        return book;
    }
}
