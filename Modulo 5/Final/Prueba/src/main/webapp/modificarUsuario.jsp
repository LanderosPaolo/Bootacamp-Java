<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Modificar Usuario</h1>
<form action="modificarUsuario" method="post">
    <input type="hidden" name="id" value="${usuario.id}">

    <label for="nombre">Nombre:</label>
    <input type="text" name="nombre" id="nombre" value="${usuario.nombre}">

    <label for="username">Nombre de usuario:</label>
    <input type="text" name="username" id="username" value="${usuario.username}">

    <label for="correo">Correo Electrónico:</label>
    <input type="email" name="correo" id="correo" value="${usuario.correo}">

    <label for="nacimiento">Fecha de nacimiento:</label>
    <input type="date" name="nacimiento" id="nacimiento" value="${usuario.fechaNacimiento}">

    <label for="pass">Contraseña:</label>
    <input type="password" name="pass" id="pass" value="${usuario.password}">

    <button type="submit">Actualizar</button>
</form>
</body>
</html>
