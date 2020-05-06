package d20200422;

import java.io.IOException;
import java.io.PrintWriter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/w20200422/cal.do")
public class ServletEx03 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		String result = "";
		
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		String oper = req.getParameter("oper");
		result = num1+oper+num2;
		
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");

	
		
		PrintWriter out = resp.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Cal Result</title>");
	    out.println("</head>");
	    try {
			out.println("<body><h1>Result : "+engine.eval(result)+"</h1></body>");
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    out.println("</html>");
		
	}// doGet() end
}
