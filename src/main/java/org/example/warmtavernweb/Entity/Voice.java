package org.example.warmtavernweb.Entity;
public class Voice {
    private int id;
    private String voice_first_name;
    private String voice_last_name;
    private String voice_middle_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoice_first_name() {
        return voice_first_name;
    }

    public void setVoice_first_name(String voice_first_name) {
        this.voice_first_name = voice_first_name;
    }

    public String getVoice_last_name() {
        return voice_last_name;
    }

    public void setVoice_last_name(String voice_last_name) {
        this.voice_last_name = voice_last_name;
    }

    public String getVoice_middle_name() {
        return voice_middle_name;
    }

    public void setVoice_moddle_name(String voice_moddle_name) {
        this.voice_middle_name = voice_moddle_name;
    }

    public Voice(int id, String voice_first_name, String voice_last_name, String voice_middle_name) {
        this.id = id;
        this.voice_first_name = voice_first_name;
        this.voice_last_name = voice_last_name;
        this.voice_middle_name = voice_middle_name;
    }
}
