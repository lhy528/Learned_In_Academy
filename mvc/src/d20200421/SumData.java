package d20200421;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/numInput.do")
public class SumData extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		int num = Integer.parseInt(req.getParameter("num"));
		int sum = 0;
		PrintWriter out = resp.getWriter();
		for(int i=0; i<=num;i++) {
			sum = sum + i;
		}
		
		out.println(num+"까지의 합계는 "+sum+" 입니다.");
	}
}
