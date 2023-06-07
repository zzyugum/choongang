<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String first = request.getParameter("first");
String last = request.getParameter("last");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<th><%=first%>~<%=last %>까지의 합계</th>
	<td>
	<%
	if(first!=null){
	int sum2 = 0;
	int a = Integer.parseInt(first);
	int b = Integer.parseInt(last);
		for(int i = a; i<=b; i++){
		sum2+=i;
	}
	%><%=sum2 %>
	<%}%>
	</td>
</tr>
</table>
</body>
</html>