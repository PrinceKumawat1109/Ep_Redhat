<%@page import="java.io.UncheckedIOException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.util.*" %>
	<%@ page import="com.model.*" %>
	<% @SuppressWarnings("Unchecked") List<Student>L=(List<Student>) request.getAttribute("list"); %>
	<table border="1">
		<tr>
			
			<th>Student Name</th>
			<th>Student Id</th>
			<th>Student Dept</th>
		</tr>
		<%for(Student S:L){ %>
			<tr>
				<td><%=S.getName() %></td>
				<td><%=S.getId() %></td>
				<td><%=S.getDept() %></td>
			</tr>
			<%} %>
				
	</table>
</body>
</html>
