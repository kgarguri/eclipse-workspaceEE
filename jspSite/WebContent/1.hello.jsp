<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/common.css">
<title>Insert title here</title>
</head>
<body>
<%
for(int i=0;i<100;i++){
	out.println(i);
%>	
	<h3>i Hello JSP[change]</h3>
	<hr/>
<%
}
%>	
<%@ include file="5-6.directive_included_file.jspf" %>
</body>
</html>
