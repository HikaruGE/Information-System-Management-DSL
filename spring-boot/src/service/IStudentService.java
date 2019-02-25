package com.ims.demo.service;
import com.ims.demo.entity.Student;

import java.util.List;

public interface IStudentService {
	
	List<Student> getAll();
	void save(Student obj);
	void delete(Long id);
	Student getById(Long id);
	
	
}
