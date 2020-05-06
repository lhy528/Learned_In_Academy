package com.exam.dto;
// member는 회원가입한 사람, user는 로그인한 사람

public class UserDTO {
	private String id;
	private String name;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	
	public UserDTO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
