<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String i = request.getParameter("a");
int gugu = Integer.parseInt(i);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border = "1">
<tr><%
int sum = 0;
for(int j = 1; j <=9; j++){
	sum = 0;
	sum = j * gugu;
	%><td><%=gugu %>X<%=j %>=<%=sum %></td></tr>
<%}%>


</table>

</body>
</html>