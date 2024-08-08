package kr.co.softsoldesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import spoLink.beans.JoinBean;
import spoLink.service.JoinService;

@Controller
public class JoinController {
	
	@Autowired
	private JoinService joinService;
	
	
	@GetMapping("/join")
	private String join(@ModelAttribute("joinBean") JoinBean joinBean) {
		
		
		System.out.println("ㅇㅇㅇㅇㅇ");
		
		return "join/joinMain";
		
	}
	
	@PostMapping("/user/join")
	private String Join(@ModelAttribute("joinBean") JoinBean joinBean) {
		
		joinService.joinUser(joinBean);
		
		System.out.println("안녕");
		return "";
	}
}
