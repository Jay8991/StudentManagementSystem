package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
//	@Override 
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
////		Student student1 = new Student("Jay", "Patel", "jaypatel8991@gmail.com");
////		studentRepository.save(student1);
////		
////		Student student2 = new Student("Kishal", "Patel", "kishal@gmail.com");
////		studentRepository.save(student2);
////		
////		Student student3 = new Student("Appu", "Patel", "appupatel@gmail.com");
////		studentRepository.save(student3);
//		
//	}

}
