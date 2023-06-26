<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="oraTest0623.*" %>
<%
		ScoreServiceImp service = new ScoreServiceImp();
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table     { width:450px; text-align:center; }
        th        { background-color:cyan; }
      
        .num      { width:130px; }
        .name     { width:130px; }
        .kor      { width:130px; }
        .eng      { width:80px; }
        .math     { width:80px; }
                
        a:link    { text-decoration:none; color:blue; }
        a:visited { text-decoration:none; color:gray; }
        a:hover   { text-decoration:none; color:red;  }
    </style>
</head>
<body>

<table border = "1">
    <tr>
  		<th></th>
        <th class="num" >과목별 최대 점수</th>
        <th class="name">과목별 평균</th>
        <th class="kor" >전체 평균</th>
    </tr>
    <tr>
    	<th>국어</th>
    	<td><%=service.maxkor() %></td>
    	<td><%=service.avgkor() %></td>
    	<td rowspan ="4"><%=String.format("%.1f",service.totalavg())%></td>
    <tr>
    <tr>
        <th>수학</th>
        <td><%=service.maxmath() %></td>
    	<td><%=service.avgmath() %></td>

    </tr>
    <tr>
        <th>영어</th>
         <td><%=service.maxeng() %></td>
    	<td><%=service.avgeng() %></td>

    </tr>
    
</table>
</body>
</html>