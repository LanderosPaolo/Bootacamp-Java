<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Departamentos</title>
</head>
<body>
<h1>Departamentos</h1>
<br>
<form method="get" action="departamentos">
    <button type="submit">Mostrar Todos</button>
</form>
<br>
<form method="get" action="departamentos">
    <label for="nombre">Departamento</label>
    <input type="text" name="nombre" id="nombre">
    <button type="submit">Buscar</button>
</form>
<br>
<form method="get" action="departamentos">
    <label for="ubicacion">Ubicacion</label>
    <input type="text" name="ubicacion" id="ubicacion">
    <button type="submit">Buscar</button>
</form>
<br>

<table>
    <thead>
    <tr>
        <th>Numero </th>
        <th>Nombre </th>
        <th>Ubicacion </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="departamento" items="${listaDepartamentos}">
        <tr>
            <td>${departamento.numDepartamento}</td>
            <td>${departamento.nombreDepartamento}</td>
            <td>${departamento.ubicacionDepartamento}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>