package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class joinServlet
 */
@WebServlet("/join.do")
public class joinServlet extends HttpServlet {

	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		/*******************************************
		  1.요청시에 전송되는 파라메타바끼
		     - 파라메타이름은 input element의 name속성과일치
		      	<input type="text" name="xxx">
		     - join.do?xxx=java
		     - request.getParameter("xxx")
		     
		    << POST방식 파라메타 값 한글인코딩 >>
		      - 요청객체에 문자인코딩설정
		        request.setCharacterEncoding("UTF-8");
		          
		 **************************************************/		
		/*
		 * 1. 파라메타 받기
		 */
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] hobbies = request.getParameterValues("hobby");
		
		/*
		 * service 메쏘드 호출
		 */
		
		/*
		 * 3. 클라이안트 결과 전송
		 */
		
		out.println("<ul>");
		out.println("<li>아이디:"+id+"</li>");
		out.println("<li>이름:"+name+"</li>");
		out.println("<li>주소:"+addr+"</li>");
		out.println("<li>성별:"+gender+"</li>");
		out.println("<li>직업:"+job+"</li>");
		for (int i = 0; i < hobbies.length; i++) {
			out.println("<li>취미:"+hobbies[i]+"</li>");
		}
		out.println("</ul>");
		
	}

}
