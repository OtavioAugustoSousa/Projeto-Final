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
	<form action="<c:url value="/participante/${participante.id }"/>"
		method="POST">
		<fieldset>
			<legend>Editar Participante</legend>
			<label for="nome">Nome:</label> <input id="nome" type="text"
				name="participante.nome" value="${participante.nome }" /> 
				<label for="email">Email:</label> <input type="text" id="email"
				name="participante.email" value="${participante.email}">
			<button type="submit" name="_method" value="PUT">Enviar</button>
		</fieldset>
	</form>

</body>
</html>