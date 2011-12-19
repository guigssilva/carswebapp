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
<s:action name="detalhes" />
	<p>
		<font size="4" face="Tahoma" color="white">
		<h1>Carros</h1>
		</font>
		</p>
		<s:form action="detalhes">
		
		<div class="center_content">
		<div class="center_title_bar"><s:property value="carros.nome"/></div>
    
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 
                 <div class="product_img_big">
                 <a href="javascript:popImage('<s:property value="carros.imagem"/>','Some Title')" title="header=[Zoom] body=[&nbsp;] fade=[on]"><img src="<s:property value="carros.imagem"/>" width="94" height="92" alt="" title="" border="0" /></a>
                 <div class="thumbs">
                 <a href="javascript:popImage('<s:property value="carros.imagem"/>','Some Title')" title="header=[Thumb1] body=[&nbsp;] fade=[on]"><img src="<s:property value="carros.imagem"/>" width="44" height="42" alt="" title="" border="0" /></a>
                 </div>
                 </div>
                     <div class="details_big_box">
                         <div class="product_title_big"><s:property value="carros.nome"/></div>
                         <div class="specifications">
                            Quantidade: <span class="blue"><s:property value="carros.estoque"/></span><br />

                            Garantia: <span class="blue"><s:property value="carros.garantia"/> anos</span><br />
                            
                         </div>
                         <div class="prod_price_big"><span class="reduce"><s:property value="carros.valor"/></span> <span class="price"><s:property value="carros.desconto"/></span></div>
                     </div>
                     <a href="loginServicos.jsp" class="details">Comprar</a>                          
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
        </div>
	</s:form>	
	        	
       


</body>
<%@ include file="rodape.jsp" %>
</html>

<script>
PositionX = 100;
PositionY = 100;


defaultWidth  = 500;
defaultHeight = 500;
var AutoClose = true;

if (parseInt(navigator.appVersion.charAt(0))>=4){
var isNN=(navigator.appName=="Netscape")?1:0;
var isIE=(navigator.appName.indexOf("Microsoft")!=-1)?1:0;}
var optNN='scrollbars=no,width='+defaultWidth+',height='+defaultHeight+',left='+PositionX+',top='+PositionY;
var optIE='scrollbars=no,width=150,height=100,left='+PositionX+',top='+PositionY;
function popImage(imageURL,imageTitle){
if (isNN){imgWin=window.open('about:blank','',optNN);}
if (isIE){imgWin=window.open('about:blank','',optIE);}
with (imgWin.document){
writeln('<html><head><title>Loading...</title><style>body{margin:0px;}</style>');writeln('<sc'+'ript>');
writeln('var isNN,isIE;');writeln('if (parseInt(navigator.appVersion.charAt(0))>=4){');
writeln('isNN=(navigator.appName=="Netscape")?1:0;');writeln('isIE=(navigator.appName.indexOf("Microsoft")!=-1)?1:0;}');
writeln('function reSizeToImage(){');writeln('if (isIE){');writeln('window.resizeTo(300,300);');
writeln('width=300-(document.body.clientWidth-document.images[0].width);');
writeln('height=300-(document.body.clientHeight-document.images[0].height);');
writeln('window.resizeTo(width,height);}');writeln('if (isNN){');       
writeln('window.innerWidth=document.images["George"].width;');writeln('window.innerHeight=document.images["George"].height;}}');
writeln('function doTitle(){document.title="'+imageTitle+'";}');writeln('</sc'+'ript>');
if (!AutoClose) writeln('</head><body bgcolor=ffffff scroll="no" onload="reSizeToImage();doTitle();self.focus()">')
else writeln('</head><body bgcolor=ffffff scroll="no" onload="reSizeToImage();doTitle();self.focus()" onblur="self.close()">');
writeln('<img name="George" src='+imageURL+' style="display:block"></body></html>');
close();		
}}

</script>