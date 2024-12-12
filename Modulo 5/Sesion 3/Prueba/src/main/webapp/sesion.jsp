<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<%
    HttpSession s = request.getSession(false);
    if (s == null || s.getAttribute("usuario") == null) {
        response.sendRedirect("index.jsp");
        return;
    }
%>
<html>
<head>
    <title>En sesion</title>
</head>
<body>
<p>Si estas viendo esta pagina, es por que estas logueado correctamente y el nombre de usuario esta guardado en la sesión</p>
<form action="Deslogueo" method="POST">
    <button type="submit">Cerrar sesión</button>
</form>
</body>
</html>
