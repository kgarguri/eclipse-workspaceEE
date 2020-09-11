<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if (request.getMethod().equalsIgnoreCase("GET")) {
		response.sendRedirect("A.file_upload.jsp");
		return;
	}


	/*
	POST 방식으로 전송되어진 파일을 입력스트림으로 읽어서
	서버의 특정위치에 저장한다.
	C:\\JAVA_PYTHON\\eclipse-workspaceEE\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\jspSite\\upload
	*/
	String saveDerectory = application.getRealPath("upload");

	MultipartRequest multipartRequest = new MultipartRequest(request,saveDerectory,1024*1024*100,"UTF-8");
	/*
	- MultipartRequest객체를 사용해서 업로드를 종료한후에는
	- request.getParameter("name")를 사용할수없다.
	- MultipartRequest객체를 사용해서파라메타를 읽어야한다.
	  ==> multipartRequest.getParameter("name");
	*/
	/*
	<input type=text name=name/>
	<input type=file name=fileone/>
	<input type=file name=filetwo>
	*/
	
	String name1 = request.getParameter("name");
	String name2 = multipartRequest.getParameter("name");
	String filename1=multipartRequest.getFilesystemName("fileone");
	String filename2=multipartRequest.getFilesystemName("filetwo");
	
%>
<h1>Upload Data</h1>
<hr/>
<br/>
<br/>
<br/>
<li>name1:<%=name1 %></li>
<li>name2:<%=name2 %></li>
<li>fileone:<%=filename1 %></li>
<li>filetwo:<%=filename2 %></li>
