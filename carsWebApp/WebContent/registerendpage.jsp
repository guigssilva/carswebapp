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

		<p> <font size="4" face="Tahoma" color="white">
		Olá ${USER}</font></p>
	
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 
              	<div class="contact_form">	
              	
              	 <div class="form_row">
                    <h2 align="left">Preencha o restante do formulário</h2>
                    </div> 
                     
                    <s:form action="insertUser">
                    
                    <div class="form_row">
                     <s:label> <s:textfield  type="text" name="user.name" label="Nome" /></s:label>                    
                    </div>  
                    
                    <div class="form_row">
                    <s:label> <s:textfield  type="text" name="user.address1" label="Endereço Residencia" /></s:label>   
                    </div>  
                    
                    <div class="form_row">
                     <s:label> <s:textfield  type="text" name="user.address2" label="Endereço Comercial" /></s:label>                 
                    </div>  
                    
                    <div class="form_row">
                    <s:label> <s:textfield  type="text" name="user.city" label="Cidade" /></s:label>  
                    </div>
                    
                    <div class="form_row">
                    <s:label> <s:textfield  type="text" name="user.zip" label="CEP" /></s:label> 
                    </div>
                    
                    <!--
                    <div class="form_row">
                    <p>Forma de Pagamento</p>
                    <input type="radio" name="pagamento" value="dinheiro" /> Dinheiro <br />
					<input type="radio" name="pagamento" value="cartaodecredito" /> Cartão de Crédito
                    </div> -->
                    
                    <div class="form_row">
                    <s:submit align="left" value="Finalizar"></s:submit>    
                    </div>
			  	
			  		</s:form>
                    
                  </div> 
                
                                     
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>		

<%@ include file="rodape.jsp" %>
</body>
</html>