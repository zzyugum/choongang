<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "maria0612.*" %>
<%
    Delete del = new Delete();
	int id = Integer.parseInt(request.getParameter("id"));
	del.delete(id);
%>

<!DOCTYPE html>
<html>
<head>
<script>
    alert('<%=id%>번이 삭제되엇습니다');

</script>
<meta charset="UTF-8" http-equiv="refresh" content="0.1;url=list.jsp" >
<title>Insert title here</title>
</head>
<body>

</body>
</html>