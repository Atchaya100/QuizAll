package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Questions;
import com.example.demo.repository.QuestionRepository;

@Service
public class QuesService {
	@Autowired
	QuestionRepository qrepo;
public Questions create(Questions question) {
	return qrepo.save(question);
}
public List<Questions> viewQuestions(){
	List<Questions> list= qrepo.findAll();
	return list;
}
public void Delete(int id) {
	 qrepo.deleteById(id);
}
}
