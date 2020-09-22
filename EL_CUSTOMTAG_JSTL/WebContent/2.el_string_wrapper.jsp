<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	session.setAttribute("sUserId","guard1");
	request.setAttribute("name", "김경호");
	request.setAttribute("age", new Integer(33));   // integer로 boxing 한다
	request.setAttribute("married",new Boolean(true));
	request.setAttribute("weigth", new Double(55.88));
	double height=175.23;
	String address="경기도민";
%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>El String Wrapper 객체 출력.........!!!</h1>
<ol>
	<LI>${sUserId}</li>
	<LI>${name}</li>
	<LI>${name.substring(1)}</li>
	<LI>${age+12}</li>
	<LI>${married}</li>
	<LI>--EL 사용불가능[속성 객체가 아니므로]</li>
	<LI>${heigth}</li>
	<li>${address}</li>
	<li><%=height %></li>
	<li><%=address %></li>
</ol>	
</body>
</html>