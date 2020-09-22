<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.bean.Guest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//scope 객체 --> pagecontext, request, session application
	pageContext.setAttribute("int1", 10);  // 자동 boxing 됨
	pageContext.setAttribute("int2", 50);  // 자동 boxing 됨
	pageContext.setAttribute("double1", 0.5);  // 자동 boxing 됨
	pageContext.setAttribute("double2", 3.14159);  // 자동 boxing 됨
	pageContext.setAttribute("string1", "KIM");  // 자동 boxing 됨
	pageContext.setAttribute("string2", "KIMSIM");  // 자동 boxing 됨
	pageContext.setAttribute("married", true);  // 자동 boxing 됨
	pageContext.setAttribute("age", 16);  // 자동 boxing 됨
	pageContext.setAttribute("weight", 85.54);  // 자동 boxing 됨
	
	Guest guest = null;
	Guest[] emptyArray = new Guest[0];
	
	String emptyStr = "";
	ArrayList emptyList = new ArrayList();
	HashMap emptyMap = new HashMap();
	
	pageContext.setAttribute("nullGuest", guest);
	pageContext.setAttribute("emptyArray", emptyArray);
	pageContext.setAttribute("emptyStr", emptyStr);
	pageContext.setAttribute("emptyList", emptyList);
	pageContext.setAttribute("emptyMap", emptyMap);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EL LIteral(변수), 연산자.............!!!</h1><hr/>
<ul>
	<li>-------변수--------</li>
	<li>${int1}</li>
	<li>${int2}</li>
	<li>${number}</li>
	<li>-------리터럴(상수)--------</li>
	<li>${21484836}</li>
	<li>${8.54782}</li>
	<li>${'문자'}</li>
	<li>${"문자"}</li>
	<li>${'name'}</li>
	<li>${name}</li>
	<li>-------리터럴(상수)--------</li>
	<li>${int1 + int2 + 10}</li>
	<li>${int1 - int2}</li>
	<li>${int1/int2}</li>
	<li>${(int1*int2)/3 - 44}</li>
	<li>${1/2}</li>
	<li>${double1+double2}</li>
	<li>${age >= 16}</li>
	<li>${age < 16 }</li>
	<li>${age gt 16 }</li>
	<li>${age lt 16 }</li>
	<li>${age le 16 }</li>
	<li>${age ge 16 }</li>
	<li>${age >= 16 and age < 10 }</li>
	<li>${age >= 16 && age < 10 }</li>
	<li>${(age >= 16 && age < 10) || (weight >= 70 && weight < 77 ) }</li>
	<li>--------------empty------------</li>
	<li>${empty nullGuest}</li>
	<li>${empty emptyArray}</li>
	<li>${empty emptyStr}</li>
	<li>${empty emptyList}</li>
	<li>${empty emptyMap}</li>
	<li>${empty null}</li>
	<li>${empty ""}</li>
	<li>${empty ''}</li>
	<li>${not empty ''}</li>
	<li>${!empty ''}</li>
	<li>${! empty ''}</li>
	
	
	
</ul>
</body>
</html>