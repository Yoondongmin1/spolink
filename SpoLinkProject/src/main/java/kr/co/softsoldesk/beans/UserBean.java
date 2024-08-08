package kr.co.softsoldesk.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserBean {
	
	private int user_idx;
	
	@Size(min = 2, max =5) //2글자 이상 5글자 이하
	@Pattern(regexp = "[가-힣]*") //한글만 입력 가능
	private String user_name;
	
	@Size(min = 5, max = 20) //5글자 이상 20글지 이하
	@Pattern(regexp = "[a-zA-Z0-9]", message = "사용자 아이디는 영문자 숫자 조합만 가능합니다.") //영어 대소문자, 숫자만 입력
	private String user_id;
	
	@Email
	private String user_email;
	
	@Size(min = 8, max = 15) //8글자 이상 20글자 이하
	@Pattern(regexp="([a-zA-Z0-9]*[!,@,#,$,%,^,&,*,?,_,~])|([!,@,#,$,%,^,&,*,?,_,~]*[a-zA-Z0-9]){8,12}" 
	,message="숫자 영문자 특수 문자를 포함한 8 ~ 15 자를 입력하세요. ")
	private String user_pass1;
	
	@Size(min = 8, max = 15) //8글자 이상 20글자 이하
	@Pattern(regexp="([a-zA-Z0-9]*[!,@,#,$,%,^,&,*,?,_,~])|([!,@,#,$,%,^,&,*,?,_,~]*[a-zA-Z0-9]){8,12}"
	,message="숫자 영문자 특수 문자를 포함한 8 ~ 15 자를 입력하세요. ")
	private String user_pass2;
	
	@Pattern(regexp = "([0-9]*[-])")
	private String user_Phone;
	
	private boolean userIdExist; //아이디 중복확인 여부
	private boolean userLogin; //로그인 상태
	
	 public UserBean() {
		 this.userIdExist = false;	//userIdExist의 조건 값은 false
		 this.userLogin = false;	//userLogin의 초기값은 false
	 }
	
	
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_pass1() {
		return user_pass1;
	}
	public void setUser_pass1(String user_pass1) {
		this.user_pass1 = user_pass1;
	}
	public String getUser_pass2() {
		return user_pass2;
	}
	public void setUser_pass2(String user_pass2) {
		this.user_pass2 = user_pass2;
	}
	public String getUser_Phone() {
		return user_Phone;
	}
	public void setUser_Phone(String user_Phone) {
		this.user_Phone = user_Phone;
	}
	public boolean isUserIdExist() {
		return userIdExist;
	}
	public void setUserIdExist(boolean userIdExist) {
		this.userIdExist = userIdExist;
	}
	public boolean isUserLogin() {
		return userLogin;
	}
	public void setUserLogin(boolean userLogin) {
		this.userLogin = userLogin;
	}
	

}
