<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lab05</title>
</head>
<body>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Fecha de nacimiento</th>
			<th>Carrera</th>
			<th>Experiencia</th>
		</tr>
		<tr>
			<td>${student.name}</td>
			<td>${student.lastName}</td>
			<td>${student.bDate}</td>
			<td>${student.carreer}</td>
			<td>${student.experience}</td>
		</tr>
	</table>
</body>
</html>