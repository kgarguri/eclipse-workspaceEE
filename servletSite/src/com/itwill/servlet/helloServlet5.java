package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.SetContextPropertiesRule;

@WebServlet("/helloServlet5")
public class helloServlet5 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html:charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("11111");
		
		
	}

}
