<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (session.getAttribute("usuario") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Que desea hacer?</h1>
<a href="consultarHoroscopo">Conoce tu animal</a><br><br>
<a href="buscarUsuario">Buscar usuarios</a><br><br>
<a href="modificarUsuario">Modificar datos</a><br><br>
<a href="eliminarUsuario">Eliminar cuenta</a><br><br>
<a href="cerrarSesion">Cerrar sesion</a>
</body>
</html>
