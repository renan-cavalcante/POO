<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conta ###</title>
</head>
<body>
<jsp:include page="menu.jsp"/><br/>
<c:if test="${not empty sucess}">
		<p style="color: green;">${ sucess}</p>
	</c:if><br/>
	<p>
		Numero:
		<c:if test="${not empty conta.numConta }">${conta.numConta }</c:if>
	</p>
	<p>
		Cliente:
		<c:if test="${not empty conta.cliente }">${conta.cliente }</c:if>
	</p>
	<p>
		saldo:
		<c:if test="${not empty conta.saldo }">${conta.saldo }</c:if>
	</p>
		<c:if test="${not empty valorAnterior}">
		<p>Saldo anterior:${valorAnterior }</p>
		<p>Rendeu: ${conta.saldo - valorAnterior }</p>
	</c:if>
	<c:if test="${conta.getClass().simpleName eq 'ContaEspecial'}">
		<p>Limite:${conta.limite }</p>
	</c:if>
	<c:if test="${conta.getClass().simpleName eq 'ContaPoupanca'}">
		<p>Dia de rendimento:${conta.diaRendimento }</p>
	</c:if>
	
	


	<form action="conta" method="post">
		<input type="hidden" name="conta" value="${conta.numConta}"> <label
			for="valor">Valor:</label> <input name="valor" />
		<button type="submit" name="opcao" value="saque">Saque</button>
		<button type="submit" name="opcao" value="deposito">Depositar</button>
		<c:if test="${conta.getClass().simpleName eq 'ContaPoupanca'}">
			<button type="submit" name="opcao" value="rendimento">Calcular
				rendimento</button>*Coloque o valor da % do rendimento
		</c:if>
	</form>

	<br />
	<c:if test="${not empty erros}">
		<c:forEach var="er" items="${erros}">
			<p style="color: red;">${er}</p>
		</c:forEach>
	</c:if>







</body>
</html>