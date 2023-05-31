<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="web.static0531.*" %>
<%Singleton st = Singleton.getInstance(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="res.jsp">
번호(0~2)<input type="text" name="bunho" /> <br/>
이름<input type="text" name="name" /> <br/>
국어<input type="text" name="kor" /> <br/>
수학<input type="text" name="math" /> <br/>
영어<input type="text" name="eng" /> <br/>
<input type="submit"/>
</form>
</body>
</html>