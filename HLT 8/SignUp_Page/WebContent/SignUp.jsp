<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up here</title>
</head>
<body>
<center>
	<h1>Sign up here</h1>
	
	<form action="SignUpServlet" method="post">
	Enter Name: <input type="text" name="uname" />
	<br/>
	Enter ID: <input type="text" name="uid"/>
	<br/>
	Enter password: <input type="password" name="pass"/>
	<br/>
	Enter email: <input type="text" name="email"/>
	<br/>
	<input type="submit" value="Save"/>
	</form>
	
</center>
</body>
</html>