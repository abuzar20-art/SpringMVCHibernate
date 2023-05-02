<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import = "java.time.*" %>
 <%@ page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help</title>
</head>
<body>

<h1>This is help page</h1>

<%
         /* String name =(String) request.getAttribute("name");
          Integer rollNumber =(Integer) request.getAttribute("rollNo");
          LocalDateTime date =(LocalDateTime) request.getAttribute("TimeAndDate"); */
%>

<h1>Hello my name is: ${name}
 <%-- <%= name %>  --%>

</h1>
<h1> Roll no is : ${rollNo }
<%-- <%= rollNumber %> --%> </h1>
<h1> Time is : ${TimeAndDate }

<%--  <%= date %> --%></h1>

<hr>

<%-- ${marks } --%>
  <!-- for(Integer mark : marks){
  syso(mark);
  } -->
<c:forEach var="mark"  items="${marks }">
<%-- <h1>${mark }</h1> --%>
<h1><c:out value="${mark }"></c:out></h1>
</c:forEach>

</body>
</html>