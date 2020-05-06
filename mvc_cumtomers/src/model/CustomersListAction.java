package model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.CustomersDAO;
import vo.CustomersVO;

public class CustomersListAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		CustomersDAO dao = new CustomersDAO();
		ArrayList<CustomersVO> list = dao.getAllCustomers();
		
		req.setAttribute("list", list);
		
		return "/customersList.jsp";
	}
}
