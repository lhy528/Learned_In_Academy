package com.exam.service;

import java.util.Date;

import com.exam.dao.MemberDAO;
import com.exam.dto.MemberDTO;

public class JoinService {
	private MemberDAO memberDao = new MemberDAO();
	
	public void join(JoinRequest joinReq) {
		MemberDTO member = memberDao.selectById(joinReq.getId()); // 리퀘스트에서 받은 ID가 DB에 있는지부터 확인해야지
		System.out.println("DAO 호출됨");
		if(member != null) {
			// 같은 id가 존재함
			throw new RuntimeException();
		}
		// if 데이터가 없으면 insert를 수행해라 라는 코드가 필요하다~
		memberDao.insert(new MemberDTO(joinReq.getId(), joinReq.getName(), joinReq.getPassword(), new Date()));
	
	}
	
}
