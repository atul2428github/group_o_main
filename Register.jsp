<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp Page</title>
</head>
<body>
<div align= center>
<img src="img/signup.png" height="200" width="300">

<h1 style="display: flex;justify-content: center;" > Sign up here</h1>

<form action ="RegisterServlet" method="get">
<table>
<tr><td>Enter First Name:</td>
<td><input type= text name= fname></td></tr>
<tr><td> </td></tr>
<tr><td>Enter Last Name:</td>
<td><input type= text name= lname></td></tr>
<tr></tr>
<tr><td>Enter Mobile Number:</td>
<td><input type= text name= mob ></td></tr>
<tr></tr>
<tr><td>Create User Id:</td>
<td><input type= text name= userid></td></tr>
<tr></tr>
<tr><td>Create Password:</td>
<td><input type= text name= password></td></tr>
<tr></tr>
<tr><td><input type= Submit value=Register></td>
<td> <input type=reset></td></tr>
</table>
</form>
</div>
</body>
</html>