<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home Page</title>
</head>
<body>
	<h1>This is our home page</h1>
	<h1>Called by home controller</h1>
	<h1>url : /home</h1>
	<%
    String name =(String) request.getAttribute("Name");
          Integer id =(Integer) request.getAttribute("Id");
          List<String> fr =(List<String>) request.getAttribute("fr");
    %>

	<h1>
		Name is
		<%= name%></h1>
	<h1>
		ID is
		<%= id %></h1>
	<% 
    for(String f : fr)
    {
    	/* out.println(f) */;
    	%>
    	<h1><%= f %></h1>
    	
    	<% 
    }
    %>

</body>
</html>