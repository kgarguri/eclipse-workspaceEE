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
		
		String sex;
		if (gender.equals("M")) {
			sex = "남";
		} else {
			sex = "여";
		}
		/*
		 * service 메쏘드 호출
		 */
		
		/*
		 * 3. 클라이안트 결과 전송
		 */
		/*
		out.println("<ul>");
		out.println("<li>아이디:"+id+"</li>");
		out.println("<li>이름:"+name+"</li>");
		out.println("<li>주소:"+addr+"</li>");
		out.println("<li>성별:"+sex+"</li>");
		out.println("<li>직업:"+job+"</li>");
		for (int i = 0; i < hobbies.length; i++) {
			out.println("<li>취미:"+hobbies[i]+"</li>");
		}
		out.println("</ul>");
		*/

		
		out.println("<BODY>");
		out.println("<table border=1 align=center>");
		out.println("<tr><td colspan=2>"+id+"님 가입정보</td></tr>");
		out.println("<tr><td>항목</td><td>값</td></tr>");
		out.println("<tr><td>아이디</td><td>"+id+"</td></tr>");
		out.println("<tr><td>이름</td><td>"+name+"</td></tr>");
		out.println("<tr><td>주소</td><td>"+addr+"</td></tr>");
		out.println("<tr><td>성별</td><td>"+sex+"</td></tr>");
		out.println("<tr><td>직업</td><td>"+job+"</td></tr>");
		out.println("<tr><td rowspan="+hobbies.length+">취미</td>");
		for (int i = 0; i < hobbies.length; i++) {
			out.println("<td>"+hobbies[i]+"</td></tr>");
		}
		out.println("</table>");

		
	}

}
