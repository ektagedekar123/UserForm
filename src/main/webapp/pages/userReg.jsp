<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="saveUSer" Method="get" >
	<h1>User Registration Form</h1>
	<table>
		<tr>
			<td>USER FIRST NAME</td>
			<td><input type="text" name="fname"></td>
		</tr>

		<tr>
			<td>USER LAST NAME</td>
			<td><input type="text" name="lname"></td>
		</tr>

		<tr>
			<td>USER EMAIL</td>
			<td><input type="text" name="email"></td>
		</tr>

		<tr>
			<td>USER NAME</td>
			<td><input type="text" name="uname"></td>
		</tr>

		<tr>
			<td>USER PASSWORD</td>
			<td><input type="text" name="password"></td>
		</tr>

		<tr>
		
            <td><input type="submit" value="REGISTER"></td>
            
		</tr>
	</table>
	</form>
</body>
</html>