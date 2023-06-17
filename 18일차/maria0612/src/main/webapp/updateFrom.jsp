<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "maria0612.*" %>
<%
int id = Integer.parseInt(request.getParameter("id"));
Update update = new Update();
update.update(id);
String name = request.getParameter("name");
String addr = request.getParameter("addr");
String phon = request.getParameter("phon");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "<%if(name != null){
	UpdateEx02 updateex02 = new UpdateEx02();
					updateex02.ud(id, name, addr, phon);}%>"><table>
<tr>
	<th>번호</th>
	<td><input type="text" value = <%=id %> name ="id"></td>
</tr>
<tr>
	<th>이름</th>
	<td><input type="text" value = <%=update.update(id)[0] %> name ="name"></td>
</tr>
<tr>
	<th>주소</th>
	<td><input type="text" value = <%=update.update(id)[1] %> name = "addr"></td>
</tr>
<tr>
	<th>전화번호</th>
	<td><input type="text" value = <%=update.update(id)[2] %> name = "phon"></td>
</tr>
</table>
	<input type="submit" value = "수정">
	<button onclick = "<%Delete del = new Delete();
	del.delete(id);
	response.sendRedirect("list.jsp");%>">삭제</button>
	<a href = "list.jsp"><input type="button" value = "되돌아가기"></a>



</form>
</body>
</html>