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

<div class="center_content">
		<div class="center_title_bar">Contato</div>
    
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 
              	<div class="contact_form">	
              	
              	 <div class="form_row">
                    <h2>Realize o seu registro no site</h2>
                    </div> 
                     
                    <form action="register" method="post">
                     <div class="form_row">
                    <p>Informe seu Email <input type="text" name="email"></p>
                    </div>  
                    
                     <div class="form_row">
                    <p>Informe sua senha <input type="password" name="password" ></p>
                    </div>  
                    
                     <div class="form_row">
                    <p>Informe novamente Senha <input type="password" name="password2"></p>
                    </div>  
                    
                    <div class="form_row">
                   <input type="submit" value="Confirmar">
                    </div>     
			  	
			  		</form>
                    
                  </div> 
                
                                     
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>

				
			  	
			  	

</body>
<%@ include file="rodape.jsp" %>
</html>