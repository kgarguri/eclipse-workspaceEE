<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<--c:redirect url="guest_main.do"/>    
<%
	response.sendRedirect("guest_main.do");
%>