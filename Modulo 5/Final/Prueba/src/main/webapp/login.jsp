<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Inicio de Sesión</h2>
<form action="inicioSesion" method="POST">
    <label for="username">Usuario:</label>
    <input type="text" name="username" id="username" required value="prueba1"><br>

    <label for="password">Contraseña:</label>
    <input type="password" name="password" id="password" required value="123"><br>

    <button type="submit">Iniciar Sesión</button>
</form>
<a href="registro.jsp">Registro</a>
</body>
</html>
