package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import vo.BoardVO;
import connection.GOOTT7XEConnection;
import connection.OracleXEConnection;

public class BoardDAO {
	
	StringBuffer sb= new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn= null;
	
	public BoardDAO() {
		conn = GOOTT7XEConnection.getInstance().getConnection();
		
	}
	
	public void addData(BoardVO vo) {
		sb.setLength(0);
		sb.append("insert into board ");
		sb.append("values (board_bno_seq.nextval , ?,?,?, sysdate,?,0,0) ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContents());
			pstmt.setString(4, vo.getIp());
			//pstmt.setInt(5, vo.getStatus());
			//pstmt.setInt(6, vo.getHits());
			
			pstmt.executeUpdate();
			
			System.out.println("게시글 DB저장완료");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//전체 게시글 조회 - getAllData()
	public Vector<BoardVO> getAllData(){
		Vector<BoardVO> list = new Vector<BoardVO>();
		
		sb.setLength(0);
		sb.append("select * from board ");
		sb.append("order by bno desc ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int bno = rs.getInt(1);
				String title = rs.getString(2);
				String writer = rs.getString(3);
				String contents = rs.getString(4);
				String regdate = rs.getString(5);
				String ip = rs.getString(6);
				int status = rs.getInt(7);
				int hits = rs.getInt(8);
				
				BoardVO vo = new BoardVO(bno, title, writer, contents, regdate, ip, status, hits);
				
				list.add(vo);
				
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	//게시글 번호로, 데이터 한 건 조회 메소드.
	public BoardVO getData(int bno) {
		sb.setLength(0);
		sb.append("select * from board ");
		sb.append("where bno = ?");
		BoardVO vo = null;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			
			rs.next();

			String title = rs.getString(2);
			String writer = rs.getString(3);
			String contents = rs.getString(4);
			String regdate = rs.getString(5);
			String ip = rs.getString(6);
			int status = rs.getInt(7);
			int hits = rs.getInt(8);
			
			vo = new BoardVO(bno, title, writer, contents, regdate, ip, status, hits);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return vo;
	}
	
	// 게시글 수정 메소드 - (제목, 내용)
	public void modifyData(BoardVO vo) {
		sb.setLength(0);
		sb.append("update board ");
		sb.append("set title = ? , contents = ?");
		sb.append("where bno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContents());
			pstmt.setInt(3, vo.getBno());
			
			pstmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//게시글 삭제 메소드
	public void deleteData(int bno) {
		sb.setLength(0);
		sb.append("delete board ");
		sb.append("where bno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);

			pstmt.executeUpdate();
			
			System.out.println("삭제 완료");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
}
