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
//HandleStu.create();
for(Student num : st.stu){
	out.println(num.name);
	out.println(num.kor);
	out.println(num.math);
	out.println(num.eng);
	out.println("<br/>");
}
%>
</body>
</html>