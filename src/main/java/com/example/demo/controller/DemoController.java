package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	Environment env;

	@Autowired
	DemoService demoService;

	@GetMapping("/")
	public String index() {
		return env.getProperty("welcome.message");
	}

	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id) {
		return demoService.getStudent(id);
	}

}
