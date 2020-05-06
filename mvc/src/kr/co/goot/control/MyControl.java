package kr.co.goot.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.goott.action.IpAction;
import kr.co.goott.action.TestAction;
import kr.co.goott.action.TimeAction;

// 서블릿 작성방법
// 1. 서블릿 상속(HttpServlet, GenericServlet)
// 2. method override
// 3. WebServlet annotation

@WebServlet("/mc.do")
public class MyControl extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doProcess(req,resp);
	} // doGet() end
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doProcess(req,resp);
	} // doPost() end
	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) {
		String cmd = req.getParameter("cmd"); // URI방식은 물음표로 뒤에 써주는것
		TestAction ta = null;
		IpAction ia = null;
		TimeAction tia = null;
		String viewPage = null;
		
		// Model 호출
		if(cmd==null || cmd.equalsIgnoreCase("hello")) {
			ta = new TestAction();
			viewPage = ta.execute(req, resp);
		}else if(cmd.equalsIgnoreCase("ip")) {
			ia = new IpAction();
			viewPage = ia.execute(req, resp);
		}else if(cmd.equalsIgnoreCase("time")) {
			tia = new TimeAction();
			viewPage = tia.execute(req, resp);
		}
		
		
		
		// forwarding
		RequestDispatcher rd = req.getRequestDispatcher(viewPage);
		try {
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {

			e.printStackTrace();
		}
	}
}
