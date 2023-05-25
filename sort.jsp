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
String num4 = request.getParameter("num4");
int score4 = Integer.parseInt(num4);
String num5 = request.getParameter("num5");
int score5 = Integer.parseInt(num5);
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

Test.arr = new int[5];
Test.arr[0] = score1;
Test.arr[1] = score2;
Test.arr[2] = score3;
Test.arr[3] = score4;
Test.arr[4] = score5;

int b= 0;
for(int j = Test.arr.length;j>0 ; j--){
for(int i = 0;i<Test.arr.length-1;i++){
	if(Test.arr[i]>Test.arr[i+1]) {
		b= Test.arr[i+1];
		Test.arr[i+1]=Test.arr[i];
		Test.arr[i] = b;
	}
}
}
%><table><%
for (int i = 0; i<Test.arr.length; i++) {
%><tr><td><%=Test.arr[i]%></td></tr><%		
}
%></table>
</body>
</html>