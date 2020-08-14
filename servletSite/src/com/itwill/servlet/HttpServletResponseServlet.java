package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletResponseServlet
 */
@WebServlet("/response.do")
public class HttpServletResponseServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		String cmd = request.getParameter("cmd");
		if (cmd ==null) cmd = "";
		
		if(cmd.equals("1")) {
			out.println("<h3>정상응답</h3><hr>");
		}else if(cmd.equals("2")) {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			/*
			 * 1. 응답 라인
			 * 2. 응답 헤더
			 * 3. 응답 바다데이터는 제외하고 전송한다
			 */
		}else if(cmd.equals("3")) {
			/*  <<Redirect>>
			 * 1. 응답 라인  302
			 * 2. 응답 헤더  (redirection url 응답)
			 * 3. 응답 바다데이터는 제외하고 전송한다
			 */
			//response.sendRedirect("http://192.168.15.7/servletSite/index.html");
			response.sendRedirect("index.html");
		}else {
			response.sendRedirect("04.HttpServletResponse.html");
		}
		
		
	}

}

