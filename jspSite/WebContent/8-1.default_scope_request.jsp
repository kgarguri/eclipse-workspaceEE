
<%--@page import="com.itwill.student.Student"--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>SCOPE request객체</h1>
<hr>
<ol>
	<li>page:<%=pageContext.getAttribute("pageStStudent")%></li>
	<li>request:<%=request.getAttribute("requestStStudent")%></li>
	<li>session:<%=session.getAttribute("sessionStStudent")%></li>
	<li>application:<%=application.getAttribute("applicationStStudent")%></li>
</ol> 
<br/>


</body>
</html>







