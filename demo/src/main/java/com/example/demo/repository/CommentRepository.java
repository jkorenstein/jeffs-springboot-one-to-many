package com.example.demo.repository;
import com.example.demo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import jakarta.transaction.Transactional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    // this JpaRepository interface extends the basic CRUD operations for the Comment entity.
    List<Comment> findByTutorialId(Long postId);

    @Transactional
    void deleteByTutorialId(long tutorialId);
}
