package com.example.demo.models;

public class Twit {

    private String name;
    private String text;

    public Twit(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public Twit(String twitName) {
    }

    public String getText() {
        return text;
    }

    public String getName(){
        return name;
    }

    public String setText(String text) {
        this.text = text;
        return text;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }


}


