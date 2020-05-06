package dao;

import vo.CustomersVO;

public class UnitTest {
	public static void main(String[] args) {
		CustomersDAO dao = new CustomersDAO();
//		사원등록 test
//		int result = dao.customerCheck("idid", "1234", "B");
//		System.out.println("result : "+result);
		
		
//		정보수정 test
		CustomersVO vo = new CustomersVO();
		vo.setId("hong");
		vo.setPass("2222");
		vo.setPhone("010-2222-2222");
		
		dao.updateInfo(vo);
	}
}
