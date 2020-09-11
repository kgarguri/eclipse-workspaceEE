package com.itwill.model2.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.summer.Controller;

public class ListController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {

		//Guest guest = new Guest();
		//guestService.list();
		ArrayList list = new ArrayList();
		
		list.add("ddddd");
		list.add("wwww");
		list.add("uuuuu");
		list.add("hhhhhhhhh");
		
		request.setAttribute("list", list);
		
		return "forward:/WEB-INF/views/list.jsp";
	}

}
