package com.ims.demo.service;
import com.ims.demo.entity.Subject;

import java.util.List;

public interface ISubjectService {
	
	List<Subject> getAll();
	void save(Subject obj);
	void delete(Long id);
	Subject getById(Long id);
	
	
}
