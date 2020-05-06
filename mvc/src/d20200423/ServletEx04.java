package d20200423;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


// 서블릿을 작성하는방법 2
// 1. GenericServlet 상속
// 2. service(~req, ~resp) override
// 3. WebServlet annotation

/*+ GenericServlet

: 추상 클래스 이므로 반드시 상속해야 사용할 수 있음.
: 서블릿의 가장 기본이 되는 클래스로써 어떠한 통신 프로토콜을 사용하든
 관계없이 서버의 응용 프로그램 구현 시 활용될 수 있는 클래스.

: HttpServlet이 이 GenericServlet을 상속받은 클래스.
HTTP 프로토콜 기반 기능을 오버라이딩한 클래스.
: HTTP 프로토콜 이외의 FTP, SMTP 등 다른 프로토콜 기반으로 수행되는 서블릿을
작성하려면 GenericServlet을 상속하여 구현.*/


@WebServlet("/service.do")
public class ServletEx04 extends GenericServlet{
	@Override
	public void init() throws ServletException {
		// init() 	: 서블릿이 로딩 시 단 한번 호출
		// 			: 필요한 자원을 할당- 서블릿  초기화
		System.out.println("서블릿이 초기화 될 때 호출");
	}//init() end
	
	@Override
	public void service(ServletRequest req, ServletResponse res) // HTTP 이외의 규약에도 가능
			throws ServletException, IOException {
		// 서블릿이 초기화 된 후 클라이언트로부터 온 요청에 대한 서비스를 수행
		System.out.println("service() 수행 중...");
		res.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
	      out.println("<head>");
	      out.println("<title>Result</title>");
	      out.println("</head>");
	      out.println("<body>service() call : 서비스 메소드 호출 중</body>");
	      out.println("</html>");
	} // service() end
	
	@Override
	public void destroy() {
		// destroy()	: 서블릿 객체가 더이상 필요하지 않게 되면 메모리에서 제거
		System.out.println("서블릿이 메모리에서 제거될 때 호출");
	}
	
}
