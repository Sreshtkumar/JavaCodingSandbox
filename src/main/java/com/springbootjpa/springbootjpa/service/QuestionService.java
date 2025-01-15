package com.springbootjpa.springbootjpa.service;

import com.springbootjpa.springbootjpa.Questions;
import com.springbootjpa.springbootjpa.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public ResponseEntity<List<Questions>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public List<Questions> getQuestionsByCtegory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestions(Questions questions) {
        questionDao.save(questions);
        return "success";
    }
}
