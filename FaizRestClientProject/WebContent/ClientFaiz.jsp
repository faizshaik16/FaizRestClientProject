<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Faiz: Get User Details</title>
</head>
<body>
<form name='restForm' action="RestClientServlet"  method="post">
Name: <input type="text"  name="username">
email: <input type="text" name="emailid">
<input type="submit" value="get"/>
</form>
</body>
</html>