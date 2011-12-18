package com.projeto.modelo.hibernate.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import com.projeto.modelo.User;
import com.projeto.modelo.dao.DAOException;

public class UserHibernateDAO {
	
	private Session session;
	
	
	public UserHibernateDAO() {
		session = HibernateUtil.getSession();
	}
	
	public Transaction beginTransaction(){
		return session.beginTransaction();
	}
	
	public void create(User user) throws DAOException {
		 if(user != null){
	         session.beginTransaction();
	         session.saveOrUpdate(user);        
	         session.getTransaction().commit();
	     }
	}
	
	public User findByEmail(User user) throws DAOException {
		
		User userRegistered = (User) session.createCriteria(User.class)
	    .add( Restrictions.like("email", user.getEmail()))	 
	    //.add( Restrictions.like("password", user.getPassword()))	
	    .uniqueResult();
	    
	    return userRegistered;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	
	
}
