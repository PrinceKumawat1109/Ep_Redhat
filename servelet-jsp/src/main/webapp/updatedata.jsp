<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Data</title>
</head>
<body>
	<h3>Update Book</h3>
	<form action="UpdateData" method="get">
		StudentName:<input type="text" name="name"/><br/><br/>
		StudentID:<input type="text" name="rollno"/><br/><br/>
		StudentDept:<input type="text" name="dept"/><br/><br/>
		<input type="submit" value="Update Data" />
	</form>
</body>
</html>