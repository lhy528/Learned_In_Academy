package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardV2_DAO;

public class DeleteAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		int bno = Integer.parseInt(req.getParameter("bno"));
		BoardV2_DAO dao = new BoardV2_DAO();
		dao.deleteData(bno);
		return "/boardV2/deleteOk.jsp";
	}
}
