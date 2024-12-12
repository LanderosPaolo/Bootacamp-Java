
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Lista de Cursos</h1>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Descripcion</th>
        <th>Precio</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="curso" items="${curso}">
        <tr>
            <td>${curso.idCurso}</td>
            <td>${curso.descripcion}</td>
            <td>${curso.precio}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
