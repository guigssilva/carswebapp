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

		<p> <font size="4" face="Tahoma" color="white">
		Ol� ${email}</font></p>
		
		<p> <font size="4" face="Tahoma" color="white">
		Escolha abaixo a forma de pagamento:</font></p>
		
		<br>
		<br>
		
		<form action="sucessopagamento.jsp" method="post">
		<input type="radio" name="pagamento" value="transferenciaonline" /> <font size="2" face="Tahoma" color="white"> Transfer�ncia Online </font>
		<p><input type="radio" name="pagamento" value="cartaodecredito" /> <font size="2" face="Tahoma" color="white"> Cart�o de Cr�dito </font></p>
		<p><input type="radio" name="pagamento" value="boletobancario" /> <font size="2" face="Tahoma" color="white"> Boleto Banc�rio </font></p>
		
		<div class="form_row">
        	<input align="left" type="submit" value="Confirmar Pagamento">
        </div>
		
		</form>


<%@ include file="rodape.jsp" %>
</body>
</html>