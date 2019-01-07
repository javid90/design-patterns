<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi everybody........</h1>

<%
int a = 10, b = 20;
java.util.function.BiFunction<Integer, Integer, Integer> bf = (Integer x, Integer y) -> x + y;
out.println("\n a + b = " + bf.apply(a, b));
 %>
</body>
</html>