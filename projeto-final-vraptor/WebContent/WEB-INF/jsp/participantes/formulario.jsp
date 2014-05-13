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
	<form action="<c:url value="/participantes"/>" method="post">
		<fieldset>
			<legend>Adicionar Paticipantes</legend>
			<label for="nome">Nome:</label> <input id="nome" type="text"
				name="participante.nome" /> <label for="email">Email:</label> <input
				id="email" type="text" name="participante.email" /> <label
				for="senha">Senha:</label> <input id="senha" type="password"
				name="participante.senha" />
			<button type="submit">Enviar</button>

		</fieldset>

	</form>
</body>
</html>