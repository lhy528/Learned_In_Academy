package d20200309;

import dao.EmpDAO;
import vo.EmpVO;

public class EmpMain {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		
		  EmpVO vo = dao.selectOne(20);
		/* System.out.println(vo.getComm()+"\t"+vo.getDeptno()+"\t"
		 * +vo.getEmpno()+"\t"+vo.getEname()+"\t"+ vo.getHiredate()+"\t"
		 * +vo.getJob()+"\t"+vo.getMgr()+"\t"+vo.getSal()+"\t");
		 */
		
		/*
		 * EmpVO vo1 = new EmpVO(); vo1.setComm(300); vo1.setDeptno(20);
		 * vo1.setEmpno(7777); vo1.setEname("STELLA"); vo1.setHiredate("80/08/08");
		 * vo1.setJob("CLERK"); vo1.setMgr(7777); vo1.setSal(1000);
		 * 
		 * int result = dao.insertOne(vo1); if(result ==1 ) { System.out.println("성공!");
		 * }
		 */
		

		
	}
}
