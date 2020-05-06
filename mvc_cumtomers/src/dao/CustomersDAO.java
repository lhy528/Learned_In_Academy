package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.OracleXEConnection;
import vo.CustomersVO;

public class CustomersDAO {

	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	public CustomersDAO() {
		conn = OracleXEConnection.getInstance().getConnection();
	}
	
	//사원 정보 등록 메소드
	public void insertCustomers(CustomersVO vo) {
		sb.setLength(0);
		sb.append("insert into customers ");
		sb.append("values (?,?,?,?, sysdate, ? ,?) ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPass());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getLev());
			pstmt.setString(5, vo.getGender());
			pstmt.setString(6, vo.getPhone());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// insertCustomers() end
	
	// 사원 여부, 권한 체크
	public int customerCheck(String id, String pass, String admin) {
		int result = -1;
		sb.setLength(0);
		sb.append("select * from customers ");
		sb.append("where id = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			if(rs.next()){ // id에 값을 넣었더니 값이 있으면
				if(pass.equals(rs.getString("pass")) && admin.equals(rs.getString("lev"))) {
					if(admin.equals("B")) {
						result = 3; // 패스워드가 일치하고 일반사원이면
					}else {
						result = 2; // 패스워드가 일치하고 일반사원이 아니면
					}
				}else { // 비번이 틀리거나 사원유형이 틀렸다
					result = 0;
				}
			}else { // id가 없으면
				result = -1;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	} // customerCheck() end
	
	// login => 사원 정보를 id(pk)를 통해 DBMS에서 가져오기
	public CustomersVO getCustomer(String id) {
		sb.setLength(0);
		sb.append("select * from customers ");
		sb.append("where id = ? " );
		
		CustomersVO vo = null;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			rs.next();
			vo = new CustomersVO(id, rs.getString("pass"), rs.getString("name"), rs.getString("lev"), rs.getString("gender"), rs.getString("phone"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}// getCustomer() end
	
	// 사원 개인정보 수정 - 비밀번호, 전화번호
	public void updateInfo(CustomersVO vo) {
		sb.setLength(0);
		sb.append("update customers ");
		sb.append("set pass = ? , enter = sysdate, phone = ? ");
		sb.append("where id = ? " );
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getPass());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getId());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}// updateInfo() end
	
	// 전체 사원 보기
	public ArrayList<CustomersVO> getAllCustomers(){
		ArrayList<CustomersVO> list = new ArrayList<CustomersVO>();
		
		sb.setLength(0);
		sb.append("select * from customers ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pass = rs.getString(2);
				String name = rs.getString(3);
				String lev = rs.getString(4);
				String enter = rs.getString(5);
				String gender = rs.getString(6);
				String phone = rs.getString(7);
				
				CustomersVO vo = new CustomersVO(id, pass, name, lev, enter, gender, phone);
				list.add(vo);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}//getAllCustomers() end
	
	
	
	
	
	
}







