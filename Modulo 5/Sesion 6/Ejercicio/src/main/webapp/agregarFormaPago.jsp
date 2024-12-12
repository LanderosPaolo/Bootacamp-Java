<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="index.jsp">Volver</a>
<form action="agregarFormaPago" method="post">
    <label>Descripcion:</label>
    <input type="text" id="descripcion" name="descripcion" required>
    <br>
    <label>Recarga:</label>
    <input type="text" id="recarga" name="recarga" required>
    <br>
    <button type="submit">Agregar Forma de pago</button>
</form>
</body>
</html>
