package org.example.warmtavernweb.Entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String book_name;
    private String book_caption;
    private String book_cover_path;
    private String book_path;

    public Book() {}

    public Book(String book_name, String book_caption, String book_cover_path, String book_path) {
        this.book_name = book_name;
        this.book_caption = book_caption;
        this.book_cover_path = book_cover_path;
        this.book_path = book_path;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_caption() {
        return book_caption;
    }

    public void setBook_caption(String book_caption) {
        this.book_caption = book_caption;
    }

    public String getBook_cover_path() {
        return book_cover_path;
    }

    public void setBook_cover_path(String book_cover_path) {
        this.book_cover_path = book_cover_path;
    }

    public String getBook_path() {
        return book_path;
    }

    public void setBook_path(String book_path) {
        this.book_path = book_path;
    }
}
