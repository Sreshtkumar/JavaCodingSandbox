package com.springbootjpa.springbootjpa.dao;

import com.springbootjpa.springbootjpa.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Questions, Integer> {
    List<Questions> findByCategory(String category);
}
