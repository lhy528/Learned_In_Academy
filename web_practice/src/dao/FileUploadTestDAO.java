package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.FileUploadTestVO;
import connection.OracleXEConnection;

public class FileUploadTestDAO {
	
	StringBuffer sb= new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn=null;
	
	public FileUploadTestDAO() {
		conn = OracleXEConnection.getInstance().getConnection(); 
	}
	
	//DBMS에 저장
	public void insertData(FileUploadTestVO vo) {
		sb.setLength(0);
		sb.append("insert into fileuploadtest ");
		sb.append("values (fileuploadtest_fno_seq.nextval,?,?,?,? ) ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContents());
			pstmt.setString(4, vo.getFilePath());
			
			pstmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//insertData() end
	
	public FileUploadTestVO getData(String writer) {
		
		//파일이 복수 개일 가능성이 높으므로 배열에 담도록 수정이 필요함.
		
		
		sb.setLength(0);
		sb.append("select * from fileuploadtest ");
		sb.append("where writer = ? ");
		
		FileUploadTestVO vo =null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, writer);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			vo = new FileUploadTestVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return vo;
		
	}
	
	
	
}
