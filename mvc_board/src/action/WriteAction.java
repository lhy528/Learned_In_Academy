package action;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardV2_DAO;
import vo.BoardVO;

public class WriteAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		// 사용자가 입력한 데이터 받아오기
		String writer = req.getParameter("wr");
		String title = req.getParameter("ti");
		String contents = req.getParameter("ct");
		
		InetAddress ia = null;
		String ip = null;
		try {
			ia = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ip = ia.getHostAddress();
		
		BoardVO vo = new BoardVO();
		vo.setWriter(writer);
		vo.setTitle(title);
		vo.setContents(contents);
		vo.setIp(ip);
		
		BoardV2_DAO dao = new BoardV2_DAO();
		dao.addData(vo);
		
		req.setAttribute("vo", vo);
		return "/boardV2/writeOk.jsp";
	}
}
