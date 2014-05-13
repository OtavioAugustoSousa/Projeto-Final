<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<table border="2 solid">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Descrição</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${grupoList}" var="participante">
				<tr>
					<td>${grupo.nome}</td>
					<td>${grupo.descricao}</td>
					<td><a href="<c:url value="/grupo/${grupo.id}"/>">Editar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	˜
</body>
</html>