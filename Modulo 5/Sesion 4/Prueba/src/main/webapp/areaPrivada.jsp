<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>

<html>
<%
  HttpSession s = request.getSession(false);
  if (session == null || s.getAttribute("usuario") == null) {
    // No hay sesión válida, redirigir a index.jsp
    response.sendRedirect("index.jsp");
    return;
  }
%>
<head>
  <title>En sesion</title>
</head>
<body>
<p>Si estas viendo esta pagina, es por que estas logueado correctamente y el nombre de usuario esta guardado en la sesión</p>
<h1>Lista Departamentos</h1>
<table border="1">
  <thead>
  <tr>
    <th>NumDepto</th>
    <th>NomDepto</th>
    <th>UbicacionDpto</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="departamento" items="${departamentos}">
    <tr>
      <td>${departamento.numDepto}</td>
      <td>${departamento.nomDepto}</td>
      <td>${departamento.ubicacionDepto}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<form action="Deslogueo" method="POST">
  <button type="submit">Cerrar sesión</button>
</form>
</body>
</html>
