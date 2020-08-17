package com.itwill.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.address.AddressService;

/**
 * Servlet implementation class addressDeleteActionServlet
 */
@WebServlet("/address_delete_action.do")
public class addressDeleteActionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 0. 요펑객체의 encoding 설정
		 * 1.파라메타 바끼
		 * 2.AddressService객체생성
		 * 3.파라메타데이타로 Addess객체생성
		 * 4.AddressService.delete()메쏘드실행
		 * 5.adress_list.do로 redirection
		 * 	요청URL==>  http://192.168.15.31/servletSite/address_delete_action.do?no=1
		 */

		try {
		request.setCharacterEncoding("UTF-8");
		String no = request.getParameter("no");
		if(no==null|| no.equals("")) {
			response.sendRedirect("address_main.html");
			return;
		}
		AddressService addressServoce = new AddressService();
		int deleteCount = addressServoce.delete(Integer.parseInt(no));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
