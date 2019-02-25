package com.ims.demo.dao;

import com.ims.demo.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectDao extends JpaRepository<Subject,Long> {
	
	Subject findSubjectById(Long id);
	List<Subject> findAll();

	
}