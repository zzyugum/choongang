<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "web.polymorphism0606.*" %>
<%
String animal = request.getParameter("animal");
Feed feed = new Feed();
Animal cat = new Cat();
Animal dog = new Dog();
Animal lion = new Lion();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(animal.equals("Cat")){
		%><%=feed.feed(cat) %><%
	} else if(animal.equals("Dog")){
		%><%=feed.feed(dog) %><%
	}else if(animal.equals("Lion")){
		%><%=feed.feed(lion) %><%
	}
	
%>
</body>
</html>