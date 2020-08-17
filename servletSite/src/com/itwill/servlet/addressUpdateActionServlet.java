package com.itwill.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.address.Address;
import com.itwill.address.AddressService;

/**
 * Servlet implementation class addressUpdateActionServlet
 */
@WebServlet("/address_update_action.do")
public class addressUpdateActionServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("address_main.html");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// <<   action.do 인 경우 응답이 없다. >>
		
		//response.setContentType("text/html;charset=UTF-8");
		//PrintWriter out = response.getWriter();
		/*
		 * 0. 요청객체의 encoding 설정
		 * 1.파라메타 바끼
		 * 2.AddressService객체생성
		 * 3.파라메타데이타로 Addess객체생성
		 * 4.AddressService.update()메쏘드실행
		 * 5.address_view.do로 redirection
		 */
		try {
			request.setCharacterEncoding("UTF-8");
			String no = request.getParameter("no");
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");
			Address updateAddress = new Address(Integer.parseInt(no), id, name, phone, address);
			AddressService addressService = new AddressService();
			addressService.update(updateAddress);
			response.sendRedirect("address_detail.do?=no="+no);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response.sendRedirect("address_error.html");
		}
		
		
		
		
	}

}
