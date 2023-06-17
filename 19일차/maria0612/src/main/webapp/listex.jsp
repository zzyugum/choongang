<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "maria0612.*" %>
    <%@ page import="java.sql.Connection" %>
	<%@ page import="java.sql.DriverManager" %>
	<%@ page import="java.sql.*" %>
	<%@ page import="javax.sql.*" %>
	<%@ page import="javax.naming.*" %>
	<%@ page import="java.sql.Connection" %>
	<%@ page import="java.sql.DriverManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    SelEx ex = new SelEx();
    String[] result = ex.selEx();
    String name = result[0];
    String addr = result[1];
    String phon = result[2];
%>
<table>
<tr>
    <td><%= name %></td>
    <td><%= addr %></td>
    <td><%= phon %></td>
</tr>
</table>
</body>
</html>