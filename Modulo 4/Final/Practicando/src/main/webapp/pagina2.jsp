<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pagina 2</title>
</head>
<body>
 <h1>Pagina 2: Datos recibidos</h1>
 <p>Nombre: <%= request.getParameter("nombre")%></p>
 <p>Edad: <%= request.getParameter("edad")%></p>
 <br>
 <a href="index.jsp">Volver a la pagina principal</a>
</body>
</html>
