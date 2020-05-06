package d20200422;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
// 서블릿 작성 방법 복습
// 1. HttpServlet 상속
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/w20200422/wednesday.do")
public class ServletEx01 extends HttpServlet{
	// 2. do~ method ovverride
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 필요한 로직 작성
		doProcess(req, resp);
	} // doGet() end
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doProcess(req, resp);
	} // doPost() end
	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	      req.setCharacterEncoding("UTF-8");
	      resp.setContentType("text/html;charset=UTF-8");
	      
	      //사용자로부터 받은 메세지를 출력하기 위한 변수 생성.
	      String msg = req.getParameter("msg");
	      
	      //출력 객체
	      PrintWriter out = resp.getWriter();
	      
	      out.println("<html>");
	      out.println("<head>");
	      out.println("<title>Hobby Result</title>");
	      out.println("</head>");
	      out.println("<body><h1>Data : "+msg+"</h1></body>");
	      out.println("</html>");

	}
}
