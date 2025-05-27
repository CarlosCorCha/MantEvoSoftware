package com.jsonplaceholder;

public class Comment {
    private int id;
    private String text;

    public Comment(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getText() { return text; }
}
