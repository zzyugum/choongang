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
		Connection con = null;
		String url = "jdbc:mariadb://localhost:3307/jspdb";
		String user = "root";
		String pass = "maria";
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("드라이버 로딩!");
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("접속 성공!");
		Statement stmt = con.createStatement();
		ResultSet rs = null;
		String sql = "select * from person";
		rs = stmt.executeQuery("SELECT * FROM person");
		
		%>
		<table border = "1"><%
		while(rs.next()) {
		String name = rs.getString("name");
		String addr = rs.getString("addr");
		String phon = rs.getString("phon");
		%>
		<tr>
		<td><%=name %></td>
		<td><%=addr %></td>
		<td><%=phon %></td>
		</tr>
		<%}%>
		</table>

</body>
</html>