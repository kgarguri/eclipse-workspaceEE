package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddressDetailServlet
 */
@WebServlet("/address_detail.do")
public class AddressDetailServlet extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		/*
		http://192.168.15.31/servletSite/address_detail.do?no=45
		 */
		/*
		 * 1.파라메타 바끼(no)
		 * 2.AddressService객체생성
		 * 3.받은파라메타로 AddressService.selectByNo()메쏘드실행
		 * 4.Address객체반환
		 * 5.보여주기
		 */
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>[김경호님 주소록상세보기]</h1><hr>");
		out.println("<div>");
		out.println("	<a href='address_delete_action.do?no=1'>김경호님삭제[GET]</a>");
		out.println("	<a href='address_update_form.do'>[김경호님 주소록수정폼]</a>");
		out.println("	<a href='address_insert_form.do'>[주소록쓰기폼]</a>");
		out.println("	<a href='address_list.do'>[주소록리스트]</a>");
		out.println("</div>");
		out.println("<p>");
		out.println("	번호:1<br>");
		out.println("	아이디:guard<br>");
		out.println("	이름:김경호<br>");
		out.println("	전화:123-4568<br>");
		out.println("	주소:경기도 성남시<br>");
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
