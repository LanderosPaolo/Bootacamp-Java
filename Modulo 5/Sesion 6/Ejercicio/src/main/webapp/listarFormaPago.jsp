<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="index.jsp">Volver</a>
<table>
  <thead>
  <tr>
    <th>ID</th>
    <th>DESCRIPCION</th>
    <th>RECARGA</th>
  </tr>
  </thead>
  <c:forEach var="formaPago" items="${formasPago}">
    <tbody>
    <tr>
      <td>${formaPago.idFormaPago}</td>
      <td>${formaPago.descripcion}</td>
      <td>${formaPago.recarga}</td>
    </tr>
    </tbody>
  </c:forEach>

</table>
</body>
</html>
