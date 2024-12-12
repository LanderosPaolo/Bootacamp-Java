<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="datos" method="post">
        <label for="name">Name</label>
        <input type="text" id="name" name="name" required/>
        <br>
        <label for="username">Username</label>
        <input type="text" id="username" name="username" required/>
        <br>
        <label for="email">email</label>
        <input type="email" id="email" name="email" required/>
        <br>
        <label for="password">password</label>
        <input type="password" id="password" name="password" required/>
        <br>
        <label for="rol">rol</label>
        <select name="rol" id="rol" >
            <option value="ROLE_ADMIN">ROLE_ADMIN</option>
            <option value="ROLE_CLIENT">ROLE_CLIENT</option>
        </select>
        <br>
        <button type="submit">Enviar</button>
    </form>
</body>
</html>