<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"/>
	<h1>Contas:</h1>
	<form action="conta" method="get">
		<table style="border-collapse: collapse; border: 1px solid black;">
			<thead>
				<tr>
					<th style="border: 1px solid black;">Numero</th>
					<th style="border: 1px solid black;">cliente</th>
					<th style="border: 1px solid black;">saldo</th>
					<th style="border: 1px solid black;">limite</th>
					<th style="border: 1px solid black;">dia de rendimento</th>
					<th style="border: 1px solid black;">Ações</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${not empty contas }">
					<c:forEach var="conta" items="${contas }">
						<tr>
							<td style="border: 1px solid black;">${conta.numConta }</td>
							<td style="border: 1px solid black;">${conta.cliente }</td>
							<td style="border: 1px solid black;">R$${conta.saldo }0</td>
							<c:choose>
								<c:when test="${conta.getClass().simpleName eq 'ContaEspecial'}">
									<td style="border: 1px solid black;">R$${conta.limite}0</td>
								</c:when>
								<c:otherwise>
									<td style="border: 1px solid black;"></td>

								</c:otherwise>
							</c:choose>
							<c:choose>
								<c:when test="${conta.getClass().simpleName eq 'ContaPoupanca'}">
									<td style="border: 1px solid black;">${conta.diaRendimento }</td>
								</c:when>
								<c:otherwise>
									<td style="border: 1px solid black;"></td>

								</c:otherwise>
							</c:choose>
							<td style="border: 1px solid black;"><button type="submit" name="conta" value="${conta.numConta }">Acessar</button></td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</form>

</body>
</html>