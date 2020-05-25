package spring_web07;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewMenuController {
	@RequestMapping(value = "viewData.do")
	public ModelAndView show(HttpServletRequest req) {
		String message = req.getParameter("message");
		return new ModelAndView("view", "data", message);
	}
}
