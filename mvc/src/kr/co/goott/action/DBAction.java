package kr.co.goott.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		// DBMS로부터 데이터를 돌려받았다고 치고
		req.setAttribute("uid", "JONES");
		return "/db.jsp";
	}
}
