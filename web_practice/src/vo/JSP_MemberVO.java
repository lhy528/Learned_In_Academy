package vo;

public class JSP_MemberVO {
	//vo : value object : dbms에서 되돌려주는 레코드 1개의 데이터를 담을 수 있는 객체
	//캡슐화 : 변수 : private/method(getter,setter) - public
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String mp;
	private String regdate;
	private String email;
	private int memno;
	
	
	public JSP_MemberVO() {}	//기본생성자 

	public JSP_MemberVO(String id, String pw, String name, String birth, String mp, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.mp = mp;
		this.email = email;
	
	}

	public JSP_MemberVO(String id, String pw, String name, String birth, String mp, String regdate, String email, int memno) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.mp = mp;
		this.regdate = regdate;
		this.email = email;
		this.memno = memno;
	}
	
	//getter,setter
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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getMp() {
		return mp;
	}

	public void setMp(String mp) {
		this.mp = mp;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMemno() {
		return memno;
	}

	public void setMemno(int memno) {
		this.memno = memno;
	}
	
	
}
