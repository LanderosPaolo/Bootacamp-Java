<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Evaluacion sesión 2</title>
</head>
<body>
    <form action="valores" method="POST">
        <div>
            <label for="nombreCompleto">Nombre Completo</label>
            <input type="text" name="nombreCompleto" id="nombreCompleto" placeholder="su nombre..." required>
        </div>
        <div>
            <label for="direccion">Direccion</label>
            <input type="text" name="direccion" id="direccion" placeholder="su dirección..." required>
        </div>
        <table border="1">
            <tr>
                <th>PRODUCTO</th>
                <th>DESCRIPCIÓN</th>
                <th>VALOR UNIDAD</th>
                <th>CANTIDAD</th>
            </tr>
            <tr>
                <td>Mother Board</td>
                <td>ASUS LGA1200</td>
                <td>$249000</td>
                <td><input type="text" name="cantidadPlaca" id="cantidadPlaca" value="0"></td>
            </tr>
            <tr>
                <td>Ram</td>
                <td>DDR4 8GB 2400MHz Kingston</td>
                <td>$45990</td>
                <td><input type="text" name="cantidadRam" id="cantidadRam" value="0"></td>
            </tr>
            <tr>
                <td>Micro</td>
                <td>I7 10700 8 Cores Hasta 4.8GHz</td>
                <td>$379000</td>
                <td><input type="text" name="cantidadProce" id="cantidadProce" value="0"></td>
            </tr>
            <tr>
                <td>Tarjeta de video</td>
                <td>MSI GeForce GTX 1650 D6 Gaming x 4GB GDDR6</td>
                <td>$219990</td>
                <td><input type="text" name="cantidadVideo" id="cantidadVideo" value="0"></td>
            </tr>
        </table>
        <button type="submit">Generar Factura</button>
    </form>
</body>
</html>