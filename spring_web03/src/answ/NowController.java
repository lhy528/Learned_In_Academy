package answ;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class NowController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 현재 시각을 넘겨야 함. 현재시각 구하기.
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd - hh:mm:ss");
		String time = sdf.format(d);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("time", time);
		mav.setViewName("nowTime");
		
		return mav;
	}
	
}
