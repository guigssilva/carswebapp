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
                    <label class="contact"><strong>Nome:</strong></label>
                    <input type="text" class="contact_input" id="nome" />
                    </div>  

                    <div class="form_row">
                    <label class="contact"><strong>Email:</strong></label>
                    <input type="text" class="contact_input" onblur="validarEmail(this)" id="email"/>
                    </div>


                    <div class="form_row">
                    <label class="contact"><strong>Telefone:</strong></label>
                    <input type="text" class="contact_input"  id="telefone"/>
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>Empresa:</strong></label>
                    <input type="text" class="contact_input" id="empresa"/>
                    </div>


                    <div class="form_row">
                    <label class="contact"><strong>Messagem:</strong></label>
                    <textarea class="contact_textarea" id="mensagem" ></textarea>
                    </div>

                    
                    <div class="form_row">
                    <a href="#" class="contact" onclick="enviandoDados();">Enviar</a>
                    </div>      
                    
                </div> 
                
                                     
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
		
		

</body>
<%@ include file="rodape.jsp" %>
</html>


<script type="text/javascript">

function enviandoDados(){
	alert("Seu e-mail foi enviado com sucesso. Aguarde contato.");
}

	var valido;
	function validarEmail(campo){
		var str = new String(campo.value);
		var filter = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
		if(filter.test(str))
		  valido = true;
		else{
		  alert("Este endereço de e-mail não é válido!");
		  document.forms[0].email.select();
		  document.forms[0].email.focus();
		  valido = false;
		}
		return valido;
	  }
</script>