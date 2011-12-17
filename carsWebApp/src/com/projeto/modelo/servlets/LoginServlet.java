package com.projeto.modelo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.projeto.modelo.dao.DAOException;
import com.projeto.modelo.servlets.LoginService;

import com.projeto.modelo.dao.DBPool;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String dispatcherTo;
       
    public LoginServlet() {
        super();
    }
    
    public void init(ServletConfig config) throws ServletException{		
		super.init(config);
		ServletContext context= config.getServletContext();		
		String url= context.getInitParameter("dbUrl");
		String classname= context.getInitParameter("driverClass");   
		String user= context.getInitParameter("user");
		String pass= context.getInitParameter("password");		
    	DBPool dbpool= new DBPool(classname, url, user, pass);
    	
    	context.setAttribute("LOGINCOUNTER", new Integer(0));
    	context.setAttribute("db", dbpool);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sNome = (String) request.getParameter("email");
		String sSenha = (String) request.getParameter("password");
		
		ServletContext context= this.getServletContext();
		DBPool dbpool= (DBPool) context.getAttribute("db");
		Integer logCounter= (Integer) context.getAttribute("LOGINCOUNTER");

		try {
			if (LoginService.doLogin(sNome, sSenha, dbpool)){
				dispatcherTo= "pagamento.jsp";
				context.setAttribute("LOGINCOUNTER",logCounter+1);
				HttpSession session= request.getSession(true);	
				session.setAttribute("email", sNome);
								
			}else{
				dispatcherTo= "loginfail.jsp";				
			}
		
		} catch (DAOException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd= request.getRequestDispatcher(dispatcherTo);
		rd.forward(request, response);
	}

}
