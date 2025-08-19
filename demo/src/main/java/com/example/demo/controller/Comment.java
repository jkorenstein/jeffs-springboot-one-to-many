package com.example.demo.controller;

public class Comment {
    private Long id;
    private String content;
    private Long tutorialId;

    public Comment() {
    }

    public Comment(Long id, String content, Long tutorialId) {
        this.id = id;
        this.content = content;
        this.tutorialId = tutorialId;
    }
}
