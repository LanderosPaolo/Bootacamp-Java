<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Base de datos</title>
</head>
<body>
<h1>Lista de Empleados</h1>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Nombre</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="empleado" items="${empleados}">
        <tr>
            <td>${empleado.numEmpleado}</td>
            <td>${empleado.nombre}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>