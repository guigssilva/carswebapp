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

		<p>
		<font size="4" face="Tahoma" color="white">
		<h1>Ofertas do dia</h1>
		</font>
		</p>
				
		<s:form action="pesqusiarCarrosDesconto" >
			<s:iterator value="listaCarros" >
			<div class="oferte_content">
	        	<div class="top_divider"><img src="images/header_divider.png" alt="" title="" width="1" height="164" /></div>
	        	<div class="oferta">
	            
	           		<div class="oferta_content">
	           			<img src="<s:url value="imagem" />" />
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
		
		
		
		<div class="oferte_content">
        	<div class="top_divider"><img src="images/header_divider.png" alt="" title="" width="1" height="164" /></div>
        	<div class="oferta">
            
           		<div class="oferta_content">
                	<img src="imagesCarros/bmw.png" width="94" height="92" border="0" class="oferta_img" />
                	
                    <div class="oferta_details">
                            <div class="oferta_title">BMW M5</div>
                            <div class="oferta_text">
                            Modelo esportivo da marca BMW que possui um motor V10 de 507 CV, atingindo uma velocidade de 330km/h, de 0 a 100km/h em 4,7s. E o seda mais rapido do mundo produzio atualmente.
                            </div>
                            <a href="carros.jsp" class="details">Detalhes</a>
                    </div>
                </div>       

            </div>
            <div class="top_divider"><img src="images/header_divider.png" alt="" title="" width="1" height="164" /></div>
        	
        </div> <!-- end of oferte_content-->
		
		<div class="oferte_content">
        	<div class="top_divider"><img src="images/header_divider.png" alt="" title="" width="1" height="164" /></div>
        	<div class="oferta">
            
           		<div class="oferta_content">
                	<img src="imagesCarros/porsche.png" width="94" height="92" border="0" class="oferta_img" />
                	
                    <div class="oferta_details">
                            <div class="oferta_title">Porsche</div>
                            <div class="oferta_text">
                            Carro esportivo que foi fabricado pela Porsche que possui motor V10, debita perto dos 1000 CV.
                            </div>
                            <a href="carros.jsp" class="details">Detalhes</a>
                    </div>
                </div>

            </div>
            <div class="top_divider"><img src="images/header_divider.png" alt="" title="" width="1" height="164" /></div>
        	
        </div> <!-- end of oferte_content-->

</body>
<%@ include file="rodape.jsp" %>
</html>