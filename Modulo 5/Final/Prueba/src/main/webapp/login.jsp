<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Inicio de Sesión</h2>
<form action="inicio_sesion" method="POST">
    <label for="username">Usuario:</label>
    <input type="text" name="username" id="username" required><br>

    <label for="password">Contraseña:</label>
    <input type="password" name="password" id="password" required><br>

    <button type="submit">Iniciar Sesión</button>
</form>
</body>
</html>
