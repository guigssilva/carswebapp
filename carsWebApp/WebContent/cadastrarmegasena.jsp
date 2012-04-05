<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="cabecalho.jsp" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> GRT Veiculos </title>
 <sj:head locale="pt" jqueryui="true" jquerytheme="dark-hive-my" customBasepath="/carsWebApp/template/themes"/>
<link rel="stylesheet" type="text/css" href="styleContato.css" />
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
		<font size="4" face="Tahoma" color="white">
			<h1>Inserir Jogo da MegaSena</h1>
		</font>
		<s:form action="gravarMegaSena" method="gravarMegaSena">
			<s:textfield type="text" name="megaSena.nrResultado1" label="1º Número" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="megaSena.nrResultado2" label="2º Número" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="megaSena.nrResultado3" label="3º Número" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="megaSena.nrResultado4" label="4º Número" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="megaSena.nrResultado5" label="5º Número" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="megaSena.nrResultado6" label="6º Número" maxLength="2" size="3" required="true"/>
			<sj:datepicker name="dtResultado" displayFormat="dd/mm/yy" label="Data Resultado" maxlength="10"/>          
			<s:submit align="left" value="Gravar Jogo"></s:submit>  
		</s:form>

</body>
<%@ include file="rodape.jsp" %>
</html>