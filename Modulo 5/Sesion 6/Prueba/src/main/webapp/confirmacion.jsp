<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Registro exitoso</h1>
    <p>Nombre del alumno: ${requestScope.nombre}</p>
    <p>Teléfono contacto: ${requestScope.telefono}</p>
    <p>ID del Curso: ${requestScope.idCurso}</p>
    <p>ID de Forma de Pago: ${requestScope.idFormaPago}</p>
<a href="index.jsp">Volver</a>
</body>
</html>
