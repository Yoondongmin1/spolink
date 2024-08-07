package spoLink.mapper;

import org.apache.ibatis.annotations.Insert;

import spoLink.beans.JoinBean;

public interface JoinMapper {
	
	@Insert("insert into join values(user_seq.nextval,#{user_name, #{user_id}, #{user_email}, {user_pass1})")
	void joinUser(JoinBean joinuserBean);
	
}
 