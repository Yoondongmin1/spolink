package kr.co.softsoldesk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {
	
	
	@GetMapping("/main")
	private String main(Model model) {
		
		
		return "main";
	}
	

}
