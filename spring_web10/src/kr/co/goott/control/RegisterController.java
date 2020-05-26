package kr.co.goott.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.goott.dto.MemberDTO;

@Controller // 회원가입은 하나의 컨트롤러에서 여러가지 일을 해야하므로 annotation처리
public class RegisterController {
	
	@RequestMapping("/register/step1.do")
	public String processStep1() {
		return "step1";
	}
	
	@RequestMapping("/register/step2.do")
	public String processStep2(HttpServletRequest req) {
		String chk = req.getParameter("chk");
		if(chk==null) {
			return "step1";
		}else {
			return "step2";			
		}
		
//		return "step2";
	}
	
//	@RequestMapping("/register/step3.do")
//	public String processStep3( // HttpServletRequest로 받아도 되지만 아래 방법으로도 가능하다
//			@RequestParam(value = "no", defaultValue = 0)int no, // 바로 형변환까지 됨
//			@RequestParam(value = "id", defaultValue = "aaa", required = true)String id,
//			@RequestParam(value = "pwd", required = true)String pw,
//			@RequestParam(value = "confirm", required = true)String confirm,
//			@RequestParam(value = "email", required = true)String email,
//			Model model){
//		MemberDTO dto = new MemberDTO(id, pw, confirm, email); // 혹은 setter로
//		
//		// DBMS 접근해서 입력
//		// MysqlDAO dao = new MysqlDAO();
//		// dao.insertOne(dto);
//		
//		model.addAttribute("dto", dto);
//		return "step3";
//	}
	
	@RequestMapping("/register/step3.do")
	public String processStep3(
			@ModelAttribute()MemberDTO dto, Model model) {
		model.addAttribute("dto", dto);
		return "welcome";
	}
	
	@RequestMapping("/main")
	public String processStep4() {
		return "main";
	}
	
	
}
