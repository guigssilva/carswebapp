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
		<div class="center_title_bar">Contato</div>
    
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 
              <s:form action="insertContato">
              	<div class="contact_form">
                           
                    <div class="form_row">
                    <s:label> <s:textfield  type="text" name="contato.nome" label="Nome:" cssClass="contact_input" /></s:label>
                    </div>  

                    <div class="form_row">
                    <s:label> <s:textfield  type="text" name="contato.email" label="Email:" onblur="validarEmail(this)" cssClass="contact_input" /></s:label>
                    </div>


                    <div class="form_row">
                     <s:label> <s:textfield  type="text" name="contato.telefone" label="Telefone:" cssClass="contact_input" /></s:label>
                    </div>
                    
                    <div class="form_row">
                    <s:label> <s:textfield  type="text" name="contato.empresa" label="Empresa:" cssClass="contact_input" /></s:label>
                    </div>


                    <div class="form_row">
                    <s:label> <s:textarea  type="text" name="contato.mensagem" label="Mensagem:" cssClass="contact_input" /></s:label>
                    </div>

                    
                    <div class="form_row">
                    <s:submit cssClass="contact" onclick="enviandoDados();" align="left" value="Enviar"></s:submit>
                    </div>      
                    
                </div> 
              </s:form>
                
                                     
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
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