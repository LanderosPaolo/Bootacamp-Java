<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>DESCRIPCION</th>
        <th>PRECIO</th>
    </tr>
    </thead>
    <c:forEach var="cursos" items="${cursos}">
    <tbody>
        <tr>
            <<td>${cursos.idCurso}</td>
            <td>${cursos.descripcion}</td>
            <td>${cursos.precio}</td>
            <td>
                <a href="actualizarCurso?id=${cursos.idCurso}">Editar curso</a>
                <a href="eliminarcurso?id=${cursos.idCurso}" onclick="return confirm('¿Desea eliminar?')">Eliminar</a>
            </td>
        </tr>
    </tbody>
    </c:forEach>

</table>
</body>
</html>
