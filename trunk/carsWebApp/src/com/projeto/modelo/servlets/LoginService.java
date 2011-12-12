package com.projeto.modelo.servlets;

import com.projeto.modelo.User;
import com.projeto.modelo.dao.DAOException;
import com.projeto.modelo.dao.DBPool;
import com.projeto.modelo.dao.UserDAO;

public class LoginService {
	
	public static boolean doLogin(String name, String pass, DBPool db) throws DAOException{
		User temp2;
		User temp= new User(name, pass);
		UserDAO userdao= new UserDAO(db);
		temp2=userdao.findByEmail(temp);
		if(temp2!=null)			
			if(temp.getPassword().equals(temp2.getPassword()))
				return true;		
		return false;
	}
	
	public static boolean registerLogin(String name, String pass1, DBPool db) throws DAOException{
		
		User temp2;
		User temp= new User(name, pass1);
		UserDAO userdao= new UserDAO(db);
		temp2=userdao.findByEmail(temp);
		if(temp2 == null && name.length() != 0)
			return true;	
		return false;
		}
	
	public static boolean registerPass(String pass, String pass2){		
		if(pass.equals(pass2) && pass.length()!= 0)
			return true;
		return false;
	}

}
