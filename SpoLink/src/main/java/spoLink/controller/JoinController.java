package spoLink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import spoLink.beans.JoinBean;
import spoLink.service.JoinService;

@Controller
public class JoinController {
	
	@Autowired
	private JoinService joinService;
	
	@PostMapping("/user/join")
	private String Join(@ModelAttribute("joinBean") JoinBean joinBean) {
		
		joinService.joinUser(joinBean);
		
		return "";
	}
}
