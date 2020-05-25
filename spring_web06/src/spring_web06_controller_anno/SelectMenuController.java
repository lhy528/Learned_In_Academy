package spring_web06_controller_anno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Controller 인터페이스를 상속받는 방식으로는 한 클래스에서 한가지 일밖에 못하고 있다.
// annotation을 사용하면 여러가지 일 가능

@Controller // 컨트롤러는 Model과 ViewName을 지정해줘야 함
public class SelectMenuController {
	
	@RequestMapping(value = "selectMenu.do") // 매핑에는 여러가지 방법이 있습니다.
	public ModelAndView aaa() {
		return new ModelAndView("menu", "test", "무엇을 먹을까요?"); // 뷰이름 , 모델이름, 모델객체
	}
	
	@RequestMapping(value = "data.do")
	public ModelAndView bbb() {
		return new ModelAndView("menu", "test2", "아무거나 먹죠");
	}
	
	
}
