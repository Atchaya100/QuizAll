package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Questions;
import com.example.demo.service.QuesService;

@RestController
//@CrossOrigin(origins = "http://quizfrontend.s3-website.ap-south-1.amazonaws.com")
@CrossOrigin(origins = "http://localhost:64332")
public class QuesController {
	@Autowired
	QuesService service;
	@PostMapping("/create")
	public Questions create(@RequestBody Questions question) {
		return service.create(question);
	}
	@GetMapping("/getAll")
	public List<Questions> viewAll(){
		return service.viewQuestions();
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		service.Delete(id);
	}

}
