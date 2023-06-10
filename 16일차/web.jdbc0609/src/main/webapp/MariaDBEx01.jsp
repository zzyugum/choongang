<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "web.jdbc0609.*" %>
    <%@ page import="java.sql.Connection" %>
	<%@ page import="java.sql.DriverManager" %>
	<%@ page import="java.sql.*" %>
	<%@ page import="javax.sql.*" %>
	<%@ page import="javax.naming.*" %>
	<%@ page import="java.sql.Connection" %>
	<%@ page import="java.sql.DriverManager" %>
    <%
    int empno = Integer.parseInt(request.getParameter("empno"));
	String ename = request.getParameter("ename");
	int sal = Integer.parseInt(request.getParameter("sal"));
	String phon = request.getParameter("phon");
	Ex01 ex01 = new Ex01(empno,ename,sal,phon);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
</body>
</html>