<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    if (session.getAttribute("usuario") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<html>
<head>
    <title>Lista de Usuarios</title>
</head>
<body>
<h2>Lista de Usuarios</h2>
<c:forEach var="usuario" items="${usuarios}">
    <p>ID: ${usuario.id} - Nombre: ${usuario.nombre} - Username: ${usuario.username} - Email: ${usuario.email}</p>
</c:forEach>

<a href="menuPrincipal.jsp">Volver</a>
</body>
</html>
