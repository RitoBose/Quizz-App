package com.rito.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rito.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
