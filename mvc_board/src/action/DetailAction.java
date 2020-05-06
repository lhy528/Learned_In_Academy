package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardV2_DAO;
import vo.BoardVO;

public class DetailAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String b = req.getParameter("bno");
		if(b!=null) {
			int bno = Integer.parseInt(b);
			BoardV2_DAO dao = new BoardV2_DAO();
			BoardVO vo = dao.getData(bno);
			
			req.setAttribute("vo", vo);
			
			return "/boardV2/detail.jsp";
			
		}else {
			return "/boardV2/list.jsp";
		}
		
		
	}
}
