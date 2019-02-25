package controller;

import com.ims.demo.service.*;
import com.ims.demo.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	
	
	
	
	@GetMapping("/index")
	public String toMainPage(Model model){
		
		return "/main/main";
	}
	
}