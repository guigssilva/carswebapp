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

	<p>
		<font size="4" face="Tahoma" color="white">
		<h1>Carros</h1>
		</font>
		</p>
		
		<div class="center_content">
		<div class="center_title_bar">Ferrari Enzo</div>
    
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 
                 <div class="product_img_big">
                 <a href="javascript:popImage('imagesCarros/ferrari.png','Some Title')" title="header=[Zoom] body=[&nbsp;] fade=[on]"><img src="imagesCarros/ferrari.png" width="94" height="92" alt="" title="" border="0" /></a>
                 <div class="thumbs">
                 <a href="javascript:popImage('imagesCarros/thumb1.gif','Some Title')" title="header=[Thumb1] body=[&nbsp;] fade=[on]"><img src="imagesCarros/thumb1.gif" width="44" height="42" alt="" title="" border="0" /></a>
                 </div>
                 </div>
                     <div class="details_big_box">
                         <div class="product_title_big">Ferrari Enzo</div>
                         <div class="specifications">
                            Disponibilidade: <span class="blue">Em estoque</span><br />

                            Garantia: <span class="blue">2 anos</span><br />
                            
                         </div>
                         <div class="prod_price_big"><span class="reduce">800.000$</span> <span class="price">700.000$</span></div>
                     </div>
                     <a href="loginServicos.jsp" class="details">Comprar</a>                          
            </div>
            <div class="bottom_prod_box_big"></div>                                
        </div>
				
	        	
        <div class="center_content">
		<div class="center_title_bar">BMW M5</div>
    
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 
                 <div class="product_img_big">
                 <a href="javascript:popImage('imagesCarros/bmw.png','Some Title')" title="header=[Zoom] body=[&nbsp;] fade=[on]"><img src="imagesCarros/bmw.png" width="94" height="92" alt="" title="" border="0" /></a>
                 <div class="thumbs">
                 <a href="javascript:popImage('imagesCarros/bmw1.png','Some Title')" title="header=[Thumb1] body=[&nbsp;] fade=[on]"><img src="imagesCarros/bmw1.png" width="44" height="42" alt="" title="" border="0" /></a>
                 </div>
                 </div>
                     <div class="details_big_box">
                         <div class="product_title_big">BMW M5</div>
                         <div class="specifications">
                            Disponibilidade: <span class="blue">Em estoque</span><br />

                            Garantia: <span class="blue">2 anos</span><br />
                            
                         </div>
                         <div class="prod_price_big"><span class="reduce">R$500.000</span> <span class="price">R$400.000</span></div>
                     </div>       
                 <a href="loginServicos.jsp" class="details">Comprar</a>          
            </div>
            
            <div class="bottom_prod_box_big"></div>                                
        </div>
       </div>
      </div>
       
       <div class="center_content">
		<div class="center_title_bar">Camaro</div>
    
    	<div class="prod_box_big">
        	<div class="top_prod_box_big"></div>
            <div class="center_prod_box_big">            
                 
                 <div class="product_img_big">
                 <a href="javascript:popImage('imagesCarros/camaro.png','Some Title')" title="header=[Zoom] body=[&nbsp;] fade=[on]"><img src="imagesCarros/camaro.png" width="94" height="92" alt="" title="" border="0" /></a>
                 <div class="thumbs">
                 <a href="javascript:popImage('imagesCarros/camaro1.png','Some Title')" title="header=[Thumb1] body=[&nbsp;] fade=[on]"><img src="imagesCarros/camaro1.png" width="44" height="42" alt="" title="" border="0" /></a>
                 </div>
                 </div>
                     <div class="details_big_box">
                         <div class="product_title_big">Camaro</div>
                         <div class="specifications">
                            Disponibilidade: <span class="blue">Em estoque</span><br />

                            Garantia: <span class="blue">2 anos</span><br />
                            
                         </div>
                         <div class="prod_price_big"><span class="reduce">R$200.000</span> <span class="price">R$190.000</span></div>
                     </div>      
                     <a href="loginServicos.jsp" class="details">Comprar</a>                    
            </div>
            
            <div class="bottom_prod_box_big"></div>                                
        </div>
       </div>		


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