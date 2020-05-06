package d20200309;

import java.util.Vector;

import dao.DeptDAO;
import vo.DeptVO;

public class DeptMain {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		
		//1건 조회
		//!!!!vo로 넘겨주기로 했으므로 vo로 받아야함 !!!!
//		DeptVO vo = dao.selectOne(10);
//		System.out.println(vo.getDeptno()+"\t"+vo.getDname()+"\t"+vo.getLoc());
		
		System.out.println("--------------------");
		/*
		 * DeptVO vo1 = new DeptVO(); vo1.setDeptno(70); vo1.setDname("영업1");
		 * vo1.setLoc("구로");
		 * 
		 * int result = dao.insertone(vo1); //callbyReference //성공했을때 행동을 하기위해서 리턴형으로 받음
		 * if(result ==1 ) { System.out.println(" 다른일을 수행해  !"); }
		 */
		/*
		 * DeptVO vo2 = new DeptVO(); vo2.setDeptno(50); vo2.setDname("영업2");
		 * vo2.setLoc("재택근무");
		 * 
		 * dao.updateOne(vo2);
		 */
		
//		dao.deletOne(70);
		
		Vector<DeptVO> list = dao.selectAll();
		//array에 vo로 담아서 넘겼으므로
		for(DeptVO vo : list) {		//list를 vo가 담아서 출력 ! 
			System.out.println(
					vo.getDeptno()+"\t"+vo.getDname()+"\t"+vo.getLoc()
					);
		}
	}
}
