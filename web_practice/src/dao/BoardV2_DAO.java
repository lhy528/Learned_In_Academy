package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import vo.BoardVO;
import connection.OracleXEConnection;



public class BoardV2_DAO {
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	public BoardV2_DAO() {
		//nn = GOOT7XEConnection().getInstance().getConnection();
		conn = OracleXEConnection.getInstance().getConnection();
	}
	
	//게시글 입력
	public int addData(BoardVO vo) {
		int result = -1;
		sb.setLength(0);
		sb.append("insert into board ");
		sb.append("values (board_bno_seq.nextval, ?, ?, ?, sysdate, ?, 0, 0) ");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContents());
			pstmt.setString(4, vo.getIp());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}//addData 끝
	
	//전체 게시글 조회
	public Vector<BoardVO> getAllData(int startNo, int endNo) {
		Vector<BoardVO> list = new Vector<BoardVO>();
		sb.setLength(0);
		sb.append("select * ");
		sb.append("from(select rownum rn, bno, title, writer, contents, ip, hits, regdate, status ");
		sb.append("		from (select * from board ");
		sb.append("				ORDER by bno desc) ");
		sb.append("		where rownum <= ?) ");
		sb.append("where rn >= ? ");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, endNo);
			pstmt.setInt(2, startNo);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title") ;
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				String regdate = rs.getString("regdate");
				String ip = rs.getString("ip");
				int status = rs.getInt("status");
				int hits = rs.getInt("hits");
				
				BoardVO vo = new BoardVO(bno, title, writer, contents, regdate, ip, status, hits);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//총 게시물  파악 메소드
	public int getTotalCount() {
		sb.setLength(0);
		sb.append("select count(*) cnt ");
		sb.append("from board ");
		int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			rs.next();
//			cnt = rs.getInt(1); (x?)
			cnt = rs.getInt("cnt");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}
	
	//데이터 1건 조회
	public BoardVO getData(int bno) {
		BoardVO vo = null;
		sb.setLength(0);
		sb.append("select * from board ");
		sb.append("where bno = ? ");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			rs.next();
			
			vo = new BoardVO(rs.getInt(1), rs.getString(2), 
							rs.getString(3), rs.getString(4), 
							rs.getString(5), rs.getString(6), 
							rs.getInt(7), rs.getInt(8));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	
	//데이터 수정
	public void modifyData(BoardVO vo) {
		sb.setLength(0);
		sb.append("update board ");
		sb.append("set title = ?, contents = ? ");
		sb.append("where bno = ? ");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContents());
			pstmt.setInt(3, vo.getBno());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//게시글 번호로 삭제
	public void deleteData(int bno) {
		sb.setLength(0);
		sb.append("delete board ");
		sb.append("where bno = ? ");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//조회수 증가 메소드.
	public void raiseHits(int bno) {
		sb.setLength(0);
		sb.append("update board ");
		sb.append("set hits = hits+1 ");
		sb.append("where bno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}//raiseHits End
	
	public void status(int bno) {
		sb.setLength(0);
		sb.append("update board ");
		sb.append("set status = 1 ");
		sb.append("where bno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			pstmt.executeUpdate();
			
			System.out.println("dao.status 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
