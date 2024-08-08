package kr.co.softsoldesk.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.softsoldesk.beans.UserBean;
import kr.co.softsoldesk.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//회원가입
	//#3 서버 응답(jsp 반환)
	@GetMapping("/join")
	private String join(@ModelAttribute("joinUserBean") UserBean joinUserBean) {
	//#4 modelAttribute로 UserBean 객체를 jsp로 이동
		
		
		joinUserBean.setUser_id("dddd");
		joinUserBean.setUser_name("rrr");
		
		return "user/join";
	}
	@PostMapping("/join_pro")
	private String join_pro(@ModelAttribute("joinUserBean")UserBean joinUserBean) {
		
		System.out.println(joinUserBean.getUser_name());
		System.out.println(joinUserBean.getUser_id());
		System.out.println(joinUserBean.getUser_pass1());
		System.out.println(joinUserBean.getUser_Phone());
		
		return "";
	}
	
	
	
	// @Valid: modifyUserBean 객체에 대해 유효성 검사를 수행
	// BindingResult: 유효성 검사 결과를 담음
//	@PostMapping("/join_pro")
//	private String join_pro(@Valid @ModelAttribute("modifyUserBean") UserBean modifyUserBean, BindingResult result) {
//		
//		if(result.hasErrors()) {
//			return "user/modify";
//		}// 유효성 검사에 실패한 경우 "user/modify" 뷰를 반환
//		
//		
//		//userService.modifyUserInfo(modifyUserBean);
		// 유효성 검사에 성공한 경우 userService를 통해 사용자 정보를 수정
		// 수정 후 "user/logout" 뷰를 반환
//	}
}
