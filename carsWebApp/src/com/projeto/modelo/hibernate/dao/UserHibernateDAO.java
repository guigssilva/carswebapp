package com.projeto.modelo.hibernate.dao;

import org.hibernate.classic.Session;

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
	
}
