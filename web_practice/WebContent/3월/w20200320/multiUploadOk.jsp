<%@page import="java.awt.event.ItemEvent"%>
<%@page import="org.apache.commons.fileupload.FileUpload"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  <meta charset="UTF-8">
  <title>multiUploadOk</title>
  </head>
  <body>
    <%
    	String saveDir = request.getRealPath("multiupload");
    	out.println(saveDir);
    	
    	//commons 사용 - 호출
    	DiskFileItemFactory factory = new DiskFileItemFactory();
    	
    	//파일 업로드 핸들러(commons) -서블릿 지원-
    	ServletFileUpload upload = new ServletFileUpload(factory);
    	
    	//한글 인코딩
    	upload.setHeaderEncoding("UTF-8");
    	
    	//요청 확인 (아파치의 함수)
    	boolean isMultiOk = FileUpload.isMultipartContent(request);//여러개인지 확인하는 메소드
    	
    	//파일 이름
    	String fileName = "";
    	if(isMultiOk){//값(파일)이 여러개인 경우
    		List<FileItem> list = upload.parseRequest(request);
    		//FileItem 이 친구는 이름만 다를뿐 VO역할을 함
    		Iterator<FileItem> iterator = list.iterator();
    		
    		while(iterator.hasNext()){
    			FileItem item =  iterator.next();
//     			out.println(item.getName());

				fileName = new File(item.getName()).getName();
				File filePathAndName = new File(saveDir+"\\"+fileName);
				item.write(filePathAndName);
				out.println(item.getName());
    		}
    	}
    %>
  </body>
</html>
