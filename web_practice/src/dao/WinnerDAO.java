package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import connection.OracleXEConnection;
import vo.WinnerVO;

public class WinnerDAO {
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	public WinnerDAO() {
		conn = OracleXEConnection.getInstance().getConnection();
	}
	public void addData(WinnerVO vo) {
		sb.setLength(0);
		sb.append("insert into board ");
		sb.append("values (winner_bno_seq.nextval, ?, ?, 1, 0, sysdate) ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(0, vo.getTitle());
			pstmt.setString(1, vo.getContents());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // addData() end
	public Vector<WinnerVO> getAllData() {
		Vector<WinnerVO> vt = new Vector<WinnerVO>();
		sb.setLength(0);
		sb.append("select * from winner ");
		sb.append("order by written_date desc ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bno = rs.getInt(1);
				String title = rs.getString(2);
				String contents = rs.getString(3);
				int status = rs.getInt(4);
				int hits = rs.getInt(5);
				String date = rs.getString(6);
				
				WinnerVO vo = new WinnerVO(bno, status, hits, title, contents, date);
				vt.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vt;
		
	} // getAllData() end
	
	public WinnerVO getSelectedData(int bno) {
		WinnerVO vo = null;
		sb.setLength(0);
		sb.append("select * from winner where bno = ? " );
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			rs= pstmt.executeQuery();
			rs.next();
			
			vo = new WinnerVO(rs.getInt(1), rs.getInt(4), rs.getInt(5), rs.getString(2), rs.getString(3), rs.getString(6));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	} // getSelectedData() end
	
	public void raiseHits(int bno) {
		sb.setLength(0);
		sb.append("update winner set hits = hits+1 where bno = ?");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
