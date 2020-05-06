package d20200421;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi.jsp")
public class HiServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		out.println("<html>" + 
				"<head>");
		out.println("<title>이게 맞냐");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>"
				+ "<h1>내가 두번째 만든 서블릿 프로그램</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
