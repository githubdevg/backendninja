package com.udemy.model;

public class ResponseTransfer {

    public ResponseTransfer(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
