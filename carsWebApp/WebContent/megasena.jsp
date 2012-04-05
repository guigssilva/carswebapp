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

				<s:form action="gerarMegaSena">
		            <td align="left" style="font-size: 12pt" colspan="5"><font color="white">Quantidade de Jogos à Gerar Abaixo</font></td>
		            <s:textfield size="4" maxLength="3" type="text" name="qtdJogos" required="true"/> 
		 
		                    
					<s:submit align="left" value="Gerar Números" method="gerarNumerosMegaSena"></s:submit>  
					<table border="5" bordercolor="#8080cc"  bordercolorlight="#8080c0" bordercolordark="#400080" bgcolor="#ffffcc" >
						<s:iterator value="listaMegaSena" status="status" >
							<tr bgcolor="#${status.count % 2 == 0 ? 'aaee88' : 'ffffff' }" style="font-size: 12pt">
								<td width="5%" align="right"> <font color="blue">${status.count}</font></td>
								<td width="5%" align="right"> <s:property value="nrResultado1"/> </td>
								<td width="5%" align="right"> <s:property value="nrResultado2"/> </td>
								<td width="5%" align="right"> <s:property value="nrResultado3"/> </td>
								<td width="5%" align="right"> <s:property value="nrResultado4"/> </td>
								<td width="5%" align="right"> <s:property value="nrResultado5"/> </td>
								<td width="5%" align="right"> <s:property value="nrResultado6"/> </td>
							</tr>		
						</s:iterator>		
					</table>	
				</s:form>

</body>
<%@ include file="rodape.jsp" %>
</html>