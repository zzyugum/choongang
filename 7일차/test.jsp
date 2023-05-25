<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="static0525.*" %>
<%
String num1 = request.getParameter("num1");
int score1 = Integer.parseInt(num1);
String num2 = request.getParameter("num2");
int score2 = Integer.parseInt(num2);
String num3 = request.getParameter("num3");
int score3 = Integer.parseInt(num3);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
 <link rel="stylesheet" href="css.css" />
</head>
<body>
<%
Test.arr[0] = score1;
Test.arr[1] = score2;
Test.arr[2] = score3;
%><table><tr><th>최고 점수</th><th>평균 점수</th></tr><%
int max = 0;
for (int i = 0; i<Test.arr.length; i++ ) {
	if(i == 0) {
		max = Test.arr[i];
	
	}else if(Test.arr[i]>Test.arr[i-1]) {
		max = Test.arr[i];
	}else {
		max = Test.arr[i-1];
	}
}
out.println(max);
double sum = 0.0;
double avg = 0.0;
	for(int i = 0; i<Test.arr.length; i++) {
		sum += Test.arr[i];
		avg = sum/Test.arr.length;
	} out.println(avg);
%></table>
</body>
</html>