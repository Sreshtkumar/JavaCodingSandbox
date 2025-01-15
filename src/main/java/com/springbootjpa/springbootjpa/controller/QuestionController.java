package com.springbootjpa.springbootjpa.controller;

import com.springbootjpa.springbootjpa.Questions;
import com.springbootjpa.springbootjpa.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Questions>> getAllQuestions(){
        return questionService.getAllQuestions();
        //return "Hi, these are returned questions";
    }
    @GetMapping("category/{category}")
    public List<Questions> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCtegory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Questions questions){
        return questionService.addQuestions(questions);
    }
}
