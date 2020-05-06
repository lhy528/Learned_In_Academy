package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import vo.CustomersVO;

public class LogoutAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		CustomersVO vo = (CustomersVO)session.getAttribute("emp");
		req.setAttribute("name", vo.getId());
		session.invalidate();
		
		return "logout.jsp";
	}
}
