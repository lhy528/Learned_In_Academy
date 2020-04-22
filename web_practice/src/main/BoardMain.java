package main;

import dao.BoardDAO;
import vo.BoardVO;

public class BoardMain {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		
		//게시글 입력 테스트
//		BoardVO vo = new BoardVO();
//		vo.setTitle("모이세여");
//		vo.setWriter("유관순");
//		vo.setContents("아오내 장터로 모이세요 ㅎㅎㅎ");
//		vo.setIp("170.0.0.1");
//		
//		dao.addData(vo);
//		
//		System.out.println(vo.toString());
	}
}
