package test;

import java.util.Vector;

import dao.BoardV2_DAO;
import vo.BoardVO;

public class TestMain {
	public static void main(String[] args) {
		BoardV2_DAO dao = new BoardV2_DAO();
		
		Vector<BoardVO> list = dao.getAllData(1, 10);
		
		for(BoardVO vo : list) {
			System.out.println(vo.getTitle());
		}
	}
}
