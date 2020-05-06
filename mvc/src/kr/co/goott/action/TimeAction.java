package kr.co.goott.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeAction {
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		SimpleDateFormat format = new SimpleDateFormat("HH시 mm분 ss초");
		Date time = new Date();
		String time1 = format.format(time);
		
		req.setAttribute("time", time1);
		
		
		return "/time.jsp";
	}
}
