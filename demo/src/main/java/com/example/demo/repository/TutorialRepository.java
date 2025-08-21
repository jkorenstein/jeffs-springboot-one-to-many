package com.example.demo.repository;
import java.util.List;

import com.example.demo.model.Comment;
import com.example.demo.model.Tutorial;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
//    this JpaRepository interface extends the basic CRUD operations for the Tutorial entity.
    List<Tutorial> findByPublished(boolean b);
    List<Tutorial> findByTitleContaining(String title);

    @Transactional
    void deleteById(long id);
}
