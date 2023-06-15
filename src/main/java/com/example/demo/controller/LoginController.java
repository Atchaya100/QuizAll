package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;

@RestController
//@CrossOrigin(origins = "")
public class LoginController {
	@Autowired
	LoginService service;
	 @GetMapping("/")
		public String Hi() {
			return "hello";
		}
    @PostMapping("/create")
	public Login create(@RequestBody Login login) {
		return service.createAccount(login);
	}
    @PostMapping("/login/{mail}/{password}")
   	public Login login(@PathVariable String mail,@PathVariable String password) {
   		return service.checkLogin(mail, password);
   	}
    @DeleteMapping("/delete/{mail}")
    public void delete(@PathVariable String mail) {
    	 service.delete(mail);
    }
    @PutMapping("/update")
    public Login update(@RequestBody Login login) {
		return service.update(login);
    	
    }
    
}
