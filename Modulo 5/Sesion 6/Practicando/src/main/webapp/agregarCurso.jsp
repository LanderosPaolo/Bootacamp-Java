<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="agregarCurso" method="post">
    <label>Descripcion:</label>
    <input type="text" id="descripcion" name="descripcion">
    <br>
    <label>Precio:</label>
    <input type="number" id="precio" name="precio">
    <br>
    <button type="submit">Agregar Curso</button>
  </form>
</body>
</html>
