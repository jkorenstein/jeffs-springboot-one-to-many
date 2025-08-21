package com.example.demo.model;
import jakarta.persistence.*;

import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_generator")
    private Long id;

    @Lob
    private String content;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tutorial_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Tutorial tutorial;

    // methods
//    List<Comment> findByTutorialId(Long id) {
//        // This method is used to find comments by the associated tutorial ID.
//        // The actual implementation would typically involve a query to the database.
//        // This method likely corresponds to a custom query leveraging Spring Data JPA's query derivation mechanism.
//        return null; // Placeholder for actual implementation
//    }

    // getters and setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTutorial(Tutorial tutorial) {
        this.tutorial = tutorial;
    }
}