	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="cabecalho.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> GRT Veiculos </title>
<link rel="stylesheet" type="text/css" href="styleContato.css" />
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>

	<% 
	ServletContext context= this.getServletContext();
	Integer logError = (Integer) context.getAttribute("LOGERROR");
	Integer passError = (Integer) context.getAttribute("PASSERROR");
	
	if(logError == 1){
			out.println("<p> <font size='4' face='Tahoma' color='white'> Campo vazio ou usuário já existente!<br /> </font></p>");
	}		
	if(passError == 1){
			out.println("<p> <font size='4' face='Tahoma' color='white'> Campos de senha vazios ou não conferem!<br /></font></p>");
	}
	%>


<%@ include file="rodape.jsp" %>
</body>
</html>