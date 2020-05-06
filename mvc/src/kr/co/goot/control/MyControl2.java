package kr.co.goot.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.goott.action.DBAction;
import kr.co.goott.model.IpAction;
import kr.co.goott.model.TimeAction;

@WebServlet("/mc2.do")
public class MyControl2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doProcess(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doProcess(req, resp);
		
	}
	private void doProcess(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String viewpage = null;
		
		String cmd = req.getParameter("cmd");
		
		if(cmd==null||cmd.equalsIgnoreCase("ip")) {
			viewpage = new IpAction().execute(req, resp);
		}else if(cmd.equalsIgnoreCase("time")) {
			viewpage = new TimeAction().execute(req, resp);
		}else if(cmd.equalsIgnoreCase("select")) {
			viewpage = new DBAction().execute(req, resp);
		}
		
		RequestDispatcher rd = req.getRequestDispatcher(viewpage);
		rd.forward(req, resp);
	}
	
}
