package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.Vector;

import connection.OracleXEConnection;
import vo.EventVO;

public class EventDAO {
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	public EventDAO() {
		conn = OracleXEConnection.getInstance().getConnection();
	}
	public void addData(EventVO vo) {
		sb.setLength(0);
		sb.append("insert into board ");
		sb.append("values (event_ongoing_bno_seq.nextval, ?, ?, 0, 0, sysdate, sysdate, sysdate) ");
		
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
	public Vector<EventVO> getAllData() {
		Vector<EventVO> vt = new Vector<EventVO>();
		sb.setLength(0);
		sb.append("select * from event where date_end > sysdate ");
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
				String img_url = rs.getString(7);
				String date_start = rs.getString(8);
				String date_end = rs.getString(9);
				
				EventVO vo = new EventVO(bno, status, hits, title, contents, date, img_url, date_start, date_end);
				vt.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vt;
		
	} // getAllData() end
	public Vector<EventVO> getAllEndedData() {
		Vector<EventVO> vt = new Vector<EventVO>();
		sb.setLength(0);
		sb.append("select * from event where date_end <= sysdate ");
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
				String img_url = rs.getString(7);
				String date_start = rs.getString(8);
				String date_end = rs.getString(9);
				
				EventVO vo = new EventVO(bno, status, hits, title, contents, date, img_url, date_start, date_end);
				vt.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vt;
		
	} // getAllEndedData() end
	
	public EventVO getSelectedData(int bno) {
		EventVO vo = null;
		sb.setLength(0);
		sb.append("select * from event where bno = ? " );
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			rs= pstmt.executeQuery();
			rs.next();
			
			vo = new EventVO(rs.getInt(1), rs.getInt(4), rs.getInt(5), rs.getString(2), 
					rs.getString(3), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	} // getSelectedData() end
	
	public void raiseHits(int bno) {
		sb.setLength(0);
		sb.append("update event set hits = hits+1 where bno = ?");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // raiseHits() end
}
