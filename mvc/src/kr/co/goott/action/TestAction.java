package kr.co.goott.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Model부분
public class TestAction {
	
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("hello", "안녕하세요");// hello는 변수, 안녕하세요는 data(오브젝트까지 가능)
		return "/hello.jsp"; // 컨트롤러에서 메소드를 실행하면 어디로 가고싶은지 주소를 리턴
		
	}
}
