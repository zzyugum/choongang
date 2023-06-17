<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "maria0612.*" %>
<%
String name = request.getParameter("name"); 
String addr = request.getParameter("addr"); 
String phon = request.getParameter("phon"); 
if(!"".equals(name) && name != null){
	Insert is= new Insert();
	int aa = is.insert(name, addr, phon);
	if(aa == 1){
		response.sendRedirect("list.jsp");
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "">
<table>
<tr>
	<th>이름</th>
	<td><input type="text" name = name></td>
</tr>
<tr>
	<th>주소</th>
	<td><input type="text" name = addr></td>
</tr>
<tr>
	<th>전화번호</th>
	<td><input type="text" name = phon></td>
</tr>
<tr>
	<td><input type="submit" value = "등록"></td>
</tr>
</table>
</form>
</body>
</html>