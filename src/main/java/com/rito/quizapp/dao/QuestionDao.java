package com.rito.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rito.quizapp.model.Question;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM question q Where q.category=?1 ORDER BY RANDOM() ?2", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
