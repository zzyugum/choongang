<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "maria0612.*" %>
    <%
    UpdateEx02 ud = new UpdateEx02();
    int id = Integer.parseInt(request.getParameter("id"));
 	String name = request.getParameter("name");
 	String addr = request.getParameter("addr");
 	String phon = request.getParameter("phon");
 	ud.ud(id, name, addr, phon);
    %>
<!DOCTYPE html>
<html>
<head>
<script>
    alert('<%=id%>번이 수정되엇습니다');

</script>
<meta charset="UTF-8" http-equiv="refresh" content="0.1;url=list.jsp">
<title>Insert title here</title>
</head>
<body>

</body>
</html>