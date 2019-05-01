<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Labo 05</title>
</head>
<body>
	<h2>Formulario</h2>
	<br>
	<form action="${pageContext.request.contextPath}/formData" method="post">
		<label>Nombre: </label><input type="text" name="name"><br>
		<label>Apellido: </label><input type="text" name="lname"><br>
		<label>Fecha de nacimiento: </label><input type="date" name="birthdate"><br>
		<label>Carrera: </label><input type="text" name="carreer"><br>
		<label>Experiencia: </label><input type="text" name="experience"><br>
		<input type="submit" value="Enviar">
	</form>
	<h1>Testing JSTL</h1>
	<h2>Even numbers from 1 to 10</h2>
	<c:forEach var="i" begin="1" end="10">
		<c:set var="modulus" value="${i % 2}"/>
		<c:if test="${modulus == 0}">
			<p>Item <c:out value="${i}"/></p>
		</c:if>
	</c:forEach>
</body>
</html>