package org.example.warmtavernweb.Entity;
public class Author {
    private int id;
    private String author_first_name;
    private String author_last_name;
    private String author_middle_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public void setAuthor_first_name(String author_first_name) {
        this.author_first_name = author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public void setAuthor_last_name(String author_last_name) {
        this.author_last_name = author_last_name;
    }

    public String getAuthor_middle_name() {
        return author_middle_name;
    }

    public void setAuthor_middle_name(String author_middle_name) {
        this.author_middle_name = author_middle_name;
    }

    public Author(int id, String author_first_name, String author_last_name, String author_middle_name) {
        this.id = id;
        this.author_first_name = author_first_name;
        this.author_last_name = author_last_name;
        this.author_middle_name = author_middle_name;
    }
}
