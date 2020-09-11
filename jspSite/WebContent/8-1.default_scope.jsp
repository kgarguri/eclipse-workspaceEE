
<%@page import="com.itwill.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	Student pageStStudent=new Student();
	Student requestStStudent=new Student();
	Student sessionStStudent=new Student();
	Student applicationStStudent=new Student();

	pageContext.setAttribute("pageStStudent", pageStStudent);	   				//page
	request.setAttribute("requestStStudent", requestStStudent);  				//request
	session.setAttribute("sessionStStudent", sessionStStudent); 				//session
	application.setAttribute("applicationStStudent", applicationStStudent);	    //application
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>SCOPE객체</h1>
<hr>
<ol>
	<li>page:<%=pageContext.getAttribute("pageStStudent")%></li>
	<li>request:<%=request.getAttribute("requestStStudent")%></li>
	<li>session:<%=session.getAttribute("sessionStStudent")%></li>
	<li>application:<%=application.getAttribute("applicationStStudent")%></li>
</ol> 
<br/>
include
<hr/>
<jsp:include page="8-1.default_scope_request.jsp"></jsp:include>
<hr/>
include
<a href='8-1.default_scope_page_session_application1.jsp'>8-1.default_scope_page_session_application1.jsp</a><br/>

</body>
</html>







