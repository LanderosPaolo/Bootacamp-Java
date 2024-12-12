<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Lista de Inscripciones</title>
</head>
<body>
<h1>Lista de Inscripciones</h1>
<c:if test="${empty PreListarInscripcionesServlet}">
    <tr>
        <td colspan="5">No hay inscripciones disponibles.</td>
    </tr>
</c:if>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Teléfono</th>
        <th>Curso</th>
        <th>Forma de Pago</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="PreListarInscripcionesServlet" items="${PreListarInscripcionesServlet}">
    <tr>
        <td>${PreListarInscripcionesServlet.idInsc}</td>
        <td>${PreListarInscripcionesServlet.nombre}</td>
        <td>${PreListarInscripcionesServlet.celular}</td>
        <td>${PreListarInscripcionesServlet.idCurso}</td>
        <td>${PreListarInscripcionesServlet.idFormaDePago}</td>
    </tr>
    </tbody>
    </c:forEach>
</table>
</body>
</html>
