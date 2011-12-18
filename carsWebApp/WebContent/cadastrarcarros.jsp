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


    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 
              	<div class="contact_form">	
              	
              	 <div class="form_row">
                    <h2 align="left">Preencha o restante do cadastro do carro</h2>
                    </div> 
                     
                    <s:form action="insertCarros">
                    
                    <div class="form_row">
                     <s:label> <s:textfield  type="text" name="carros.nome" label="Nome" cssClass="contact_input" required="true"/></s:label>                    
                    </div>  
                    
                    <div class="form_row" >
                     <s:label> <s:textarea  type="text" name="carros.descricao" label="Descrição" cssClass="contact_input" required="true"/></s:label>                    
                    </div>  
                    
                    <div class="form_row">
                     <s:label> <s:textfield  type="text" name="carros.estoque" label="Estoque" cssClass="contact_input" required="true"/></s:label>                    
                    </div>  
                    
                    <div class="form_row">
                    <s:label> <s:textfield  type="text" name="carros.garantia" label="Garantia" cssClass="contact_input" required="true"/></s:label>   
                    </div>  
                    
                    <div class="form_row">
                     <s:label> <s:textfield  type="text" name="carros.valor" label="Valor"cssClass="contact_input" required="true"/></s:label>                 
                    </div>  
                    
                    <div class="form_row">
                     <s:label> <s:textfield  type="text" name="carros.desconto" label="Valor com Desconto"cssClass="contact_input" /></s:label>                 
                    </div>  
                    
                    <div class="form_row">
                    <s:label> <s:textfield  type="text" name="carros.imagem" label="Caminho Imagem" cssClass="contact_input" required="true"/></s:label>  
                    </div>
                    
                    
                    <div class="form_row">
                    <s:submit align="left" value="Cadastrar"></s:submit>    
                    </div>
			  	
			  		</s:form>
                    
                  </div> 
                
                                     
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>		

<%@ include file="rodape.jsp" %>
</body>
</html>