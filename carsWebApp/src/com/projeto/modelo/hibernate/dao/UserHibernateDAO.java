package com.projeto.modelo.hibernate.dao;


import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import com.projeto.modelo.User;
import com.projeto.modelo.dao.DAOException;

public class UserHibernateDAO {
	
	public void create(User user) throws DAOException {
		 if(user != null){
	         Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	         session.beginTransaction();
	         session.saveOrUpdate(user);        
	         session.getTransaction().commit();
	     }
	}
	
	public User findByEmail(User user) throws DAOException {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		User userRegistered = (User) session.createCriteria(User.class)
	    .add( Restrictions.like("email", user.getEmail()))	 
	    .add( Restrictions.like("password", user.getPassword()))	
	    .uniqueResult();
	    
	    return userRegistered;
	}
	
}
