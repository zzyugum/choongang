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
<%
HandleStu.create();
HandleStu.index = 0;
	for(Student st1 : st.stu){
		out.println(st1);
	}
%>
</body>
</html>