package spring_web04;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class NowController implements Controller{
	
	public String getTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		String time = sdf.format(d);
		return time;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("time", getTime());
//		mav.setViewName("hello");
		// 줄여씁시다		
		return new ModelAndView("hello", "time", getTime());
		
	}

}
