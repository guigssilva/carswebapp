package com.projeto.modelo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.projeto.modelo.User;
import com.projeto.modelo.dao.DAOException;
import com.projeto.modelo.hibernate.dao.UserHibernateDAO;

public class UserAction extends ActionSupport {

	private User user;
	private UserHibernateDAO userDao = new UserHibernateDAO();
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
			if (getUser() != null) {
				userAux = userDao.findByEmail(getUser());
				if(userAux == null){
					return "CADASTRO";
				}
				if ((user.getEmail().equals(userAux.getEmail()) && user.getPassword().equals(
						user.getPassword()))) {
					setMessage("Olá " + user.getEmail() + ".");
					return "SUCCESS";
					
				}else{
				setMessage("Erro ao logar com o usuário: "
						+ user.getEmail());
				return "FAIL";
				}
				
			}
			

		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		if (!getUser().getPassword().equals(getUser().getPassword2())) {
			setMessage("As senhas informadas não conferem, verifique!");
			return "FAIL";
		}
		if (getUser() != null) {
			return "SUCCESS";
		} else
			return "FAIL";

	}

}
