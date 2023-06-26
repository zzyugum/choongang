<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<%@ page import="oraTest0623.*" %>
<%
	ScoreServiceImp service = new ScoreServiceImp();
	String name = request.getParameter("name");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int math = Integer.parseInt(request.getParameter("math"));
	ScoreDto dto = new ScoreDto(service.maxnum(), name, kor, eng, math);
	service.insert(dto);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="refresh" content="0.1;url=list.jsp">
<title>Insert title here</title>
</head>
<body>

</body>
</html>