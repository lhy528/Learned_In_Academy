package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardV2_DAO;
import vo.BoardVO;

public class ModifyAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String title = req.getParameter("ti");
		String contents = req.getParameter("ct");
		int bno = Integer.parseInt(req.getParameter("bno"));
		
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setContents(contents);
		vo.setBno(bno);
		
		BoardV2_DAO dao = new BoardV2_DAO();
		dao.modifyData(vo);
		
		req.setAttribute("vo", vo);
		
		return "/boardV2/modifyOk.jsp";
//		return "/boardV2/detail.jsp?bno="+bno;
	}

}
