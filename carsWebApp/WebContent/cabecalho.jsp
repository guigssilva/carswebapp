<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	 <sj:head locale="pt" jqueryui="true" jquerytheme="dark-hive-my" customBasepath="/carsWebApp/template/themes"/>
	<title>GRT Veiculos</title>
  	
  	<link rel="stylesheet" type="text/css" href="css/menu_style.css" />
	<link rel="stylesheet" href="style.css" type="text/css" />	
	<script type="text/javascript" src="js/jquery.js" ></script>
	<script type="text/javascript" src="js/jquery-bp.js" ></script>
	<script type="text/javascript" src="js/navigation.js" ></script>

</head>
<body>
<div id="header">
<a href="#"><img src="images/logo.jpg" width="200" height="66" align="middle"/></a>
<div id="navigation" class="container">
	<div class="nav-container-outer">
	   <img src="images/nav-bg-l.jpg" alt="" class="float-left" />
	   <img src="images/nav-bg-r.jpg" alt="" class="float-right" />
	   <ul id="nav-container" class="nav-container">
	      <li><a class="item-primary" href="index.jsp" target="_self">Home</a>
		   </li>
	       <li><span class="divider divider-vert" ></span></li>
	      <li><a class="item-primary" href="aempresa.jsp" target="_self">A Empresa</a>
		   </li>
	       <li><span class="divider divider-vert" ></span></li>
	      <li><a class="item-primary" href="todosCarros" target="_self">Carros</a>
	     	 <ul style="width:150px;">
	     	 	 <li><a class="item-primary" href="cadastrarcarros.jsp" target="_self">Cadastrar Carro</a></li>
	     	 </ul>
		   </li>
	       <li><span class="divider divider-vert" ></span></li>
	      <li><a class="item-primary" href="contato.jsp" target="_self">Contato</a>
		   </li>
	       <li><span class="divider divider-vert" ></span></li>
	      <li><a class="item-primary" href="loterias.jsp" target="_self">Loterias</a>
	         <ul style="width:150px;">
	            <li><a href="lotofacil.jsp" title="Gerar LOTOFACIL" target="_self" >Gerar LOTOFACIL</a></li>
	            <li><a href="megasena.jsp" title="Gerar MEGASENA" target="_self" >Gerar MEGASENA</a></li>
	            <li><a href="cadastrarmegasena.jsp" title="Grava jogo Megasena" target="_self" >Grava jogo Megasena</a></li>
	            <li><a href="cadastrarlotofacil.jsp" title="Grava jogo Lotofacil" target="_self" >Grava jogo Lotofacil</a></li>
	            <li><a href="" title="Importar Resultados Megasena" target="_self" >Importa Megasena</a></li>
	         </ul>
		   </li>
	       <li><span class="divider divider-vert" ></span></li>
	      <li class="clear">&nbsp;</li>
	   </ul>
	</div>
	</div>
	<div class="container">
		<div class="content">
			<div id="content-title"></div>
			<!-- the rest of the content-->
		</div>
	</div>
	</div>
	
</body>
</html>