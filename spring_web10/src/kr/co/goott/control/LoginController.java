package kr.co.goott.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/member/login.do", method = RequestMethod.GET) // 이 주소에 GET방식으로 접근하면 
	public String loginProcess1() {
		return "login/login";
	}
	
	@RequestMapping(value = "/member/login.do", method = RequestMethod.POST) // 이 주소에 POST방식으로 접근하면
	public String loginProcess2() {
		return "main";
	}

}
