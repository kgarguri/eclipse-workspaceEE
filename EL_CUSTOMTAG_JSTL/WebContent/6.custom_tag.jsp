<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--@ taglib uri="http://www.itwill.co.kr/jsp/simpleTag"  prefix="simple" --%> 
<%@ taglib  uri="/WEB-INF/sampleTag.tld" prefix="sample"%>
<%
	//session.setAttribute("sUserId", "guard");
	session.setAttribute("irum", "고소미");
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>custom tag[사용자 정의 태그]</h1><hr/>
<%-- 
<jsp:forward/>
--%>
-------------hello tag-----------<br>
<sample:hello/>
<sample:hello/>
-------------helloAttr tag -----------<br>
<sample:helloAttr/>
<sample:helloAttr name="김경호"/>
<sample:helloAttr name="장동건"/>
<sample:helloAttr name="${irum}"/>
-------------if tag[body] -----------<br>
<sample:if test="true">
	반드시실행<br>
</sample:if>

<sample:if test="false">
	반드시안실행<br>
</sample:if>

<sample:if test="${sUserId!=null}">
	${sUserId} 님 안녕하세요!!!<br>
</sample:if>
<sample:if test="${sUserId==null}">
	GUEST 님 안녕하세요!!!<br>
</sample:if>

<sample:if test="${sUserId!=null}">
	<a href='logout.jsp'>${sUserId} 님 로그아웃</a>
</sample:if>
<sample:if test="${sUserId==null}">
	<a href='login_form.jsp'>로그인</a>
</sample:if>

</body>

</html>
