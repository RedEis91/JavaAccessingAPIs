
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
${inst}
<h1>Please fill in the form to register!</h1>
<form action="formhandler" method="post">
    First Name: <input type="text" name="firstname"><br>
    Last Name: <input type="text" name="lastname"><br>
    Email: <input type="text" name="email"><br>
    Phone Number: <input type="number" name="phonenumber"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" name="submit" value="register">
</form>
</body>
</html>
