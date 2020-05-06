package meetDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.OracleXEConnection;
import meetVO.courseBoardVO;

public class courseBoardDAO {
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	public courseBoardDAO() {
		conn = OracleXEConnection.getInstance().getConnection();
	}// 생성자 end
	
	
	// 전체 게시글 조회 - getAllData()
	public ArrayList<courseBoardVO> getAllData(int startNo, int endNo){
		ArrayList<courseBoardVO> list = new ArrayList<courseBoardVO>();
		
		sb.setLength(0);
		sb.append("select * ");
		sb.append("from (select rownum rn,bno,jspname,img_src,img_alt,spotname,star ");
		sb.append("from (select * from courseboard ");
		sb.append("order by bno asc ) ");
		sb.append("where rownum <= ? ) ");
		sb.append("where rn >= ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, endNo);
			pstmt.setInt(2, startNo);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int bno = rs.getInt("bno");
				String jspname = rs.getString("jspname");
				String img_src = rs.getString("img_src");
				String img_alt = rs.getString("img_alt");
				String spotname = rs.getString("spotname");
				int star = rs.getInt("star");
				
				courseBoardVO vo = new courseBoardVO(bno, jspname, img_src, img_alt, spotname, star);
				
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}// getAllData() end
	
	
	
	// 전체 게시글 조회 - getAllData()
	public ArrayList<courseBoardVO> getAllData2(int startNo, int endNo){
		ArrayList<courseBoardVO> list1 = new ArrayList<courseBoardVO>();
		
		sb.setLength(0);
		sb.append("select * ");
		sb.append("from courseboard ");
		sb.append("ORDER BY star desc ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());

			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int bno = rs.getInt("bno");
				String jspname = rs.getString("jspname");
				String img_src = rs.getString("img_src");
				String img_alt = rs.getString("img_alt");
				String spotname = rs.getString("spotname");
				int star = rs.getInt("star");
				
				courseBoardVO vo = new courseBoardVO(bno, jspname, img_src, img_alt, spotname, star);
				
				list1.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list1;
	}// getAllData2() end
	
	
	
	
	// 총 게시물 파악 메소드
	public int getTotalCount2() {
		sb.setLength(0);
		sb.append("select count(*) cnt ");
		sb.append("from courseboard ");		
		
int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			//cnt = rs.getInt(1);   (x)
			cnt = rs.getInt("cnt");		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}//getTotalCount() end
		
	
}
