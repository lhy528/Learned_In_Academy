package ramensignal.java.user.vo;


public class MemberVO {
	
	private int memno;
	private String id;
	private String pw;
	private String name;
	private String regdate;
	
	public MemberVO() {}
	
	public MemberVO(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public MemberVO(int memno, String id, String pw, String name) {
		super();
		this.memno = memno;
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public int getMemno() {
		return memno;
	}

	public void setMemno(int memno) {
		this.memno = memno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
