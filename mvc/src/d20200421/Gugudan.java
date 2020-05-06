package d20200421;

// 서블릿 생성 방법
// 1. HttpServlet 상속
// 2. do~ override
// 3. @WebServlet() : annotation ★★

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gogudan.do")
public class Gugudan extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		int dan = Integer.parseInt(req.getParameter("dan"));
		
		PrintWriter out = resp.getWriter();
		out.println("<html>" + 
				"<head>");
		out.println("<title>Login Result");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>"+"<h1>");
		for(int i=1; i<=9; i++) {
			out.println(dan+" * "+i+" = "+dan*i+"<br>");
		}
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
