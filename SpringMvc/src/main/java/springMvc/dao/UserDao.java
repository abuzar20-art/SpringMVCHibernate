package springMvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springMvc.model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate ;
	
	@Transactional
	public int save(User user) {
		int id =(Integer) hibernateTemplate.save(user);
		return id;
	}
}
