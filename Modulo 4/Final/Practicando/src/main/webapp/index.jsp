 <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario</title>
</head>
<body>
    <h1>Formulario</h1>
    <form action="formulario-servlet" method="post">
        <label for="nombre">Ingrese nombre: </label>
        <input type="text" id="nombre" name="nombre" required>
        <br>
        <label for="edad">Ingrese su edad: </label>
        <input type="text" id="edad" name="edad">
        <br>
        <button type="submit">Enviar al servlet</button>
    </form>
    <br>

</body>
</html>