<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.*" %>
<%@ page import="oraTest0623.*" %>
<%ScoreServiceImp service = new ScoreServiceImp(); %>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	width: 680px;
	text-align: center;
}

th {
	background-color: cyan;
}

input {
	width: 100px;
}

.num {
	width: 80px;
}

.name {
	width: 100px;
}

.txnum {
	width: 50px
}

.kor {
	width: 80px;
}

.eng {
	width: 80px;
}

.math {
	width: 80px;
}

a:link {
	text-decoration: none;
	color: blue;
}

a:visited {
	text-decoration: none;
	color: gray;
}

a:hover {
	text-decoration: none;
	color: red;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = 'writeForm.jsp'>
		<table>
			<tr>
				<th class="num">번호</th>
				<th class="name">이름</th>
				<th class="kor">국어</th>
				<th class="eng">영어</th>
				<th class="math">수학</th>
			</tr>
			<tr>
				<td><%=service.maxnum() %></td>
				<td><input type="text" name="name"></td>
				<td><input type="text" name="kor"></td>
				<td><input type="text" name="eng"></td>
				<td><input type="text" name="math"></td>
			</tr>
		</table>
		<input type ="submit" value = "입력 완료">
	</form>
</body>
</html>