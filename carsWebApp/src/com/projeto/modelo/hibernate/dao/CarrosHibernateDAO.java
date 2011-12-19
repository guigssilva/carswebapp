/**
 * 
 */
package com.projeto.modelo.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.projeto.modelo.Carros;
import com.projeto.modelo.User;
import com.projeto.modelo.dao.DAOException;

/**
 * @author Guilherme
 * 
 */
public class CarrosHibernateDAO {

	private Session session;

	public CarrosHibernateDAO() {
		session = HibernateUtil.getSession();
	}

	public Transaction beginTransaction() {
		return session.beginTransaction();
	}

	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * @param session
	 *            the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
	}
	
	public void create(Carros carros) throws DAOException {
		 if(carros != null){
	         session.beginTransaction();
	         session.saveOrUpdate(carros);        
	         session.getTransaction().commit();
	     }
	}
	
	@SuppressWarnings("unchecked")
	public List<Carros> findByCarros() throws DAOException {
		String zero ="0";
		List<Carros> userRegistered =  (List<Carros>) session.createCriteria(Carros.class)
	    .add( Restrictions.ne("desconto",Double.parseDouble(zero)))
	    .add(Restrictions.ne("estoque",0L)).list();
	    
	    return userRegistered;
	}

}
