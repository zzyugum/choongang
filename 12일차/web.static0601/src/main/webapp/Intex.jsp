<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="web.static0601.*"  %>
<%
Singleton st = Singleton.getInstance();
String name = request.getParameter("name");
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String math = request.getParameter("math");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="">
이름<input type="text" name = "name" />
국어<input type="text" name = "kor" />
영어<input type="text" name = "eng" />
수학<input type="text" name = "math" />
<input type="submit" />
</form>
<%
if(kor!=null || eng!=null || math!=null){
int index = st.getIndex();
st.stu[index].setName(name);
st.stu[index].setKor(Integer.parseInt(kor));
st.stu[index].setEng(Integer.parseInt(eng));
st.stu[index].setMath(Integer.parseInt(math));
}
%>
<table border = "1">
<%
for (int i= 0 ; i< st.stu.length; i++){
%>
<tr><td><%=st.stu[i].getName() %></td>
<td><%=st.stu[i].getKor() %></td>
<td><%=st.stu[i].getMath()%></td>
<td><%=st.stu[i].getEng()%></td>
<td><%=st.stu[i].sum()%></td>
<td><%=st.stu[i].avg()%></td>
<td>
<% for (int j = 0; j < st.stu.length; j++) {
    if (i != j) {
        int compareResult = st.stu[i].sum() - st.stu[j].sum();
        if (compareResult > 0) {
            out.println(st.stu[i].getName() + " 점수가 더 높음");
        } else if (compareResult < 0) {
            out.println(st.stu[j].getName() + " 점수가 더 높음");
        } else {
            out.println("동일한 점수");
        }
    }
}
%>

</td>
<%} %>
</table>
</body>
</html>