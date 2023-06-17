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
<form action = "Update.jsp"><table>
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
	<button type = "button" onclick = "location.href='Delete.jsp?id=<%=id%>'">삭제</button>
	<script>
  function showAlert() {
    alert('알림 메시지');
  }
</script>
	<a href = "list.jsp"><input type="button" value = "되돌아가기"></a>



</form>
</body>
</html>