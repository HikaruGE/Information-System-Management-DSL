package controller;

import com.ims.demo.service.*;
import com.ims.demo.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
	
	
	@Autowired
	ISubjectService subjectService;
	
	@Autowired
	IStudentService studentService;
	
	
	
	@GetMapping("/studentLst")
	public String toAllPage(Model model){
		
		model.addAttribute("studentLst",studentService.getAll());
		
		return "/student/all";
	}
	
	@GetMapping("/student/{id}")
	public String toEditPage(Model model,@PathVariable("id") Long id){
		
		model.addAttribute("student",studentService.getById(id));
		
		model.addAttribute("subjectsLst",subjectService.getAll());
		
		return "/student/edit";
	}
	
	@GetMapping("/student")
	public String toAddPage(Model model){
		
		model.addAttribute("subjectsLst",subjectService.getAll());
		
		return "/student/add";
	}
	
	@PostMapping("/student")
	public String operationAdd(Model model,Student student){
		  
		  
		  studentService.save(student);
		  
		  
		  return "redirect:/studentLst";
	}
	
	@PutMapping("/student")
	public String operationUpdate(Model model,Student student){
		  
		  
		  studentService.save(student);
		  
		  
		  return "redirect:/studentLst";
	}
	
	@DeleteMapping("/student/{id}")
	public String operationDelete(Model model,@PathVariable("id") Long id,Student student){
		  
		  
		  studentService.delete(id);
		  
		  
		  return "redirect:/studentLst";
	}
	
}