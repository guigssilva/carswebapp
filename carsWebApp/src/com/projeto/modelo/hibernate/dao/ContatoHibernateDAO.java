/**
 * 
 */
package com.projeto.modelo.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.projeto.modelo.Contato;
import com.projeto.modelo.User;
import com.projeto.modelo.dao.DAOException;

/**
 * @author Guilherme
 *
 */
public class ContatoHibernateDAO {
	
	private Session session;
	
	
	public ContatoHibernateDAO() {
		session = HibernateUtil.getSession();
	}
	
	public Transaction beginTransaction(){
		return session.beginTransaction();
	}

	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * @param session the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
	}
	
	
	public void create(Contato contato) throws DAOException {
		 if(contato != null){
	         session.beginTransaction();
	         session.saveOrUpdate(contato);        
	         session.getTransaction().commit();
	     }
	}

}
