package d20200422;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// now.do - 서블릿 실행시 브라우저에 현재 시각 출력
@WebServlet("/w20200422/now.do")
public class ServletEx02 extends HttpServlet{
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		  out.println("<html>");
	      out.println("<head>");
	      out.println("<title>Hobby Result</title>");
	      out.println("<script>var d = new Date();"
	      		+ "console.log(d);"
	      		+ "document.write('현재시각 : '+d);</script>");
	      out.println("</head>");
	      out.println("<body></body>");
	      out.println("</html>");
	}//doGet() end

}
