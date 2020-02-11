package com.example.demo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class DemoService {

	@Cacheable("student")
	public Student getStudent(int id) {
		try {
			System.out.println("Sleep 5 secs");
			Thread.sleep(1000 * 5);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		return new Student(id, "test");
	}
}
