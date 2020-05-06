package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import dao.CustomersDAO;
import vo.CustomersVO;

public class UpdateInfoAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		CustomersVO vo = (CustomersVO)session.getAttribute("emp");
		
		String id = vo.getId();
		String pass = req.getParameter("pass");
		String phone = req.getParameter("phone");
		
		CustomersDAO dao = new CustomersDAO();
		vo.setId(id);
		vo.setPass(pass);
		vo.setPhone(phone);
		
		dao.updateInfo(vo);
		
		
		return "mypageOk.jsp";
	}
}
