<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <form action="ProcesaLogin" method="POST">
        <label for="usuario">Usuario</label>
        <input type="text" name="usuario" id="usuario" value="usuario1" required>
        <label for="pass">Contraseña</label>
        <input type="password" name="pass" id="pass" value="Usuario1234" required>
        <button type="submit">Log In</button>
    </form>
</body>
</html>