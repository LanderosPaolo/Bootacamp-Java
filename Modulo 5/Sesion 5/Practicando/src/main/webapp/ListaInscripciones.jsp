<%@ page import="org.edutecno.ejercicio.dto.InscripcionDTO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center;">Lista de Inscripciones</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Celular</th>
        <th>Curso</th>
        <th>Forma de Pago</th>
    </tr>
    </thead>
    <tbody>
        <%
            List<org.edutecno.ejercicio.dto.InscripcionDTO> inscripciones = (List<InscripcionDTO>) request.getAttribute("listaInscripciones");
            if (inscripciones != null) {
                for (org.edutecno.ejercicio.dto.InscripcionDTO inscripcion : inscripciones) {
        %>
    <tr>
        <td><%= inscripcion.getIdInsc() %></td>
        <td><%= inscripcion.getNombre() %></td>
        <td><%= inscripcion.getCelular() %></td>
        <td><%= inscripcion.getIdCurso() %></td>
        <td><%= inscripcion.getIdFormaDePago() %></td>
    </tr>
        <%
                }
            } else {
        %>
    <tr>
        <td colspan="5" style="text-align: center;">No hay inscripciones disponibles.</td>
    </tr>
        <%
            }
        %>
</body>
</html>
