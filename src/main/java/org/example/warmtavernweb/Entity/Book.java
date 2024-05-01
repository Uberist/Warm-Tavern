package org.example.warmtavernweb.Entity;


import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String book_name;
    private String book_caption;
    private String book_path;
    private String book_cover_path;
    private List<Author> book_authors = new ArrayList<>();
    private List<Genre> book_genres = new ArrayList<>();
    private List<Voice> book_voices = new ArrayList<>();
    public void addAuthor(Author author) {
        book_authors.add(author);
    }
    public void deleteAuthor(Author author) {
        book_authors.remove(author);
    }
    public void addGenre(Genre genre) {
        book_genres.add(genre);
    }
    public void deleteGenre(Genre genre) {
        book_genres.remove(genre);
    }
    public void addVoice(Voice voice) {
        book_voices.add(voice);
    }
    public void deleteVoice(Voice voice) {
        book_voices.remove(voice);
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

    public List<Author> getBook_authors() {
        return book_authors;
    }

    public void setBook_authors(List<Author> book_authors) {
        this.book_authors = book_authors;
    }

    public List<Genre> getBook_genres() {
        return book_genres;
    }

    public void setBook_genres(List<Genre> book_genres) {
        this.book_genres = book_genres;
    }

    public List<Voice> getBook_voices() {
        return book_voices;
    }

    public void setBook_voices(List<Voice> book_voices) {
        this.book_voices = book_voices;
    }

    public Book(int id, String book_name, String book_caption, String book_path, String book_cover_path, List<Author> book_authors, List<Genre> book_genres, List<Voice> book_voices) {
        this.id = id;
        this.book_name = book_name;
        this.book_caption = book_caption;
        this.book_path = book_path;
        this.book_cover_path = book_cover_path;
        this.book_authors = book_authors;
        this.book_genres = book_genres;
        this.book_voices = book_voices;
    }
    public Book() {
    }
}
