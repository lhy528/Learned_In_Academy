package com.exam.dto;

import java.util.Date;

// Data Transfer Object
public class MemberDTO {

	private String id;
	private String name;
	private String password;
	private Date regdate;
	
	public MemberDTO() {}

	public MemberDTO(String id, String name, String password, Date regdate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.regdate = regdate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	// 로그인 시 비밀번호 check
	public boolean matchPassword(String password) {
		return this.password.equals(password);
	}
	
	
	
}
