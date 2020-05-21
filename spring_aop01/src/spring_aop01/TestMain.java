package spring_aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// 스프링 설정파일을 불러오려면
		ApplicationContext context = 
				new GenericXmlApplicationContext("app.xml");
		
		CustomerService cs = context.getBean("execute", CustomerService.class); // xml에서 biz에 대한 권한을 execute로 넘겼기 때문에 여기서 바꿔줬음
		cs.printName();
		cs.printEmail();
		// 각 메인업무가 실행되기 전마다 하이재킹
				
	}
}
