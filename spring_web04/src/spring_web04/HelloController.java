package spring_web04;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Hello, Controller{
	// 외부에서 데이터 받을수 있도록 
	String name;
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String sayHello() {
		
		return "어서오세요 " +name + " 님";
	}

	// Controller 상속
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", sayHello());
		mav.setViewName("hello");
		return mav;
	}
	
}
