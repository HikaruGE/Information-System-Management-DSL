package com.ims.demo.dao;

import com.ims.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends JpaRepository<Student,Long> {
	
	Student findStudentById(Long id);
	List<Student> findAll();

	
}