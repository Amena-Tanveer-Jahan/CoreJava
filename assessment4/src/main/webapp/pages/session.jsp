<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Session</title>
</head>
<body>
<%
HttpSession sessions = request.getSession();
sessions.setAttribute("username", "Tanveer");
String name =(String) sessions.getAttribute("username");
out.println("</h2> Username: "+ name +" </h2>");

%>
</body>
</html>