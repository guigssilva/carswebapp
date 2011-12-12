package com.projeto.modelo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projeto.modelo.User;
import com.projeto.modelo.dao.DAOException;
import com.projeto.modelo.dao.DBPool;
import com.projeto.modelo.dao.UserDAO;

public class InsertUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String dispatcherTo;
       
    public InsertUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sNome = (String) request.getParameter("nome");
		String endereco1 = (String) request.getParameter("endereco1");
		String endereco2 = (String) request.getParameter("endereco2");
		String cidade = (String) request.getParameter("cidade");
		String estado = (String) request.getParameter("estado");
		String cep = (String) request.getParameter("cep");
		
		ServletContext context= this.getServletContext();
		String email= (String) context.getAttribute("USER");
		String password= (String) context.getAttribute("PASS");
		DBPool db= (DBPool) context.getAttribute("dbpool");
		
		int id= 12;
		
		User a= new User(id, sNome, endereco1, endereco2, cidade, estado, cep, password, email);
		UserDAO u= new UserDAO(db);
		
		try {
			u.create(a);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd= request.getRequestDispatcher("finalregistro.jsp");
		rd.forward(request, response);
	}

}
