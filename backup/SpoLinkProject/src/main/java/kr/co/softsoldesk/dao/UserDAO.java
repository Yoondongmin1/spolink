package kr.co.softsoldesk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.softsoldesk.beans.UserBean;
import kr.co.softsoldesk.mapper.UserMapper;

@Repository
public class UserDAO {
	
	@Autowired
	private UserMapper userMapper;

	//회원가입
	public void addUser(UserBean joinUserBean) {	
		
		System.out.println(joinUserBean);
		
		userMapper.addUser(joinUserBean);
	}
}
