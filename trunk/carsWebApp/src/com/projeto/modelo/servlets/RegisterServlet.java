package com.projeto.modelo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projeto.modelo.servlets.LoginService;

import com.projeto.modelo.dao.DAOException;
import com.projeto.modelo.dao.DBPool;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterServlet() {
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
    	
    	context.setAttribute("LOGERROR", new Integer(0));
    	context.setAttribute("PASSERROR", new Integer(0));
    	context.setAttribute("USER", new String(""));
    	context.setAttribute("dbpool", dbpool);	
    	context.setAttribute("PASS", new String(""));
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	String dispatchTo;
	int aux;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sNome = (String) request.getParameter("email");
		String sSenha = (String) request.getParameter("password");
		String sSenha2 = (String) request.getParameter("password2");
		
		ServletContext context= this.getServletContext();
		DBPool dbpool= (DBPool) context.getAttribute("dbpool");
		
		int auxlog = 0;
		int auxpass= 0;
		try {
			
			if(!LoginService.registerLogin(sNome, sSenha, dbpool))
				auxlog= 1;
					
			if(!LoginService.registerPass(sSenha, sSenha2))
				auxpass= 1;
						
			if(auxlog==0 & auxpass==0){
				dispatchTo="registerendpage.jsp";
				context.setAttribute("USER",sNome);
				context.setAttribute("PASS",sSenha );
			}
			else
				dispatchTo= "registerfail.jsp";
			context.setAttribute("LOGERROR", auxlog);
			context.setAttribute("PASSERROR", auxpass);
						
		}catch (DAOException e) {
			e.printStackTrace();
		}		
		RequestDispatcher rd= request.getRequestDispatcher(dispatchTo);
		rd.forward(request, response);
	}

}
