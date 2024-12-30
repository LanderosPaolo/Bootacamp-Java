<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    if (session.getAttribute("usuario") == null) {
        response.sendRedirect("login.jsp");
    }
%>

<html>
<head>
    <title>Consulta Horóscopo Chino</title>
</head>
<body>
<h2>Consulta tu Horóscopo Chino</h2>

<c:if test="${not empty animal}">
    <p>Tu animal del horóscopo chino es: ${animal}</p>
</c:if>

<a href="menuPrincipal.jsp">Volver</a>
</body>
</html>