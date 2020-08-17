package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.address.Address;
import com.itwill.address.AddressService;

/**
 * Servlet implementation class addressUpdateFormServlet
 */
@WebServlet("/address_update_form.do")
public class addressUpdateFormServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		/*
		http://192.168.15.31/servletSite/address_detail.do?no=45
		 * 1.파라메타 바끼(no)
		 * 2.AddressService객체생성
		 * 3.받은파라메타로 AddressService.selectByNo()메쏘드실행
		 * 4.Address객체반환
		 * 5.보여주기
		 */
		request.setCharacterEncoding("UTF-8");
		String no = request.getParameter("no");
		if(no==null || no.equals("")) {
			response.sendRedirect("address_list.do");
			return;
		}
		AddressService addressService = new AddressService();
		Address findaddress = addressService.selectByNo(Integer.parseInt(no));
	
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>[김경호님 주소록 수정폼]</h1><hr>");
		out.println("<hr>");
		out.println("	<div>");
		out.println("		<a href='address_list.do'>[주소록리스트]</a>");
		out.println("	</div>");
		out.println("	<form method='post' action='address_update_action.do'>");
		out.println("		번호----<input type='hidden' name='no' value='"+findaddress.getNo()+"' readonly='readonly' ><br>");  
		out.println("		아이디--<input type='text' name='id' value='"+findaddress.getId()+"'><br>"); 
		out.println("		이름----<input type='text' name='name' value='"+findaddress.getName() +"'><br>"); 
		out.println("		전화번호<input type='text' name='phone' value='"+findaddress.getPhone()+"'><br>"); 
		out.println("		주소----<input type='text' name='address' value='"+findaddress.getAddress()+"'><br> ");
		out.println("		<input type='submit' value='주소록수정'>");
		out.println("		<input type='reset' value='주소록수정폼지우기'>");
		out.println("	</form>");
		out.println("</body>");
		out.println("</html>");		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	}

}
