package spoLink.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spoLink.beans.JoinBean;
import spoLink.mapper.JoinMapper;

//@Repository
public class JoinDAO {
	
	@Autowired
	private JoinMapper joinMapper;
	
	public void joinUser(JoinBean joinBean) {
		
		joinMapper.joinUser(joinBean);
		
	}

}
