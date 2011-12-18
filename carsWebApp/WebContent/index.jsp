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
<s:action name="carrosDesconto" />
		<p>
		<font size="4" face="Tahoma" color="white">
		<h1>Ofertas do dia</h1>
		</font>
		</p>
		<table>
			<s:form action="carrosDesconto" >
				<s:iterator value="listaCarros" >
					<div class="oferte_content">
			        	<div class="top_divider"><img src="images/header_divider.png" alt="" title="" width="1" height="164" /></div>
			        	<div class="oferta">
			            
			           		<div class="oferta_content">
			           			<img src="<s:url value="imagem" />" width="94" height="92" />
			                	<img src="imagesCarros/ferrari.png" width="94" height="92" border="0" class="oferta_img" />	                	
			                    <div class="oferta_details">
			                    		<s:label cssClass="oferta_title"> <s:property value="nome"  /></s:label>
			                    		<s:label cssClass="oferta_text"> <s:property  value="descricao"  /></s:label>
			                            
			                            <a href="carros.jsp" class="details">Detalhes</a>
			                    </div>
			                </div>
			
			            </div>
			            <div class="top_divider"><img src="images/header_divider.png" alt="" title="" width="1" height="164" /></div>
			        	
			        </div> <!-- end of oferte_content-->
	        	</s:iterator>
	        </s:form>
		</table>
</body>
<%@ include file="rodape.jsp" %>
</html>