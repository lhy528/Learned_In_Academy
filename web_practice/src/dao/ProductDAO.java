package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import vo.ProductVO;
import connection.OracleXEConnection;

public class ProductDAO {
	/*
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "scott";
	String password = "tiger";
	*/
	
	//dbms 에 접근할
	
	
	StringBuffer sb = new StringBuffer();
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ProductDAO() {
		/*
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결완료");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("class 오류");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("sql 오류");
		}
		*/
		
		conn = OracleXEConnection.getInstance().getConnection();
		
	}
	
	//상품정보 입력하는 메소드.
	public int addData(ProductVO vo) {
		sb.setLength(0);
		int result = -1;
		sb.append("insert into product ");
		sb.append("values (product_pno_seq.nextval,?,?,?,?,?,?,?)");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getPname());
			pstmt.setInt(2, vo.getPrice());
			pstmt.setInt(3, vo.getDcratio());
			pstmt.setString(4, vo.getProdesc());
			pstmt.setInt(5, vo.getQty());
			pstmt.setString(6, vo.getImgfile());
			pstmt.setString(7, vo.getBigfile());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<ProductVO> getAllData(){
		
		sb.setLength(0);
		sb.append("select * from product");
		
		Vector<ProductVO> list = new Vector<ProductVO>();
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int pno = rs.getInt(1);
				String pname = rs.getString(2);
				int price = rs.getInt(3);
				int dcratio = rs.getInt(4);
				String prodesc = rs.getString(5);
				int qyt = rs.getInt(6);
				String imgfile = rs.getString(7);
				String bigfile = rs.getString(8);
				
				ProductVO vo = new ProductVO();
				
				vo.setPno(pno);
				vo.setPname(pname);
				vo.setPrice(price);
				vo.setDcratio(dcratio);
				vo.setProdesc(prodesc);
				vo.setQty(qyt);
				vo.setImgfile(imgfile);
				vo.setBigfile(bigfile);
				
				list.add(vo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
		
	}//getallData() end
	
	public ProductVO getData(int pno) {
		sb.setLength(0);
		sb.append("select * from product ");
		sb.append("where pno = ? ");
		
		ProductVO vo = new ProductVO();
		
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, pno);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			vo.setPno(rs.getInt(1));
			vo.setPname(rs.getString(2));
			vo.setPrice(rs.getInt(3));
			vo.setDcratio(rs.getInt(4));
			vo.setProdesc(rs.getString(5));
			vo.setQty(rs.getInt(6));
			vo.setImgfile(rs.getString(7));
			vo.setBigfile(rs.getString(8));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return vo;
	}
	
	//개별 상품이름으로 조회. getDataByName()
	
	public ProductVO getDataByName(String pname) {
		sb.setLength(0);
		sb.append("select * from product ");
		sb.append("where pname = ?");
		
		ProductVO vo = new ProductVO();
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, pname);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			vo.setPno(rs.getInt(1));
			vo.setPname(rs.getString(2));
			vo.setPrice(rs.getInt(3));
			vo.setDcratio(rs.getInt(4));
			vo.setProdesc(rs.getString(5));
			vo.setQty(rs.getInt(6));
			vo.setImgfile(rs.getString(7));
			vo.setBigfile(rs.getString(8));
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return vo;
		
	}
	
	//새롭게 추가한 상품의 정보를 변경 - 가격, 할인율, 수량 - modifyData()
	
	
	public void modifyData(int price, int dcratio) {
		sb.setLength(0);
		sb.append("update product ");
		sb.append("set price= ? ,dcratio = ? ");
		sb.append("where pno = (select max(pno) from product)");
		
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, price);
			pstmt.setInt(2, dcratio);
//			pstmt.setInt(3, pno);
			pstmt.executeUpdate();
			
			System.out.println("수정 완료.");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//마지막으로 추가한 상품을 삭제. - deleteData()
	
	public void deleteData(int pno) {
		sb.setLength(0);
		sb.append("delete product ");
		sb.append("where pno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, pno);
			
			pstmt.executeUpdate();
			
			System.out.println(pno+"번 게시물 삭제완료.");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
}
