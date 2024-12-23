<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Registro</h1>
    <form action="registroUsuario" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" id="nombre">

        <label for="username">Nombre de usuario:</label>
        <input type="text" name="username" id="username">

        <label for="Correo">Correo Electronico:</label>
        <input type="email" name="correo" id="correo">

        <label for="nacimiento">Fecha de nacimiento:</label>
        <input type="date" name="nacimiento" id="nacimiento">

        <label for="pass">Contraseña:</label>
        <input type="password" name="pass" id="pass">

        <label for="pass2">Repita Contraseña:</label>
        <input type="password" name="pass2" id="pass2">

        <button type="submit">Registrarse</button>
    </form>
</body>
</html>
