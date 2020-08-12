package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 1. http Servlet 상속
 */
public class HelloServlet extends HttpServlet{
	/*
	 * 2. service 메쏘드 제정의
	 */
	@Override
	public void service(HttpServletRequest request,
			            HttpServletResponse response) throws ServletException, IOException {
		/*
		 *  2-1 응답헤더 ContentType 설정
		 */
		response.setContentType("text/html:charset=UTF=8");
		/*
		 *  2-2 클라이언트(웹브러우저) 로 전송할 스트림 생성 \]
		 */
		PrintWriter out = response.getWriter();
		for (int i=0;i<100;i++) {
			/*
			 *  2-3 클라이언트(웹브러우저) 로 데이타 출력
			 */
			out.println("<h3>hellowServlet"+(i+1)+"[text]!!!</h3><hr>");
		}
	}

}
