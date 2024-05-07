package org.example.warmtavernweb.Entity;
public class Voice {
    private int id;
    private String voice_name;
    public Voice(int id, String voice_name) {
        this.id = id;
        this.voice_name = voice_name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoice_name() {
        return voice_name;
    }

    public void setVoice_name(String voice_name) {
        this.voice_name = voice_name;
    }
}
