package spoLink.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class JoinBean {
	
	@Size(min = 2, max =5) //2글자 이상 5글자 이하
	@Pattern(regexp = "[가-힣]*") //한글만 입력 가능
	private String user_name;
	
	@Size(min = 5, max = 20) //5글자 이상 20글지 이하
	@Pattern(regexp = "[a-zA-Z0-9") //영어 대소문자, 숫자만 입력
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
	
	private boolean userIdExist; //아이디 중복 확인여부
	
	private boolean userLogin; //로그인상태
	
	
	
	
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
