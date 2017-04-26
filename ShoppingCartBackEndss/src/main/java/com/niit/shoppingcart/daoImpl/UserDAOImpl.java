package com.niit.shoppingcart.daoImpl;
/*
import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public boolean save(User user) {
		try{
			Session session =  sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			user.setRole("ROLE_USER");

			session.save(user);// this will save the user inside H2 db
			tx.commit();
			session.flush();
			session.close();
		}
		catch (Exception e) {
			// if any excpetion comes during execute of try block, catch will
			// excute
			e.printStackTrace();
			return false;
		}
		return true;
	}

	
	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
		} catch (Exception e) {
			// if any excpetion comes during execute of try block, catch will
			// excute
			e.printStackTrace();
			return false;
		}
		return false;
	}

	public boolean validate(String id, String password) {
		Query query = sessionFactory.openSession().createQuery(" from User where name = ? and password = ?");
		query.setString(0,id); // actually the index will start from zero -
									// will get once exception.
		query.setString(1, password);
		// in the User table with this id and password there will one or zero
		// records will exist
		// i.e., uniqueResult
		// uniqueResult method will return object if a row exist, else it will
		// return null
		if (query.uniqueResult() == null) {
			// means no row exist i.e., invalid credentials
			return false;
		} else {
			// means row exist i.e., valid credentials
			return true;
		}
	}

	public List<User> list() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();

	}

	public User get(String id) {
		
		// get method get the date from user table based on primary key i.e., id
				// and set it to User class
				// like select * from user where id = ?
				Session session = sessionFactory.openSession();
				Transaction tx = session.beginTransaction();

				Query query = session.createQuery("from User where name=?");
				query.setString(0, id);
				User user = (User) query.uniqueResult();

				tx.commit();
				session.flush();
				session.close();

		return null;
	}

}
*/