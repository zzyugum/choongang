<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="web.static0531.*" %>

<%

Singleton st = Singleton.getInstance();

String name = request.getParameter("name");
String bunho = request.getParameter("bunho");
int index = Integer.parseInt(bunho);
String kor = request.getParameter("kor");
int kscore = Integer.parseInt(kor);
String math = request.getParameter("math");
int mscore = Integer.parseInt(math);
String eng = request.getParameter("eng");
int escore = Integer.parseInt(eng);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
st.stu[index].name = name;
st.stu[index].kor = kscore;
st.stu[index].math = mscore;
st.stu[index].eng = escore;
%>

</body>
</html>