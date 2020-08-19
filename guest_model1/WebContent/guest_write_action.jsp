<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	/*
		0 . 요청객체 인코딩설정
		1 . 파라메타받기 
			- 5개받기
		2 . Service객체 메쏘드호출(업무처리)
			- GuestService.insertGuest()
				3 . 요청클라이언트로 응답 
			- 성공:guest_main.jsp 로 redirection
			- 실패:guest_error.jsp로 redirection
	*/
%>

