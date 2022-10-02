<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

 </style>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div align=center>
<h1>User Login</h1>

<form action="LoginServlet" method="get">
<table>
<tr><td>Enter User Id:</td>
<td><input type=text name=userid> </td></tr>
<tr><td>Enter Password:</td>
<td><input type=text name=password></td></tr>
<tr><td><input type= Submit value=login></td>
<td> <input type=reset></td></tr>
</table>
</form>
</div>
</body>
</html>