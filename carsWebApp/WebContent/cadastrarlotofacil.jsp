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
		<font size="4" face="Tahoma" color="white">
			<h1>Inserir Jogo da Lotof�cil</h1>
		</font>
		<s:form action="gravarLotoFacil">
			<s:textfield type="text" name="lotoFacil.nrResultado1" label="1� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado2" label="2� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado3" label="3� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado4" label="4� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado5" label="5� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado6" label="6� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado7" label="7� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado8" label="8� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado9" label="9� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado10" label="10� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado11" label="11� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado12" label="12� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado13" label="13� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado14" label="14� N�mero" maxLength="2" size="3" required="true"/>
			<s:textfield type="text" name="lotoFacil.nrResultado15" label="15� N�mero" maxLength="2" size="3" required="true"/>
            <s:date name="dtResultado" />                 
			<s:submit align="left" value="Gravar Jogo"></s:submit>  
		</s:form>

</body>
<%@ include file="rodape.jsp" %>
</html>