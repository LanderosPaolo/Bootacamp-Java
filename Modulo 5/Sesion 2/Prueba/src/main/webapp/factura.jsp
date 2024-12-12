<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Factura</title>
</head>
<body>
<div>
    <h3>Nombre Completo</h3>
    <p>${nombreCompleto}</p>
</div>
<div>
    <h3>Direccion</h3>
    <p>${direccion}</p>
</div>
<table>
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
        <td>${cantidadPlaca}</td>
        <td>${totalPrecioPlaca}</td>
    </tr>
    <tr>
        <td>Ram</td>
        <td>DDR4 8GB 2400MHz Kingston</td>
        <td>$45990</td>
        <td>${cantidadRam}</td>
        <td>${totalPrecioRam}</td>
    </tr>
    <tr>
        <td>Micro</td>
        <td>i7 10700 8 Cores Hasta 4.8GHz</td>
        <td>$379000</td>
        <td>${cantidadProce}</td>
        <td>${totalPrecioProce}</td>
    </tr>
    <tr>
        <td>Tarjeta de video</td>
        <td>MSI GeForce GTX 1650 D6 Gaming x 4GB GDDR6</td>
        <td>$219990</td>
        <td>${cantidadVideo}</td>
        <td>${totalPrecioVideo}</td>
    </tr>
</table>
<div>
    <div>
        <p><strong>VALOR TOTAL NETO</strong></p>
        <p>${total}</p>
    </div>
    <div>
        <p><strong>Descuento</strong></p>
        <p>10%</p>
    </div>
    <div>
        <p><strong>VALOR TOTAL</strong></p>
        <p>${totalConDescuento}</p>
    </div>
</div>

</body>
</html>
