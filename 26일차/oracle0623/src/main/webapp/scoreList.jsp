<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="oraTest0623.*"%>
<%
ScoreServiceImp service = new ScoreServiceImp();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table {
	width: 680px;
	text-align: center;
}

th {
	background-color: cyan;
}

.num {
	width: 80px;
}

.name {
	width: 100px;
}

.max {
	width: 80px;
}

.avg {
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
</head>
<body>

	<table>
		<tr>
			<th class="num">번호</th>
			<th class="name">이름</th>
			<th class="max">총점</th>
			<th class="avg">평균</th>
		</tr>
		<%
		for (int i = 0; i < service.maxnum(); i++) {%>
		<%if (service.selOne(i).getNum() == -1) {

		} else {%>
		<tr>
			<td><%=service.selOne(i).getNum()%></td>
			<td><%=service.selOne(i).getName()%></td>
			<td><%=service.selmaxscore(i)%></td>
			<td><%=String.format("%.1f",service.selavg(i))%></td>
		</tr>
		<%}
		}%>
	</table>
</body>
</html>