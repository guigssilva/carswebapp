package com.projeto.modelo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.projeto.modelo.User;
import com.projeto.modelo.dao.DAOException;
import com.projeto.modelo.hibernate.dao.UserHibernateDAO;

public class UserAction extends ActionSupport {

	private User user;
	private UserHibernateDAO userDao;
	private String message;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() {
		User userAux = new User();
		try {
			userAux = userDao.findByEmail(getUser());
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (getUser() != null) {
			if (!(user.getEmail().equals("a") && user.getPassword().equals(
					"123"))) {
				setMessage("Erro ao logar com o usuário: " + user.getEmail());
				return "FAIL";
			}
			setMessage("Olá " + user.getEmail() + ".");
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	public String save() throws DAOException {
		if (getUser() != null) {
			userDao.create(user);
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	public String registerSave() throws DAOException {
		if (getUser() != null) {
			return "SUCCESS";
		}
		return "FAIL";
		
		
	}
	
	

}
