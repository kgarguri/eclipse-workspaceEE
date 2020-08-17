package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.address.Address;
import com.itwill.address.AddressService;

/**
 * Servlet implementation class AddressInsertActionServlet
 */
@WebServlet("/address_insert_action.do")
public class AddressInsertActionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("address_insert_form.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// <<   action.do 인 경우 응답이 없다. >>
			
			//response.setContentType("text/html;charset=UTF-8");
			//PrintWriter out = response.getWriter();
			/*
			 * 0. 요펑객체의 encoding 설정
			 * 1.파라메타 바끼
			 * 2.AddressService객체생성
			 * 3.파라메타데이타로 Addess객체생성
			 * 4.AddressService.create()메쏘드실행
			 * 5.adress_list.do로 redirection
			 */
			request.setCharacterEncoding("UTF-8");
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");
			AddressService addressService = new AddressService();
			addressService.create(new Address(id, name, phone, address));
			response.sendRedirect("address_list.do");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("address_error.html");
		}
		
	}

}














