package d20200421;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/printHobby.do")
public class Hobby extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		String ho = req.getParameter("hobby");
 
		PrintWriter out = resp.getWriter();
		
		out.println("<html>" + 
				"<head>");
		out.println("<title>Hobby Result");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>"
				+ "<h1>당신의 취미는" + ho + "입니다</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
