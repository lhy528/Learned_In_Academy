package spring_app12_conn;

import java.sql.*;

public class OracleDAO implements DAO{
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "scott";
	String password = "tiger";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;		// return 받아옴
	StringBuffer sb = new StringBuffer();
	
	public OracleDAO() {
		// 생성자를 통해서 connection을 열어야 함. -> ConnTest에서 try~복사 붙여넣기
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn: "+conn);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// 생성자 end			-> oracle DB에 연결할 수 있는 DAO가 완성됨
	
	@Override
	public int selectCount() {
		
		sb.setLength(0);
		sb.append("select count(*) cnt ");
		sb.append("from dept ");
		
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();		// select문이니까. Query.
			
			rs.next();
			
			result = rs.getInt("cnt");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
