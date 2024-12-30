<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    if (session.getAttribute("usuario") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<html>
<head>
    <title>Confirmar Eliminación</title>
</head>
<body>
<h2>¿Estás seguro de que deseas eliminar este usuario?</h2>

<!-- Mostrar los datos del usuario desde la sesión -->
<p>ID: ${usuario.id}</p>
<p>Nombre: ${usuario.nombre}</p>
<p>Username: ${usuario.username}</p>
<p>Email: ${usuario.email}</p>

<!-- Formulario para confirmar la eliminación -->
<form action="eliminarUsuario" method="post">
    <button type="submit">Eliminar</button>
</form>

<a href="listarUsuarios.jsp">Cancelar</a>

</body>
</html>
