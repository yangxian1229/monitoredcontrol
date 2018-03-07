package org.easybooks.bookstore.dao.impl;

import java.util.List;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IUserDAO;
import org.easybooks.bookstore.vo.User;
import org.hibernate.*;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends BaseDAO implements IUserDAO{

	public User validateUser(String username, String password) {
		System.out.println("UsrDAO:username"+username+" and password"+password);
		String sql = "from User u where u.userName=? and u.userPassword=?";
		Session session = getSession();
		Query query = session.createQuery(sql);
		query.setParameter(0,username);
		query.setParameter(1,password);
		System.out.println("UserDAO:query"+query);
		List users = query.list();
		if(users.size() != 0){
			User user = (User)users.get(0);
			return user;
		}
		session.close();
		return null;
	}

	

}
