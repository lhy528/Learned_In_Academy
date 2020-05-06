package d20200421;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/w20200421/movie.do")
public class Movie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String name = req.getParameter("name");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>" + 
				"<head>");
		out.println("<title>movie Result");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>"+"<h1>");
		if(name.equals("1917")) {
			out.println("<img src='image/movie_image1.jpg' style='width : 200px'>");
		}else if(name.equals("라라랜드")) {
			out.println("<img src='image/movie_image2.jpg' style='width : 200px'>");
		}
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
