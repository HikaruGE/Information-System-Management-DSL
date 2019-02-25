package com.ims.demo.service;
import com.ims.demo.dao.StudentDao;
import com.ims.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public List<Student> getAll(){
		return studentDao.findAll();
	}
	
	@Override
	public void save(Student obj){
		studentDao.save(obj);
	}
	
	@Override
	public void delete(Long id){
		studentDao.deleteById(id);
	}
	
	@Override
	public Student getById(Long id){
		return studentDao.findStudentById(id);
	}
	
	
}
