package kr.co.goott.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 회원가입은 하나의 컨트롤러에서 여러가지 일을 해야하므로 annotation처리
public class RegisterController {
	
	@RequestMapping("/register/step1.do")
	public String processStep1() {
		return "step1";
	}
	
	@RequestMapping("/register/step2.do")
	public String processStep2() {
		return "step2";
	}
}
