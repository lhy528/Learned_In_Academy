package spring_web02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("test", "데이터 잘 넘어가나?");	// data
		mav.setViewName("hi");	// view name
		
		return mav;		// ModelAndView를 리턴
	}
	// 컨트롤러에서 작업이 끝남. 프론트 컨트롤러에 등록되어있으면 됨.
}