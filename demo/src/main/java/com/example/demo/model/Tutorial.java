package com.example.demo.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Tutorial() {
    }

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
//    // methods
//    List<Tutorial> findByPublished(boolean published) {
//        // This method is used to find tutorials by their published status.
//        // The actual implementation would typically involve a query to the database.
//        // This method likely corresponds to a custom query leveraging Spring Data JPA's query derivation mechanism.
//        return null; // Placeholder for actual implementation
//    }
//    List<Tutorial> findByTitleContaining(String title) {
//        // This method is used to find tutorials by title containing a specific string.
//        // The actual implementation would typically involve a query to the database.
//        // This method likely corresponds to a custom query leveraging Spring Data JPA's query derivation mechanism.
//        return null; // Placeholder for actual implementation
//    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object isPublished() {
        return published;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublished(Object published) {
        if (published instanceof Boolean) {
            this.published = (Boolean) published;
        } else if (published instanceof String) {
            this.published = Boolean.parseBoolean((String) published);
        } else {
            throw new IllegalArgumentException("Invalid type for published: " + published.getClass().getName());
        }
    }
}
