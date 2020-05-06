package d20200225;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class EmpMain {
	public static void main(String[] args) {
		
	
	//emp table에 있는 모든 사원의 정보를 콘솔에!
	//0.변수 설정
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "scott";
	String password = "tiger";

	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	StringBuffer sb = new StringBuffer();
	
	//1.드라이버 로딩
	
	try {
		Class.forName(driver);
		//2.connection 객체 생성
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("conn 연결 : "+conn);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.out.println("드라이버 로딩 실패");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("connection 실패");
	}
	//3. sql문장
	sb.append("select * from emp ");
	//4. statement 객체
	try {
		pstmt = conn.prepareStatement(sb.toString());
		//5. 실행
		rs= pstmt.executeQuery();
		//6. 레코드별 로직 처리
		while(rs.next()){
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			int mgr = rs.getInt(4);
			String hiredate = rs.getString(5);
			int sal = rs.getInt(6);
			int comm = rs.getInt(7);
			int deptno = rs.getInt(8);
		
		System.out.println(ename +"\t"+empno +"\t"+deptno +"\t"+sal+"\t"+job+"\t");
		
		
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		if(rs!=null) {
			try {
				rs.close();
				if(pstmt !=null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
}