package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.CustomersDAO;
import vo.CustomersVO;

public class InsertAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		// business logic + DB connection
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String name = req.getParameter("name");
		String lev = req.getParameter("lev");
		String gender = req.getParameter("gender");
		String phone = req.getParameter("phone");
		
		CustomersVO vo = new CustomersVO(id, pass, name, lev, gender, phone); 
		CustomersDAO dao = new CustomersDAO();
		dao.insertCustomers(vo);
		
		req.setAttribute("custom", vo); // 뭘 등록했는지 객체로...
		
		return "/list.jsp"; // 
	}

}
