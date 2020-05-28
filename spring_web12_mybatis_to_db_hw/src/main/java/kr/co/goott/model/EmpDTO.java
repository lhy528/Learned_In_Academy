package kr.co.goott.model;

public class EmpDTO {
	private int empno, sal, deptno;
	private String ename;
	public EmpDTO() {
	}
	
	public EmpDTO(int empno, int sal, int deptno, String ename) {
		super();
		this.empno = empno;
		this.sal = sal;
		this.deptno = deptno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
