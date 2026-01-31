<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Records</title>
</head>
<body>
<%
try{
Class.forName("org.postgresql.Driver");
Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/userdata","postgres","admin");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("Select * from usertable");
while(rs.next()){
	out.println(rs.getInt(1)+ "&nbsp;&nbsp;&nbsp "+rs.getString(2)+ "&nbsp;&nbsp;&nbsp "+rs.getString(3)+"<br>");	
}
con.close();
}catch(Exception e){
	out.println("Error");
}
%>
</body>
</html>