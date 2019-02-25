package com.ims.demo.service;
import com.ims.demo.dao.SubjectDao;
import com.ims.demo.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements ISubjectService {

	@Autowired
	SubjectDao subjectDao;
	
	@Override
	public List<Subject> getAll(){
		return subjectDao.findAll();
	}
	
	@Override
	public void save(Subject obj){
		subjectDao.save(obj);
	}
	
	@Override
	public void delete(Long id){
		subjectDao.deleteById(id);
	}
	
	@Override
	public Subject getById(Long id){
		return subjectDao.findSubjectById(id);
	}
	
	
}
