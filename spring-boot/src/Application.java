package com.ims.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.ims.demo.entity.*;
import com.ims.demo.service.*;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	
	@Autowired
	ISubjectService subjectService;
	
	@Autowired
	IStudentService studentService;
	
	
	public static void main(String[] args){
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void run(String... args){
		
		
		Subject sub1 = new Subject();
		sub1.setName("Math");
		
		subjectService.save(sub1);
		
		Subject sub2 = new Subject();
		sub2.setName("English");
		
		subjectService.save(sub2);
		
		Student stu1 = new Student();
		stu1.setName("s1");
		stu1.setPhone("111");
		stu1.getSubjects().clear();
		stu1.getSubjects().add(sub1);
		stu1.getSubjects().add(sub2);
		
		
		studentService.save(stu1);
		
		
	}

}
