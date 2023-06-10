<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "web.jdbc0609.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border = "1">
	<form action = "MariaDBEx01.jsp">
	<tr>
	<th>번호</th>
	<td><input type="text" name = "empno"></td>
	</tr>
	<tr>
	<th>이름</th>
	<td><input type="text" name = "ename"></td>	
	</tr>
	<tr>
	<th>급여</th>
	<td><input type="text" name = "sal"></td>
	</tr>
	<tr>
	<th>전화번호</th>
	<td><input type="text" name = "phon"></td>
	</tr>
	<td colspan = "2">
	<input type="submit">
	</form>
	<a href="MariaSel.jsp"><button>12</button></a>
	</td>

</table>

</body>
</html>