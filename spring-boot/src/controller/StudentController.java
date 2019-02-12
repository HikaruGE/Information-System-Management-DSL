package controller;

import service.*;
import entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
	
	@Autowired
	IStudentService studentService;
	
	@GetMapping("/studentLst")
	public String toAllPage(Model model){
		
		model.addAttribute("students",studentService.getAll());
		
		return "/student/all";
	}
	
	@GetMapping("/student/{id}")
	public String toEditPage(Model model,@PathVariable("id") Long id){
		
		model.addAttribute("student",studentService.getById(id));
		
		return "/student/edit";
	}
	
	@GetMapping("/student")
	public String toAddPage(Model model){
		
		return "/student/add";
	}
	
	@PostMapping("/student")
	public String operationAdd(Model model,Student stu){
		  
		  
		  studentService.save(stu);
		  
		  
		  return "redirect:/studentLst";
	}
	
	@PutMapping("/student")
	public String operationUpdate(Model model,Student stu){
		  
		  
		  studentService.save(stu);
		  
		  
		  return "redirect:/studentLst";
	}
	
	@DeleteMapping("/student/{id}")
	public String operationDelete(Model model,@PathVariable("id") Long id,Student stu){
		  
		  
		  studentService.delete(id);
		  
		  
		  return "redirect:/studentLst";
	}
	
	
}