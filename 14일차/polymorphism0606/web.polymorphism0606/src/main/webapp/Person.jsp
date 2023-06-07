<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="web.polymorphism0606.*"%>
<%
String name = request.getParameter("Name");
String adress = request.getParameter("Adress");
String phon = request.getParameter("Phon");
String email = request.getParameter("Email");
int birthday = Integer.parseInt(request.getParameter("Birthday"));
%>
<%
Person person = new Person(name,adress,phon,email,birthday);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" >
<title>Insert title here</title>
 <meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
	<link rel="stylesheet" href="Css.css">
</head>
<body>

<table class="container">
<tr>
	<th class="text-left">이름</th>
	<th class="text-left">주소</th>
	<th class="text-left">전화번호</th>
	<th class="text-left">이메일</th>
	<th class="text-left">생일</th>
</tr>
<tr>
	<td class="text-left"><%=person.getName() %></td>
	<td class="text-left"><%=person.getAdress() %></td>
	<td class="text-left"><%=person.getPhon() %></td>
	<td class="text-left"><%=person.getEmail() %></td>
	<td class="text-left"><%=person.getBirthday() %></td>
</tr>

</table>
</body>
</html>