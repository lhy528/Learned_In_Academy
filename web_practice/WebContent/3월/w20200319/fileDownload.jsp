<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileDownload.jsp</title>
</head>
<body>
	<%
		// 파일이 저장된 경로
		String uploadPath = request.getRealPath("upload");
// 		out.println(uploadPath);
		
		// 다운로드 할 파일 이름
		String fileName = request.getParameter("fileName");
		out.println(fileName);	
		
		// 파일서버에서 파일을 찾기 위한 주소와 그 주소에 있는 파일
		String requestFileAndPath = uploadPath+"\\"+fileName;
		out.println("requestFileAndPath : "+requestFileAndPath);
		
// 		// 한글로 되어있는 파일 처리
// 		String UTF8FileAndPath = new String(requestFileAndPath.getBytes("8859_1"), "UTF-8");
		
		// 브라우저 체크
		boolean IE = request.getHeader("user-agent").indexOf("MSIE") != -1;
		
		// 다운로드 시 파일 이름
		String downLoadFileName = "";
		
		if(IE){
			downLoadFileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", " ");
		}
		
		// 저장될 파일 이름을 브라우저에게...
// 		response.setHeader("Content-Disposition", "attachment; fileName=\""+downLoadFileName+"\";");
		response.setHeader("Content-Disposition", "attachment; fileName=\"" + fileName + "\";");
		
		// 사용자 OS에 다운로드를 할 주소 지정
		String downPath = System.getProperty("user.home").concat("\\Downloads");
		
		// 다운로드 주소 및 파일명 모두 지정
		String filePathAndName = downPath+"\\"+downLoadFileName;
		
		// 파일 완성
		File f = new File(filePathAndName);
		
		// 버퍼 크기 설정
		byte byteStream[] = new byte[1024*1024*20];
		if(f.isFile() && f.length() > 0){
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
			int read = 0;
			while((read = bis.read(byteStream)) != -1){
				bos.write(byteStream, 0, read);
			}
			bis.close();
			bos.flush();
			bos.close();
		}
	%>
	
</body>
</html>