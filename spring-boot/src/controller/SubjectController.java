package controller;

import com.ims.demo.service.*;
import com.ims.demo.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SubjectController {
	
	
	@Autowired
	IStudentService studentService;
	
	@Autowired
	ISubjectService subjectService;
	
	
	
	@GetMapping("/subjectLst")
	public String toAllPage(Model model){
		
		model.addAttribute("subjectLst",subjectService.getAll());
		
		return "/subject/all";
	}
	
	@GetMapping("/subject/{id}")
	public String toEditPage(Model model,@PathVariable("id") Long id){
		
		model.addAttribute("subject",subjectService.getById(id));
		
		model.addAttribute("enrollStuLst",studentService.getAll());
		
		return "/subject/edit";
	}
	
	@GetMapping("/subject")
	public String toAddPage(Model model){
		
		model.addAttribute("enrollStuLst",studentService.getAll());
		
		return "/subject/add";
	}
	
	@PostMapping("/subject")
	public String operationAdd(Model model,Subject subject){
		  
		  
		  subjectService.save(subject);
		  
		  
		  return "redirect:/subjectLst";
	}
	
	@PutMapping("/subject")
	public String operationUpdate(Model model,Subject subject){
		  
		  
		  subjectService.save(subject);
		  
		  
		  return "redirect:/subjectLst";
	}
	
	@DeleteMapping("/subject/{id}")
	public String operationDelete(Model model,@PathVariable("id") Long id,Subject subject){
		  
		  
		  subjectService.delete(id);
		  
		  
		  return "redirect:/subjectLst";
	}
	
}