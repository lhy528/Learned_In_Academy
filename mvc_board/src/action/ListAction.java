package action;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardV2_DAO;
import vo.BoardVO;

public class ListAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		// 현재 페이지 얻어오기
		String cp = req.getParameter("cp");

		int currentPage = 0;
		if(cp!=null){
			currentPage = Integer.parseInt(cp);
		}else{ 
			currentPage = 1;
		}
		BoardV2_DAO dao2 = new BoardV2_DAO();
		
		// 총 게시글 수
		int totalCount = dao2.getTotalCount();
		
		// 한 페이지당 레코드 수 : 10
		int recordByPage = 10;
		
		//총 페이지 수
		int totalPage = 
			(totalCount%recordByPage==0)?totalCount/recordByPage:totalCount/recordByPage+1;
		// 3항 연산자!! (조건)?true:false;
		
		// 현재페이지의 레코드 시작-끝번호
		int startNo = (currentPage-1)*recordByPage+1;
		int endNo = (currentPage-1)*recordByPage+1+recordByPage;
		
		// DBMS에 있는 게시글 데이터 얻기
		Vector<BoardVO> list = dao2.getAllData(startNo, endNo);
		
		// 요청 객체에 set
		req.setAttribute("list", list);
		req.setAttribute("cp", cp);
		
		return "/boardV2/list.jsp";
	}
}
