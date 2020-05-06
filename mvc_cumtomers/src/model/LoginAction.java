package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import dao.CustomersDAO;
import vo.CustomersVO;

public class LoginAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String lev = req.getParameter("lev");
		String viewPage = null;
		
		CustomersDAO dao = new CustomersDAO();
				
		int result = dao.customerCheck(id, pass, lev);
		if(result == 2 || result == 3) {
			CustomersVO vo = dao.getCustomer(id);
			// 로그인 시켜줘
			HttpSession session = req.getSession();
			session.setAttribute("emp", vo);
			session.setAttribute("result", result);
			req.setAttribute("name", vo.getName());
			
			viewPage = "main.jsp";	
		}else {
			viewPage = "login.jsp";
			req.setAttribute("message", "로그인 실패하였습니다(ID와 비밀번호, 사원유형을 확인하세요)");
			// 로그인 시키면 안돼
		}		
		return viewPage;
	}
	
}
