/**
 * 
 */
package com.projeto.modelo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.projeto.modelo.Contato;
import com.projeto.modelo.dao.DAOException;
import com.projeto.modelo.hibernate.dao.ContatoHibernateDAO;

/**
 * @author Guilherme
 *
 */
public class ContatoAction extends ActionSupport {
	
	private Contato contato;
	private ContatoHibernateDAO contatoHibernateDAO = new ContatoHibernateDAO();
	/**
	 * @return the contato
	 */
	public Contato getContato() {
		return contato;
	}
	/**
	 * @param contato the contato to set
	 */
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	/**
	 * @return the contatoHibernateDAO
	 */
	public ContatoHibernateDAO getContatoHibernateDAO() {
		return contatoHibernateDAO;
	}
	/**
	 * @param contatoHibernateDAO the contatoHibernateDAO to set
	 */
	public void setContatoHibernateDAO(ContatoHibernateDAO contatoHibernateDAO) {
		this.contatoHibernateDAO = contatoHibernateDAO;
	}
	
	
	public String save() throws DAOException {
		if (getContato() != null) {
			contatoHibernateDAO.create(contato);
			return "SUCCESS";
		}
		return "FAIL";
	}

}
