package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.DeleteAction;
import action.DetailAction;
import action.InsertFormAction;
import action.ListAction;
import action.ModifyAction;
import action.ModifyFormAction;
import action.WriteAction;

@WebServlet("/board.do")
public class BoardControl extends HttpServlet {

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
	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cmd = req.getParameter("cmd");
		String viewPage = null;
		Action model = null;
		
		if(cmd==null||cmd.equalsIgnoreCase("list")) {
			// 전체 리스트 페이지
			model = new ListAction();
		}else if(cmd.equalsIgnoreCase("insertForm")) {
			// 글 작성 form 페이지
			model = new InsertFormAction();
		}else if(cmd.equalsIgnoreCase("insert")) {
			// 실제 글 작성 기능 수행
			model = new WriteAction();
		}else if(cmd.equalsIgnoreCase("detail")) {
			// 게시글 자세히 보기
			model = new DetailAction();
		}else if(cmd.equalsIgnoreCase("modifyOk")) {
			// 게시글 수정하기
			model = new ModifyAction();
		}else if(cmd.equalsIgnoreCase("modify")) {
			// 게시글 수정창 들어가기
			model = new ModifyFormAction();
		}else if(cmd.equalsIgnoreCase("delete")) {
			// 삭제 수행 후 페이지 이동
			model = new DeleteAction();
		}
		viewPage = model.execute(req, resp); // 어차피 모든 if경우에 똑같은 라인이므로 밖으로 빼도 된다
		
		//페이지 이동
		RequestDispatcher rd = req.getRequestDispatcher(viewPage);
		rd.forward(req, resp);
		
	}
}
