package spring_app12_conn;

import java.sql.*;

public class MysqlDAO implements DAO{
	
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/goott7?useSSL=false";
	String user = "scott";
	String password = "tiger";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;		// return 받아옴
	StringBuffer sb = new StringBuffer();
	
	public void init() {
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
	}// init() end
	
	public void close() {
		try {
			conn.close();
			System.out.println("종료 메소드 호출");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// close() end
	
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
