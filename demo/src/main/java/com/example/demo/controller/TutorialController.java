package com.example.demo.controller;

public class TutorialController {
    private Long id;
    private String title;
    private String description;
    private boolean published;

    public TutorialController() {
    }

    public TutorialController(Long id, String title, String description, boolean published) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
}
