package org.example.warmtavernweb.Entity;


import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String book_name;
    private String book_caption;
    private String book_path;
    private String book_cover_path;
    private List<Author> authors = new ArrayList<>();
    private List<Genre> genres = new ArrayList<>();
    private void addAuthor(Author author){
        authors.add(author);
    }
    private void deleteAuthor(Author author){
        authors.remove(author);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBook_path() {
        return book_path;
    }

    public void setBook_path(String book_path) {
        this.book_path = book_path;
    }

    public String getBook_cover_path() {
        return book_cover_path;
    }

    public void setBook_cover_path(String book_cover_path) {
        this.book_cover_path = book_cover_path;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Book(int id, String book_name, String book_caption, String book_path, String book_cover_path, List<Author> authors, List<Genre> genres) {
        this.id = id;
        this.book_name = book_name;
        this.book_caption = book_caption;
        this.book_path = book_path;
        this.book_cover_path = book_cover_path;
        this.authors = authors;
        this.genres = genres;
    }
}
