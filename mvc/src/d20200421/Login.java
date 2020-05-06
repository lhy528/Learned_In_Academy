package d20200421;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/w20200421/loginOk.do")
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) // 부모로부터의 메소드를 사용하려면 메소드 오버라이딩
			throws ServletException, IOException {
		
		// 전달받은 내용을 추출
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		// encoding
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>" + 
				"<head>");
		out.println("<title>Login Result");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>"
				+ "<h1>당신의 아이디는" + id + "입니다</h1>"
		+ "<h1>당신의 비밀번호는" + pw + "입니다</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
