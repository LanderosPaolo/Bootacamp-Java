<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Nombre Empleado</th>
        <th>Departamento Empleado</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="empleado" items="${empleados}">
        <tr>
            <td>${empleado.numeroEmpleado}</td>
            <td>${empleado.nombreEmpleado}</td>
            <td>${empleado.numeroDepartamento}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
