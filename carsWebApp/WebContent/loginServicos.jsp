<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="cabecalho.jsp" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> GRT Veiculos </title>
<link rel="stylesheet" type="text/css" href="styleContato.css" />
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>

		<div class="center_content">
		<div class="center_title_bar"></div>
    
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                <!--  <form action="login" method="post"> -->
              	<s:form action="login">
              	
              	<div class="contact_form">
                    <div class="form_row">
                    <h2 align="left">Já possuo cadastro</h2>
                    </div> 
                    
                    <div class="form_row">
                    <s:label> <s:textfield name="user.email" label="E-mail" class="contact2"/></s:label>
                    </div>  

                    <div class="form_row">
                    <s:label> <s:password name="user.password" label="Senha" class="contact2"/></s:label>
                    </div>
                    
                    <div class="form_row" >
               		<s:submit align="left" value="Login"></s:submit>               	 	
               	 	</div>
                    
                </div> 
                
               	</s:form>
               	 	<div class="form_row" align="center">
               	 	<p align="left"><a href="register.jsp">Desejo me cadastrar</a></p>
               	 	</div>             
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>        
        </div>
</body>
<%@ include file="rodape.jsp" %>
</html>