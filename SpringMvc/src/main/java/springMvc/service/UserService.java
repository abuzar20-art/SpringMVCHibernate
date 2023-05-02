package springMvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMvc.dao.UserDao;
import springMvc.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public int createUser(User user) {
		return userDao.save(user);
	}
	
	
	
}
