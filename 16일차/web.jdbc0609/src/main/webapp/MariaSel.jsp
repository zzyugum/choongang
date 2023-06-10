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
	String url = "jdbc:mariadb://localhost:3307/jspdb";
	String user = "root";
	String pass = "maria";
	Class.forName("org.mariadb.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, user, pass);
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM emp");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
DELETE FROM users WHERE ID = 1;
 <table>
   <tr>
       <th>번호</th>
       <th>이름</th>
       <th>급여 정보</th>
       <th>전화 번호</th>
   </tr>
   <form action ="">
   <% while (resultSet.next()) { %>
       <tr>
       <%String a =resultSet.getString("empno");%>
           <td><input type="radio" name = "selectedValue" value = <%=resultSet.getString("empno")%>><%= resultSet.getString("empno") %></td>
           <td><%= resultSet.getString("ename") %></td>
           <td><%= resultSet.getString("sal") %></td>
           <td><%= resultSet.getString("phon") %></td>
       </tr>
   <% } %>
   <input type="submit" value = "삭제">
  
</table>
 </form>
   <%
   String selectedValue = request.getParameter("selectedValue");
   if (selectedValue != null) {
	   statement.executeUpdate("DELETE FROM users WHERE ID = " + selectedValue);%
      }
   resultSet.close();
   statement.close();
   connection.close();
	%>

</body>
</html>