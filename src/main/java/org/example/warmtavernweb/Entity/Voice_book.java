package org.example.warmtavernweb.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="voice_book")
public class Voice_book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int book_id;
    private int voice_id;

    public Voice_book(){}

    public Voice_book(int book_id, int voice_id) {
        this.book_id = book_id;
        this.voice_id = voice_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getVoice_id() {
        return voice_id;
    }

    public void setVoice_id(int voice_id) {
        this.voice_id = voice_id;
    }
}
