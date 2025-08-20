package com.example.demo.repository;
import java.util.List;

import com.example.demo.model.Comment;
import com.example.demo.model.Tutorial;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
//    this JpaRepository interface extends the basic CRUD operations for the Tutorial entity.
    List<Comment> findByTutorialId(Long postId);

    @Transactional
    void deleteByTutorialId(long tutorialId);

    default Iterable<Object> findByTitleContaining(String title) {
        // This method is used to find tutorials by title containing a specific string.
        // The actual implementation would typically involve a query to the database.
        // This method likely corresponds to a custom query leveraging Spring Data JPA's query derivation mechanism.
        return null; // Placeholder for actual implementation
    };

}
