package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertFormAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		return "/boardV2/write.jsp";
	}
}
