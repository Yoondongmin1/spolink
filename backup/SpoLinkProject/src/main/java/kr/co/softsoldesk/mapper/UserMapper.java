package kr.co.softsoldesk.mapper;

import org.apache.ibatis.annotations.Insert;

import kr.co.softsoldesk.beans.UserBean;

public interface UserMapper {
	
	//회원가입
	@Insert("insert into users values(user_seq.nextval,#{user_name}, #{user_id},#{user_email},#{user_pass1},#{user_Phone})\")")
	void addUser(UserBean joinUserBean);
}
