<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>You are successfully registered</h1>

<h2>${Header }</h2>
<p>${description }</p>
<br>
<p> ${msg } </p>

<hr>

 <%-- using requestParam
<h2>Name is : ${user } </h2>
<h2>Email is : ${Email } </h2>
<h2>Password is : ${Password } </h2>  --%>

<h2>Name is : ${user.userName } </h2>
<h2>Email is : ${user.email } </h2>
<h2>Password is : ${user.userPassword } </h2>

</body>
</html>