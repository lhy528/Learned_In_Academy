package spring_web08_db;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DaoController {
	
	@RequestMapping(value = "list.do")
	public ModelAndView show() {
		return new ModelAndView("list", "list", "전체조회 한 ArrayList가 들어옴");
	}
	
	@RequestMapping(value = "view.do")
	public String view(HttpServletRequest req) {
		String data = req.getParameter("no");
//		int deptno = Integer.parseInt(data);
//		dto = dao.selectOne(deptno); // 생략된 코드!
		
		req.setAttribute("dataOne", data);
		return "view";
	}
	
	@RequestMapping(value = "insert.do")
	public ModelAndView insert() {
		return new ModelAndView("insertData", "vo", "DeptDTO가 들어갈 자리");
	}
}
