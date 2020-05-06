package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CustomersListAction;
@WebServlet("/list.do")
public class CustomerList extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		CustomersListAction cla = new CustomersListAction();
		
		String viewPage = cla.execute(req, resp);
		
		RequestDispatcher rd = req.getRequestDispatcher(viewPage);
		
		rd.forward(req, resp);
	}
}
