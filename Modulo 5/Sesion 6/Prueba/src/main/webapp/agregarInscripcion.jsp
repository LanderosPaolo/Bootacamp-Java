<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="index.jsp">Volver</a>
<h2>Formulario de Inscripción</h2>
<form action="posInscripcion" method="post">
    <label for="nombre">Nombre del Alumno:</label>
    <input type="text" id="nombre" name="nombre" required>
    <br><br>
    <label for="telefono">Teléfono:</label>
    <input type="text" id="telefono" name="telefono" required>
    <br><br>
    <label for="idCurso">ID del Curso:</label>
    <input type="number" id="idCurso" name="idCurso" required>
    <br><br>
    <label for="idFormaPago">ID de la Forma de Pago:</label>
    <input type="number" id="idFormaPago" name="idFormaPago" required>
    <br><br>
    <button type="submit">Registrar Inscripción</button>
</form>
</body>
</html>
