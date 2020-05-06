package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InsertAction;

@WebServlet("/custom.do")
public class CustomerJoin extends HttpServlet{
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

	private void doProcess(HttpServletRequest req, HttpServletResponse resp) {
		// 등록 작업을 수행할 수 있는 model 호출
		InsertAction ia = new InsertAction();
		String viewPage = ia.execute(req, resp);
		
		// view forwarding
		RequestDispatcher	rd = req.getRequestDispatcher(viewPage);
		try {
			rd.forward(req, resp);
			
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
		
		
		
	}// doProcess() end
	
	
}
