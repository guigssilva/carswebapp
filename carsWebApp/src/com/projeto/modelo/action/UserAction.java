package com.projeto.modelo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.projeto.modelo.User;

public class UserAction extends ActionSupport {

	private User user;
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

}
